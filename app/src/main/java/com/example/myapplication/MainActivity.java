package com.example.myapplication;


import static java.util.Date.parse;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText ADyear;
    EditText Month;
    EditText Data;
    EditText Clock;
    EditText Minute;
    EditText Second;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ADyear = findViewById(R.id.editTextTextPersonName);// 取得目標物件
        Month = findViewById(R.id.editTextTextPersonName2);// 取得目標物件
        Data = findViewById(R.id.editTextTextPersonName3);// 取得目標物件
        Clock = findViewById(R.id.editTextTextPersonName4);// 取得目標物件
        Minute = findViewById(R.id.editTextTextPersonName5);// 取得目標物件
        Second = findViewById(R.id.editTextTextPersonName6);// 取得目標物件

    }

    public void translate(View view) {
        try {
            if (!("".equals(ADyear.getText().toString()))) {
                TextView Display = findViewById(R.id.textView14);
                int ADYEAR = Integer.parseInt(ADyear.getEditableText().toString());
                int MONTH = Integer.parseInt(Month.getEditableText().toString());
                int DATA = Integer.parseInt(Data.getEditableText().toString());
                int CLOCK = Integer.parseInt(Clock.getEditableText().toString());
                int MINUTE = Integer.parseInt(Minute.getEditableText().toString());
                int SECOND = Integer.parseInt(Second.getEditableText().toString());
                Display.setText(ADYEAR + "/" + MONTH + "/" + DATA + "  " + CLOCK + ":" + MINUTE + ":" + SECOND); //Display更改為輸入資料
                if (ADYEAR % 4 == 0) {
                    if (ADYEAR % 100 == 0) {
                        if (ADYEAR % 400 == 0) {
                            TextView leapyear = findViewById(R.id.textView15);
                            leapyear.setText("閏年:是");
                        }
                        else{
                            TextView leapyear = findViewById(R.id.textView15);
                            leapyear.setText("閏年:否");
                        }
                    }
                }
                else{
                    TextView leapyear = findViewById(R.id.textView15);
                    leapyear.setText("閏年:否");
                }
            }
        }
        catch(Exception e){
            Toast.makeText(this, "PLEASE INPUT CORRECT NUMBER", Toast.LENGTH_SHORT).show();
        }

    }
}