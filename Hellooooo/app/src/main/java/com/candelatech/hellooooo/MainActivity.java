package com.candelatech.hellooooo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText num1, num2;
    private Button add;
    private TextView answer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = (EditText)findViewById(R.id.num1);
        num2 = (EditText)findViewById(R.id.num2);
        add = (Button) findViewById(R.id.sumbtn);
        answer = (TextView) findViewById(R.id.result);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number1 = num1.getText().toString();
                String number2 = num2.getText().toString();
                if (number1.length() > 0 && number2.length() > 0){
                    int sum = Integer.parseInt(number1) + Integer.parseInt(number2);
                    answer.setText("Answer: " + String.valueOf(sum));
                }
                else{
                    answer.setText("Invalid Input ");
                }
            }
        });

    }
}