package com.example.group11project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.widget.TextView;

public class SubmissionConfirmedSplashScreen extends AppCompatActivity {
    TextView reference;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submission_confirmed_splash_screen);




        reference = findViewById(R.id.txtSplashScreenReference);
        reference.setText("test");

        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(SubmissionConfirmedSplashScreen.this, MainActivity.class);
                startActivity(i);

            }
        }, 3000);


    }
}