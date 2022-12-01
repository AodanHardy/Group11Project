package com.example.group11project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class SubmissionConfirmed extends AppCompatActivity {

    double lat;
    double lon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submission_confirmed);

        lat = 57.927827;
        lon = -67.93722;


    }
}