package com.example.group11project;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;

public class SubmissionConfirmed extends AppCompatActivity implements OnMapReadyCallback{
    final String GOOGLE_MAP_API_KEY = "AIzaSyD3FAItQMa4nv-8WVuMjFhWmMAcJjTV2bk";
    double lat;
    double lon;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submission_confirmed);
        lat = 57.927827;
        lon = -67.93722;

        SupportMapFragment mapFragment= (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.maps);
        mapFragment.getMapAsync(this);





    }

    @Override
    public void onMapReady(@NonNull GoogleMap googleMap) {

    }
}