package com.example.aal_ric.simplesecurityapp2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int i = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnUnlock = (Button)findViewById(R.id.btnUnlock);
        /*unlockWelcome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), Main2Activity.class );
                startActivity(startIntent);


            }
        });*/

        Intent intent = getIntent();
        int flag = intent.getIntExtra("FROM_MNAIN2", 0);

        if(flag == 1) {
            TextView tvWelcomeMessage = findViewById(R.id.tvWelcomeMessage);
            tvWelcomeMessage.setText("Welcome to the App! The App is UNLOCKED!");
        }

        btnUnlock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(startIntent);

            }
        });
    }
}
