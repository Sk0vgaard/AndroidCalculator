package com.example.skovgaard.calculator_v20;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView result;
    EditText firstNumber, secondNumber;
    Button addBtn, substractBtn, multiplyBtn, divideBtn;

    double result_num;
    double num1, num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result = findViewById(R.id.result);



        firstNumber = findViewById(R.id.firstNumber);
        secondNumber = findViewById(R.id.secondNumber);

        addBtn = findViewById(R.id.addBtn);
        substractBtn = findViewById(R.id.substractBtn);
        multiplyBtn = findViewById(R.id.multiplyBtn);
        divideBtn = findViewById(R.id.divideBtn);

        //Add function.
        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Integer.parseInt(firstNumber.getText().toString());
                num2 = Integer.parseInt(secondNumber.getText().toString());

                result_num = num1 + num2;

                result.setText(String.valueOf(result_num));
            }
        });

        //Substract function.
        substractBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Integer.parseInt(firstNumber.getText().toString());
                num2 = Integer.parseInt(secondNumber.getText().toString());

                result_num = num1 - num2;

                result.setText(String.valueOf(result_num));
            }
        });

        //divide function.
        divideBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Integer.parseInt(firstNumber.getText().toString());
                num2 = Integer.parseInt(secondNumber.getText().toString());

                result_num = num1 / num2;

                result.setText(String.valueOf(result_num));
            }
        });

        //Multiply function.
        multiplyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Integer.parseInt(firstNumber.getText().toString());
                num2 = Integer.parseInt(secondNumber.getText().toString());

                result_num = num1 * num2;

                result.setText(String.valueOf(result_num));
            }
        });
    }
}
