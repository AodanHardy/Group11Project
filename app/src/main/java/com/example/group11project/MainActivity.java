package com.example.group11project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
    Button openCameraActivity;
    Button openSubmissionList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        openCameraActivity = (Button) findViewById(R.id.btn_newsubmission);
        openSubmissionList = (Button) findViewById(R.id.btn_mysubmissions);

        openCameraActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Camera.class);
                startActivity(i);
            }
        });

        openSubmissionList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, MySubmissions.class);
                startActivity(i);
            }
        });
    }
}