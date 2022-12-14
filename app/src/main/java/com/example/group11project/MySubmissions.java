package com.example.group11project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.android.gms.maps.model.LatLng;

import java.util.ArrayList;

public class MySubmissions extends AppCompatActivity {
    ListView listView;
    ArrayList<IssueModel>issues;
    DatabaseHelper db;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_submissions);

        listView = findViewById(R.id.lst_mysubmissions);

        issues = new ArrayList<IssueModel>();

        db = new DatabaseHelper(this);

        issues = db.getArrayOfIssues();
        fillListView();

    }

    public void fillListView(){
        CustomAdapter customAdapter= new CustomAdapter(MySubmissions.this, issues);
        listView.setAdapter(customAdapter);
    }


}

