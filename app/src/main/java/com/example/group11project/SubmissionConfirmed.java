package com.example.group11project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.gms.maps.MapView;

public class SubmissionConfirmed extends AppCompatActivity {

    double lat;
    double lon;
    MapView mapView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submission_confirmed);

        lat = 57.927827;
        lon = -67.93722;




    }
}