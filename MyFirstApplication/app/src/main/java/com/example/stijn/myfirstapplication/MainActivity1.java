package com.example.stijn.myfirstapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity1 extends AppCompatActivity {
    // Properties of the class
    Button rButton;
    Button sButton;
    Button pButton;
    TextView itPlayview;
    TextView result;
    TextView you;
    TextView it;
    int itcount;
    int youcount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);

        // Constructor of the class
        rButton = (Button) findViewById(R.id.rockButton);
        pButton = (Button) findViewById(R.id.paperButton);
        sButton = (Button) findViewById(R.id.scissorButton);
        result = (TextView)findViewById(R.id.outcome);
        itPlayview = (TextView) findViewById(R.id.itPlay);
        you = (TextView) findViewById(R.id.userScore);
        it = (TextView) findViewById(R.id.mobileScore);
        itcount = 0;
        youcount = 0;

        // Methods of the class
        rButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random rand = new Random();
                int n = rand.nextInt(3);
                if (n == 1) {
                    itPlayview.setText("Rock");
                    result.setText("Draw!");
                } else if (n == 2) {
                    itPlayview.setText("Paper");
                    result.setText("Loss!");
                    itcount++;
                    it.setText(String.valueOf(itcount));
                } else {
                    itPlayview.setText("Scissors");
                    result.setText("Win!");
                    youcount++;
                    you.setText(String.valueOf(youcount));
                }
            }
        });

        sButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random rand = new Random();
                int n = rand.nextInt(3);
                if (n == 1) {
                    itPlayview.setText("Rock");
                    result.setText("Loss!");
                    itcount++;
                    it.setText(String.valueOf(itcount));
                } else if (n == 2) {
                    itPlayview.setText("Paper");
                    result.setText("Win!");
                    youcount++;
                    you.setText(String.valueOf(youcount));
                } else {
                    itPlayview.setText("Scissors");
                    result.setText("Draw!");
                }
            }
        });

        pButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random rand = new Random();
                int n = rand.nextInt(3);
                if (n == 1) {
                    itPlayview.setText("Rock");
                    result.setText("Win!");
                    youcount++;
                    you.setText(String.valueOf(youcount));
                } else if (n == 2) {
                    itPlayview.setText("Paper");
                    result.setText("Draw!");
                } else {
                    itPlayview.setText("Scissors");
                    result.setText("Loss!");
                    itcount++;
                    it.setText(String.valueOf(itcount));
                }
            }
        });
    }
}