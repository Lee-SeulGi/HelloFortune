package com.example.hellofortune;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.Spanned;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.regex.Pattern;

public class LoginActivity extends AppCompatActivity {

    EditText idtext, passwordtext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        idtext = findViewById(R.id.idText);
        passwordtext = findViewById(R.id.passwordText);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String id = idtext.getText().toString();
                String password = passwordtext.getText().toString();

                if(id.equals("") || password.equals("")){
                    Toast.makeText(getApplicationContext(), "아이디와 비밀번호를 다시 입력하세요.", Toast.LENGTH_SHORT).show();
                }
                else if(id.equals("admin") && password.equals("1234")){
                    Toast.makeText(getApplicationContext(), "로그인 되었습니다.", Toast.LENGTH_SHORT).show();

                    Intent menuIntent = new Intent(getApplicationContext(), MenuActivity.class);
                    startActivity(menuIntent);
                }
                else if(id != "admin" || password != "1234"){
                    Toast.makeText(getApplicationContext(), "정보가 없습니다. 가입을 진행해주세요.", Toast.LENGTH_SHORT).show();
                }
            }
        };

        Button btnLogin = (Button) findViewById(R.id.btn_login);
        btnLogin.setOnClickListener(listener);

        TextView registerButton = (TextView) findViewById(R.id.registerButton);
        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(LoginActivity.this, RegisterActivity.class);
                LoginActivity.this.startActivity(registerIntent);
            }
        });
    }

}