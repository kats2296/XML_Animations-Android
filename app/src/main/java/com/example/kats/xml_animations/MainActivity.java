package com.example.kats.xml_animations;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button fade_in , fade_out, zoom_in, zoom_out , slide_up , slide_down , move , rotate , blink , bounce;
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        image = findViewById(R.id.imageView);

        fade_in = findViewById(R.id.fade_in);
        fade_out = findViewById(R.id.fade_out);
        zoom_in = findViewById(R.id.zoom_in);
        zoom_out = findViewById(R.id.zoom_out);
        slide_up = findViewById(R.id.slide_up);
        slide_down = findViewById(R.id.slide_down);
        move = findViewById(R.id.move);
        rotate = findViewById(R.id.rotate);
        blink = findViewById(R.id.blink);
        bounce = findViewById(R.id.bounce);


        fade_in.setOnClickListener(this);
        fade_out.setOnClickListener(this);

        zoom_in.setOnClickListener(this);
        zoom_out.setOnClickListener(this);

        slide_up.setOnClickListener(this);
        slide_down.setOnClickListener(this);

        move.setOnClickListener(this);
        rotate.setOnClickListener(this);

        bounce.setOnClickListener(this);
        blink.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case  R.id.fade_in:
                Animation fadeinAnim = AnimationUtils.loadAnimation(getApplicationContext(),
                        R.anim.fade_in);
                image.startAnimation(fadeinAnim);
                break;

            case R.id.fade_out:
                Animation fadeoutAnim = AnimationUtils.loadAnimation(getApplicationContext(),
                        R.anim.fade_out);
                image.startAnimation(fadeoutAnim);
                break;

            case R.id.zoom_in:
                Animation zoomInAnim = AnimationUtils.loadAnimation(getApplicationContext(),
                        R.anim.zoom_in);
                image.startAnimation(zoomInAnim);
                break;

            case R.id.zoom_out:
                Animation zoomOutAnim = AnimationUtils.loadAnimation(getApplicationContext(),
                        R.anim.zoom_out);
                image.startAnimation(zoomOutAnim);
                break;

            case R.id.slide_up:
                Animation slideUpAnim = AnimationUtils.loadAnimation(getApplicationContext(),
                        R.anim.slide_up);
                image.startAnimation(slideUpAnim);
                break;

            case R.id.slide_down:
                Animation slideDownAnim = AnimationUtils.loadAnimation(getApplicationContext(),
                        R.anim.slide_down);
                image.startAnimation(slideDownAnim);
                break;

            case R.id.move:
                Animation moveAnim = AnimationUtils.loadAnimation(getApplicationContext(),
                        R.anim.move);
                image.startAnimation(moveAnim);
                break;

            case R.id.rotate:
                Animation rotateAnim = AnimationUtils.loadAnimation(getApplicationContext(),
                        R.anim.rotate);
                image.startAnimation(rotateAnim);
                break;


            case R.id.blink:
                Animation blinkAnim = AnimationUtils.loadAnimation(getApplicationContext(),
                        R.anim.blink);
                image.startAnimation(blinkAnim);
                break;


            case R.id.bounce:
                Animation bounceAnim = AnimationUtils.loadAnimation(getApplicationContext(),
                        R.anim.bounce);
                image.startAnimation(bounceAnim);
                break;

        }
    }
}
