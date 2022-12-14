package com.example.group11project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.widget.TextView;

public class SubmissionConfirmedSplashScreen extends AppCompatActivity {
    // Aodan
    TextView reference;
    DatabaseHelper db;
    int refNo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submission_confirmed_splash_screen);
        db = new DatabaseHelper(this);
        refNo = db.getLastRef();


        reference = findViewById(R.id.txtRefNo);
        String s_reference = String.format("REF#%d", refNo);
        reference.setText(s_reference);

        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(SubmissionConfirmedSplashScreen.this, MainActivity.class);
                startActivity(i);
            }
        }, 3000);

    }
}