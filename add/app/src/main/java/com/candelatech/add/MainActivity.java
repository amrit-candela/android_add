package com.candelatech.add;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText num1, num2;
    private TextView result;
    private Button add, sub, mul, div, mod, sqr;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = (EditText)findViewById(R.id.num1);
        num2 = (EditText)findViewById(R.id.num2);
        add = (Button)findViewById(R.id.add);
        sub = (Button)findViewById(R.id.sub);
        mul = (Button)findViewById(R.id.mul);
        div = (Button)findViewById(R.id.div);
        mod = (Button)findViewById(R.id.mod);
        sqr = (Button)findViewById(R.id.sqr);

        result = (TextView)findViewById(R.id.answer);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (num1.getText().toString().length() > 0 && num2.getText().toString().length() > 0){
                    int number1 = Integer.parseInt(num1.getText().toString());
                    int number2 = Integer.parseInt(num2.getText().toString());
                    int answer = number1 + number2;
                    result.setText("SUM: "+ answer);
                }
                else {
                    result.setText("Invalid Input");
                }
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (num1.getText().toString().length() > 0 && num2.getText().toString().length() > 0){
                    int number1 = Integer.parseInt(num1.getText().toString());
                    int number2 = Integer.parseInt(num2.getText().toString());
                    int answer = number1 - number2;
                    result.setText("DIFFRENCE: "+ answer);
                }
                else {
                    result.setText("Invalid Input");
                }

            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (num1.getText().toString().length() > 0 && num2.getText().toString().length() > 0){
                    int number1 = Integer.parseInt(num1.getText().toString());
                    int number2 = Integer.parseInt(num2.getText().toString());
                    int answer = number1 * number2;
                    result.setText("MULTIPLICATION: "+ answer);
                }
                else {
                    result.setText("Invalid Input");
                }

            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (num1.getText().toString().length() > 0 && num2.getText().toString().length() > 0){
                    int number1 = Integer.parseInt(num1.getText().toString());
                    int number2 = Integer.parseInt(num2.getText().toString());
                    int answer = number1 / number2;
                    result.setText("DIVISION: "+ answer);
                }
                else {
                    result.setText("Invalid Input");
                }

            }
        });


        mod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (num1.getText().toString().length() > 0 && num2.getText().toString().length() > 0){
                    int number1 = Integer.parseInt(num1.getText().toString());
                    int number2 = Integer.parseInt(num2.getText().toString());
                    int answer = number1 % number2;
                    result.setText("REMAINDER: "+ answer);
                }
                else {
                    result.setText("Invalid Input");
                }
            }
        });

        sqr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (num1.getText().toString().length() > 0 && num2.getText().toString().length() > 0){
                    int number1 = Integer.parseInt(num1.getText().toString());
                    int number2 = Integer.parseInt(num2.getText().toString());
                    int answer = number1 * number1;
                    result.setText("SQUARE: "+ answer);
                }
                else {
                    result.setText("Invalid Input");
                }
            }
        });
    }
}