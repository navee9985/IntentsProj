package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        final EditText editTxt1 = (EditText)  findViewById(R.id.Number1);
        final EditText editTxt2 = (EditText)  findViewById(R.id.Number2 );
        Button  button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = getApplicationContext(); //The context to use. Usually your Application or Activity object
                CharSequence message = "You just clicked the OK Button";
                //Display string
                int duration = Toast.LENGTH_SHORT; //How long the toast message will lasts
                Toast toast = Toast.makeText(context, message, duration);
                toast.setGravity(Gravity.BOTTOM|Gravity.CENTER, 0, 0);
                toast.show();


                String Num1 = editTxt1.getText().toString() ;
                String Num2 = editTxt2.getText().toString() ;
                Intent intent = new Intent(FirstActivity.this,SecondActivity.class) ;
                intent.putExtra("No1",Num1);
                intent.putExtra("No2",Num2);
                startActivity(intent);
            }

        });
    }



}