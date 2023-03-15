package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText number1;
    private EditText number2;
    private TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number1 = findViewById(R.id.editNumber1);
        number2 = findViewById(R.id.editNumber2);
        resultText = findViewById(R.id.resultText);
    }

    public void add(View view){
        int nro1 = Integer.parseInt(String.valueOf(number1.getText()));
        int nro2 = Integer.parseInt(String.valueOf(number2.getText()));

        resultText.setText(String.valueOf(nro1+nro2));
    }

    public void decrease(View view){
        int nro1 = Integer.parseInt(String.valueOf(number1.getText()));
        int nro2 = Integer.parseInt(String.valueOf(number2.getText()));
        resultText.setText(String.valueOf(nro1-nro2));
    }

    public void multiply(View view){
        int nro1 = Integer.parseInt(String.valueOf(number1.getText()));
        int nro2 = Integer.parseInt(String.valueOf(number2.getText()));
        resultText.setText(String.valueOf(nro1*nro2));
    }

    public void divide(View view){
        int nro1 = Integer.parseInt(String.valueOf(number1.getText()));
        int nro2 = Integer.parseInt(String.valueOf(number2.getText()));
        if (nro2 == 0) {
            resultText.setText("Cannot divide by zero");
        } else if (nro1 % nro2 != 0){
            double div = (double) nro1/nro2;
            resultText.setText(String.valueOf(div));
        } else {
            resultText.setText(String.valueOf(nro1/nro2));
        }
    }

}