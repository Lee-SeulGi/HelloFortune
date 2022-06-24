package com.example.hellofortune;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class HandActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_hand);

        Button feeling  = (Button) findViewById(R.id.feeling);
        feeling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView feelingdata = (ImageView)findViewById(R.id.handdata);
                feelingdata.setVisibility(View.VISIBLE);
                feelingdata.setBackgroundResource(R.drawable.feeling_data);
            }
        });

        Button heart  = (Button) findViewById(R.id.heart);
        heart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView heartdata = (ImageView)findViewById(R.id.handdata);
                heartdata.setVisibility(View.VISIBLE);
                heartdata.setBackgroundResource(R.drawable.heart_data);
            }
        });

        Button win  = (Button) findViewById(R.id.win);
        win.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView windata = (ImageView)findViewById(R.id.handdata);
                windata.setVisibility(View.VISIBLE);
                windata.setBackgroundResource(R.drawable.win_data);
            }
        });

        Button job  = (Button) findViewById(R.id.job);
        job.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView jobdata = (ImageView)findViewById(R.id.handdata);
                jobdata.setVisibility(View.VISIBLE);
                jobdata.setBackgroundResource(R.drawable.job_data);
            }
        });

        Button backData = (Button) findViewById(R.id.btn_backdata);
        backData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView handdata = (ImageView)findViewById(R.id.handdata);
                handdata.setVisibility(View.INVISIBLE);
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
