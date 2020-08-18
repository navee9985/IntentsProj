package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    EditText est1,est2;
    Button b1;

    TextView answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent = getIntent();
        String N1 = intent.getStringExtra("No1");
        String N2 = intent.getStringExtra("No2");

        est1 = (EditText)findViewById(R.id.N1);
        est2 = (EditText)findViewById(R.id.N2);

        est1.setText(N1);
        est2.setText(N2);

        b1 = (Button) findViewById(R.id.Add);
        answer = (TextView) findViewById(R.id.answer);

        b1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(est1.getText().toString());
                int num2 = Integer.parseInt(est2.getText().toString());

                int total = num1 + num2;

                answer.setText(num1+" + "+num2+" = "+total);
            }
        });

        est1 = (EditText)findViewById(R.id.N1);
        est2 = (EditText)findViewById(R.id.N2);

        b1 = (Button) findViewById(R.id.Subtract);
        answer = (TextView) findViewById(R.id.answer);

        b1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(est1.getText().toString());
                int num2 = Integer.parseInt(est2.getText().toString());

                int total = num1 - num2;

                answer.setText(num1+" - "+num2+" = "+total);
            }
        });

        est1 = (EditText)findViewById(R.id.N1);
        est2 = (EditText)findViewById(R.id.N2);

        b1 = (Button) findViewById(R.id.Multiply);
        answer = (TextView) findViewById(R.id.answer);

        b1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(est1.getText().toString());
                int num2 = Integer.parseInt(est2.getText().toString());

                int total = num1 * num2;

                answer.setText(num1+" * "+num2+" = "+total);
            }
        });

        est1 = (EditText)findViewById(R.id.N1);
        est2 = (EditText)findViewById(R.id.N2);

        b1 = (Button) findViewById(R.id.Divide);
        answer = (TextView) findViewById(R.id.answer);

        b1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(est1.getText().toString());
                int num2 = Integer.parseInt(est2.getText().toString());

                int total = num1 / num2;

                answer.setText(num1+" / "+num2+" = "+total);
            }
        });

    }
}