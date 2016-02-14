package com.example.stijn.mrpotatohead2;

import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RelativeLayout;
// Implement OnClickListener to announce it will be used later on.
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    // class properties
    private RelativeLayout buttons, images;

    private CheckBox armsbutton, bodybutton, earsbutton, browsbutton, eyesbutton, glassesbutton,
            hatbutton, mouthbutton, mustachebutton, nosebutton, shoesbutton;

    private ImageView arms, body, ears, eyebrows, eyes, glasses, hat, mouth,
            mustache, nose, shoes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        // call to init method to construct class properties
        init();

    }

    // construct layouts, imageviews, checkboxes and onclicklisteners
    public void init(){

        buttons = (RelativeLayout) findViewById(R.id.buttons);
        images = (RelativeLayout) findViewById(R.id.images);

        body = (ImageView) findViewById(R.id.body);
        arms = (ImageView) findViewById(R.id.arms);
        ears = (ImageView) findViewById(R.id.ears);
        eyebrows = (ImageView) findViewById(R.id.eyebrows);
        eyes = (ImageView) findViewById(R.id.eyes);
        glasses = (ImageView) findViewById(R.id.glasses);
        hat = (ImageView) findViewById(R.id.hat);
        mouth = (ImageView) findViewById(R.id.mouth);
        mustache = (ImageView) findViewById(R.id.mustache);
        nose = (ImageView) findViewById(R.id.nose);
        shoes = (ImageView) findViewById(R.id.shoes);

        bodybutton = (CheckBox) findViewById(R.id.bodybutton);
        armsbutton = (CheckBox) findViewById(R.id.armsbutton);
        earsbutton = (CheckBox) findViewById(R.id.earsbutton);
        browsbutton = (CheckBox) findViewById(R.id.eyebrowsbutton);
        eyesbutton = (CheckBox) findViewById(R.id.eyesbutton);
        glassesbutton = (CheckBox) findViewById(R.id.glassesbutton);
        hatbutton = (CheckBox) findViewById(R.id.hatbutton);
        mouthbutton = (CheckBox) findViewById(R.id.mouthbutton);
        mustachebutton = (CheckBox) findViewById(R.id.mustachebutton);
        nosebutton = (CheckBox) findViewById(R.id.nosebutton);
        shoesbutton = (CheckBox) findViewById(R.id.feetbutton);

        bodybutton.setOnClickListener(this);
        armsbutton.setOnClickListener(this);
        earsbutton.setOnClickListener(this);
        browsbutton.setOnClickListener(this);
        eyesbutton.setOnClickListener(this);
        glassesbutton.setOnClickListener(this);
        hatbutton.setOnClickListener(this);
        mouthbutton.setOnClickListener(this);
        mustachebutton.setOnClickListener(this);
        nosebutton.setOnClickListener(this);
        shoesbutton.setOnClickListener(this);

    }

    // handle orientation rotation
    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }

    // switch entered after click, find corresponding case and change the related image visibility
    @Override
    public void onClick(View v) {

        switch(v.getId()) {
            case R.id.bodybutton:
                if (body.isShown()) {
                    body.setVisibility(View.INVISIBLE);
                }
                else {
                    body.setVisibility(View.VISIBLE);
                }
                break;
            case R.id.armsbutton:
                if (arms.isShown()) {
                    arms.setVisibility(View.INVISIBLE);
                }
                else {
                    arms.setVisibility(View.VISIBLE);
                }
                break;
            case R.id.earsbutton:
                if (ears.isShown()) {
                    ears.setVisibility(View.INVISIBLE);
                }
                else {
                    ears.setVisibility(View.VISIBLE);
                }
                break;
            case R.id.eyesbutton:
                if (eyes.isShown()) {
                    eyes.setVisibility(View.INVISIBLE);
                }
                else {
                    eyes.setVisibility(View.VISIBLE);
                }
                break;
            case R.id.eyebrowsbutton:
                if (eyebrows.isShown()) {
                   eyebrows.setVisibility(View.INVISIBLE);
                }
                else {
                    eyebrows.setVisibility(View.VISIBLE);
                }
                break;
            case R.id.glassesbutton:
                if (glasses.isShown()) {
                    glasses.setVisibility(View.INVISIBLE);
                }
                else {
                    glasses.setVisibility(View.VISIBLE);
                }
                break;
            case R.id.hatbutton:
                if (hat.isShown()) {
                    hat.setVisibility(View.INVISIBLE);
                }
                else {
                   hat.setVisibility(View.VISIBLE);
                }
                break;
            case R.id.mouthbutton:
                if (mouth.isShown()) {
                    mouth.setVisibility(View.INVISIBLE);
                }
                else {
                    mouth.setVisibility(View.VISIBLE);
                }
                break;
            case R.id.mustachebutton:
                if (mustache.isShown()) {
                    mustache.setVisibility(View.INVISIBLE);
                }
                else {
                    mustache.setVisibility(View.VISIBLE);
                }
                break;
            case R.id.nosebutton:
                if (nose.isShown()) {
                    nose.setVisibility(View.INVISIBLE);
                }
                else {
                    nose.setVisibility(View.VISIBLE);
                }
                break;
            case R.id.feetbutton:
                if (shoes.isShown()) {
                    shoes.setVisibility(View.INVISIBLE);
                }
                else {
                    shoes.setVisibility(View.VISIBLE);
                }
                break;
            default:
                break;
        }

    }
}
