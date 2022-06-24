package com.example.hellofortune;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    private Button btnJoin;
    private EditText userID, userPW, userNM;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        userID = findViewById(R.id.idText);
        userPW = findViewById(R.id.passwordText);
        userNM = findViewById(R.id.nameText);

        btnJoin = findViewById(R.id.joinButton);
        btnJoin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ID = userID.getText().toString();
                String PW = userPW.getText().toString();
                String NM = userNM.getText().toString();

                if(ID.equals("") || PW.equals("") || NM.equals("")){
                    Toast.makeText(getApplicationContext(), "다시 확인해주세요.", Toast.LENGTH_SHORT).show();
                }
                else{
                    show();
                }
            }
        });
    }

    void show(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("회원가입");
        builder.setMessage("회원가입을 축하드립니다!");
        builder.setPositiveButton("확인",
                new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialog, int which) {
                        Intent loginIntent = new Intent(getApplicationContext(), LoginActivity.class);
                        startActivity(loginIntent);
                    }
                });
        builder.show();
    }
}

