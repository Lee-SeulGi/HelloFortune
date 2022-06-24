package com.example.hellofortune;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class TaroActivity extends AppCompatActivity {

    int[] images = new int[] {R.drawable.tarocard_1, R.drawable.tarocard_2,
            R.drawable.tarocard_3, R.drawable.tarocard_4, R.drawable.tarocard_5, R.drawable.tarocard_6,
            R.drawable.tarocard_7, R.drawable.tarocard_8 };

    @Override
    protected void onCreate(@Nullable Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_taro);

        Button taro1 = (Button) findViewById(R.id.btn_taro1);
        Button taro2 = (Button) findViewById(R.id.btn_taro2);
        Button taro3 = (Button) findViewById(R.id.btn_taro3);
        Button taro4 = (Button) findViewById(R.id.btn_taro4);
        Button taro5 = (Button) findViewById(R.id.btn_taro5);
        Button taro6 = (Button) findViewById(R.id.btn_taro6);
        Button taro7 = (Button) findViewById(R.id.btn_taro7);
        Button taro8 = (Button) findViewById(R.id.btn_taro8);
        Button taro9 = (Button) findViewById(R.id.btn_taro9);

        taro1.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                ImageView randomViewTaro = (ImageView)findViewById(R.id.randomtaro);
                int imagerandomtaro = (int)(Math.random() * images.length);
                randomViewTaro.setBackgroundResource(images[imagerandomtaro]);
            }
        });

        taro2.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                ImageView randomViewTaro = (ImageView)findViewById(R.id.randomtaro);
                int imagerandomtaro = (int)(Math.random() * images.length);
                randomViewTaro.setBackgroundResource(images[imagerandomtaro]);
            }
        });

        taro3.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                ImageView randomViewTaro = (ImageView)findViewById(R.id.randomtaro);
                int imagerandomtaro = (int)(Math.random() * images.length);
                randomViewTaro.setBackgroundResource(images[imagerandomtaro]);
            }
        });

        taro4.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                ImageView randomViewTaro = (ImageView)findViewById(R.id.randomtaro);
                int imagerandomtaro = (int)(Math.random() * images.length);
                randomViewTaro.setBackgroundResource(images[imagerandomtaro]);
            }
        });

        taro5.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                ImageView randomViewTaro = (ImageView)findViewById(R.id.randomtaro);
                int imagerandomtaro = (int)(Math.random() * images.length);
                randomViewTaro.setBackgroundResource(images[imagerandomtaro]);
            }
        });

        taro6.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                ImageView randomViewTaro = (ImageView)findViewById(R.id.randomtaro);
                int imagerandomtaro = (int)(Math.random() * images.length);
                randomViewTaro.setBackgroundResource(images[imagerandomtaro]);
            }
        });

        taro7.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                ImageView randomViewTaro = (ImageView)findViewById(R.id.randomtaro);
                int imagerandomtaro = (int)(Math.random() * images.length);
                randomViewTaro.setBackgroundResource(images[imagerandomtaro]);
            }
        });

        taro8.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                ImageView randomViewTaro = (ImageView)findViewById(R.id.randomtaro);
                int imagerandomtaro = (int)(Math.random() * images.length);
                randomViewTaro.setBackgroundResource(images[imagerandomtaro]);
            }
        });

        taro9.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                ImageView randomViewTaro = (ImageView)findViewById(R.id.randomtaro);
                int imagerandomtaro = (int)(Math.random() * images.length);
                randomViewTaro.setBackgroundResource(images[imagerandomtaro]);
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
