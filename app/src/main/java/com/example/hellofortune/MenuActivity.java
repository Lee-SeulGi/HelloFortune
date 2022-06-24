package com.example.hellofortune;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MenuActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Button today = (Button) findViewById(R.id.btn_Today);
        today.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent todayIntent = new Intent(MenuActivity.this, TodayActivity.class);
                MenuActivity.this.startActivity(todayIntent);
            }
        });

        Button taro = (Button) findViewById(R.id.btn_Card);
        taro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent taroIntent = new Intent(MenuActivity.this, TaroActivity.class);
                MenuActivity.this.startActivity(taroIntent);
            }
        });

        Button star = (Button) findViewById(R.id.btn_Star);
        star.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent starIntent = new Intent(MenuActivity.this, StarActivity.class);
                MenuActivity.this.startActivity(starIntent);
            }
        });

        Button sleep = (Button) findViewById(R.id.btn_Sleep);
        sleep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sleepIntent = new Intent(MenuActivity.this, SleepActivity.class);
                MenuActivity.this.startActivity(sleepIntent);
            }
        });

        Button hand = (Button) findViewById(R.id.btn_Hand);
        hand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent handIntent = new Intent(MenuActivity.this, HandActivity.class);
                MenuActivity.this.startActivity(handIntent);
            }
        });

        Button close = (Button) findViewById(R.id.btn_close);
        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MenuActivity.this, "앱 평가 화면으로 이동합니다.", Toast.LENGTH_SHORT).show();

                new AlertDialog.Builder(MenuActivity.this)
                        .setTitle("종료")
                        .setMessage("헬로우운세를 종료하시겠습니까?")
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Intent accessIntent = new Intent(MenuActivity.this, AssessActivity.class);
                                MenuActivity.this.startActivity(accessIntent);
                            }
                        })
                        .setNegativeButton("No", null)
                        .show();
            }
        });
    }

    public void onClick(View view) {
        AlertDialog.Builder ad = new AlertDialog.Builder(MenuActivity.this);
        ad.setTitle("로그아웃");
        ad.setMessage("정말 로그아웃 하시겠습니까?");

        ad.setPositiveButton("확인", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Intent loginIntent = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(loginIntent);
            }
        });
        ad.setNegativeButton("취소", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        ad.show();
    }
}


