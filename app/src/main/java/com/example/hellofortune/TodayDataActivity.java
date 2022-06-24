package com.example.hellofortune;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class TodayDataActivity extends AppCompatActivity {

    int[] images = new int[] {R.drawable.todaydata_1, R.drawable.todaydata_2,
            R.drawable.todaydata_3, R.drawable.todaydata_4, R.drawable.todaydata_5, R.drawable.todaydata_6,};

    @Override
    protected void onCreate(@Nullable Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_todaydata);

        ImageView randomView = (ImageView)findViewById(R.id.randomdata);
        int imagerandom = (int)(Math.random() * images.length);
        randomView.setBackgroundResource(images[imagerandom]);

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
