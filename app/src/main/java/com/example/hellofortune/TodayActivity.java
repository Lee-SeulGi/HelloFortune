package com.example.hellofortune;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import com.google.android.material.internal.EdgeToEdgeUtils;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;
import java.text.SimpleDateFormat;

public class TodayActivity extends AppCompatActivity {

    private Spinner spinner;
    ArrayList<String> arrayList;
    ArrayAdapter<String> arrayAdapter;
    ArrayList<String> arrayList2;
    ArrayAdapter<String> arrayAdapter2;

    Calendar myCalendar = Calendar.getInstance();

    DatePickerDialog.OnDateSetListener myDatePicker = new DatePickerDialog.OnDateSetListener() {
        @Override
        public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
            myCalendar.set(Calendar.YEAR, year);
            myCalendar.set(Calendar.MONTH, month);
            myCalendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
            updateLabel();
        }
    };

    EditText today_Name, birth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_today);

        today_Name = findViewById(R.id.today_Name);
        birth = findViewById(R.id.birth);

        Button correct = (Button) findViewById(R.id.btn_correct);
        correct.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                String name = today_Name.getText().toString();
                String birthday = birth.getText().toString();

                if(name.equals("") || birthday.equals("")){
                    Toast.makeText(getApplicationContext(), "다시 확인하세요.", Toast.LENGTH_SHORT).show();
                }
                else {
                    Intent correctIntent = new Intent(getApplicationContext(), TodayDataActivity.class);
                    startActivity(correctIntent);
                }
            }
        });

        arrayList = new ArrayList<>();
        arrayList.add("자시 23:30~01:30");
        arrayList.add("축시 01:30~03:30");
        arrayList.add("인시 03:30~05:30");
        arrayList.add("묘시 05:30~07:30");
        arrayList.add("진시 07:30~09:30");
        arrayList.add("사시 09:30~11:30");
        arrayList.add("오시 11:30~13:30");
        arrayList.add("미시 13:30~15:30");
        arrayList.add("신시 15:30~17:30");
        arrayList.add("유시 17:30~19:30");
        arrayList.add("술시 19:30~21:30");
        arrayList.add("해시 21:30~23:30");
        arrayList.add("모름");

        arrayAdapter = new ArrayAdapter<>(getApplicationContext(),
                android.R.layout.simple_spinner_dropdown_item
                ,arrayList);

        spinner = (Spinner)findViewById(R.id.spinner);
        spinner.setAdapter(arrayAdapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });

        arrayList2 = new ArrayList<>();
        arrayList2.add("남성");
        arrayList2.add("여성");

        arrayAdapter2 = new ArrayAdapter<>(getApplicationContext(),
                android.R.layout.simple_spinner_dropdown_item
                ,arrayList2);

        spinner = (Spinner)findViewById(R.id.spinner2);
        spinner.setAdapter(arrayAdapter2);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });

        EditText et_Date = (EditText) findViewById(R.id.birth);
        et_Date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new DatePickerDialog(TodayActivity.this, myDatePicker, myCalendar.get(Calendar.YEAR), myCalendar.get(Calendar.MONTH), myCalendar.get(Calendar.DAY_OF_MONTH)).show();
            }
        });
    }

    private void updateLabel() {
        String myFormat = "yyyy/MM/dd";    // 출력형식   2018/11/28
        SimpleDateFormat sdf = new SimpleDateFormat(myFormat, Locale.KOREA);

        EditText et_date = (EditText) findViewById(R.id.birth);
        et_date.setText("  " + sdf.format(myCalendar.getTime()));
        et_date.setTextAlignment(View.TEXT_ALIGNMENT_GRAVITY);
    }


}
