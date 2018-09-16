package com.example.aal_ric.simplesecurityapp2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    String userPass = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button btn1 = (Button)findViewById(R.id.btn1);
        Button btn2 = findViewById(R.id.btn2);
        Button btn3 = findViewById(R.id.btn3);
        Button btn4 = findViewById(R.id.btn4);
        Button btn5 = findViewById(R.id.btn5);




        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userPass = userPass + "1";
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userPass = userPass + "2";
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userPass = userPass + "3";
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userPass = userPass + "4";
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("user eneterd string", userPass);

                if(userPass.compareToIgnoreCase("1234") == 0) {
                    Intent intent = new Intent(Main2Activity.this, MainActivity.class);
                    intent.putExtra("FROM_MNAIN2", 1);
                    startActivity(intent);
                } else  {
                    finish();
                }

            }
        });
    }
}
