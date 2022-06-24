package com.example.hellofortune;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class AssessActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assess);

        Button send = (Button) findViewById(R.id.btn_report);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new AlertDialog.Builder(AssessActivity.this)
                        .setTitle("앱 평가")
                        .setMessage("제출하시겠습니까? \n(예를 누르시면 앱 평가 제출 후, \n바로 종료됩니다.)")

                        .setPositiveButton("예", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                finishAffinity();
                                System.runFinalization();
                                System.exit(0);
                            }
                        })

                        .setNegativeButton("아니요", null)
                        .show();
            }
        });
    }
}
