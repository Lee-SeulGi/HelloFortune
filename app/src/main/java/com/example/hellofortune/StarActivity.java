package com.example.hellofortune;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class StarActivity extends AppCompatActivity {

    int[] images = new int[] {R.drawable.stardata_1, R.drawable.stardata_2, R.drawable.stardata_3, R.drawable.stardata_4,
            R.drawable.stardata_5, R.drawable.stardata_6, R.drawable.stardata_7, R.drawable.stardata_8,
            R.drawable.stardata_9, R.drawable.stardata_10, R.drawable.stardata_11, R.drawable.stardata_12,};

    @Override
    protected void onCreate(@Nullable Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_star);

        Button star1 = (Button) findViewById(R.id.starbtn_1);
        Button star2 = (Button) findViewById(R.id.starbtn_2);
        Button star3 = (Button) findViewById(R.id.starbtn_3);
        Button star4 = (Button) findViewById(R.id.starbtn_4);
        Button star5 = (Button) findViewById(R.id.starbtn_5);
        Button star6 = (Button) findViewById(R.id.starbtn_6);
        Button star7 = (Button) findViewById(R.id.starbtn_7);
        Button star8 = (Button) findViewById(R.id.starbtn_8);
        Button star9 = (Button) findViewById(R.id.starbtn_9);
        Button star10 = (Button) findViewById(R.id.starbtn_10);
        Button star11 = (Button) findViewById(R.id.starbtn_11);
        Button star12 = (Button) findViewById(R.id.starbtn_12);

        star1.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                ImageView randomViewStar = (ImageView)findViewById(R.id.stardata);
                int imagerandomstar = (int)(Math.random() * images.length);
                randomViewStar.setBackgroundResource(images[imagerandomstar]);
            }
        });

        star2.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                ImageView randomViewStar = (ImageView)findViewById(R.id.stardata);
                int imagerandomstar = (int)(Math.random() * images.length);
                randomViewStar.setBackgroundResource(images[imagerandomstar]);
            }
        });

        star3.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                ImageView randomViewStar = (ImageView)findViewById(R.id.stardata);
                int imagerandomstar = (int)(Math.random() * images.length);
                randomViewStar.setBackgroundResource(images[imagerandomstar]);
            }
        });

        star4.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                ImageView randomViewStar = (ImageView)findViewById(R.id.stardata);
                int imagerandomstar = (int)(Math.random() * images.length);
                randomViewStar.setBackgroundResource(images[imagerandomstar]);
            }
        });

        star5.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                ImageView randomViewStar = (ImageView)findViewById(R.id.stardata);
                int imagerandomstar = (int)(Math.random() * images.length);
                randomViewStar.setBackgroundResource(images[imagerandomstar]);
            }
        });

        star6.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                ImageView randomViewStar = (ImageView)findViewById(R.id.stardata);
                int imagerandomstar = (int)(Math.random() * images.length);
                randomViewStar.setBackgroundResource(images[imagerandomstar]);
            }
        });

        star7.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                ImageView randomViewStar = (ImageView)findViewById(R.id.stardata);
                int imagerandomstar = (int)(Math.random() * images.length);
                randomViewStar.setBackgroundResource(images[imagerandomstar]);
            }
        });

        star8.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                ImageView randomViewStar = (ImageView)findViewById(R.id.stardata);
                int imagerandomstar = (int)(Math.random() * images.length);
                randomViewStar.setBackgroundResource(images[imagerandomstar]);
            }
        });

        star9.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                ImageView randomViewStar = (ImageView)findViewById(R.id.stardata);
                int imagerandomstar = (int)(Math.random() * images.length);
                randomViewStar.setBackgroundResource(images[imagerandomstar]);
            }
        });

        star10.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                ImageView randomViewStar = (ImageView)findViewById(R.id.stardata);
                int imagerandomstar = (int)(Math.random() * images.length);
                randomViewStar.setBackgroundResource(images[imagerandomstar]);
            }
        });

        star11.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                ImageView randomViewStar = (ImageView)findViewById(R.id.stardata);
                int imagerandomstar = (int)(Math.random() * images.length);
                randomViewStar.setBackgroundResource(images[imagerandomstar]);
            }
        });

        star12.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                ImageView randomViewStar = (ImageView)findViewById(R.id.stardata);
                int imagerandomstar = (int)(Math.random() * images.length);
                randomViewStar.setBackgroundResource(images[imagerandomstar]);
            }
        });

        Button backMunu = (Button) findViewById(R.id.btn_backmenu);
        backMunu.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent backmenuintent = new Intent(getApplicationContext(), MenuActivity.class);
                startActivity(backmenuintent);
            }
        });

    }
}
