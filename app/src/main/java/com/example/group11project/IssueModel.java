package com.example.group11project;

import com.google.android.gms.maps.model.LatLng;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class IssueModel {
    // Aodan

    private String comment;
    private LatLng position;
    private String date;


    public IssueModel(String comment, LatLng position){
        this.comment = comment;
        this.position = position;
        this.setDate();
    }

    public String getDate() {
        return date;
    }

    public void setDate() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        Date DATE = new Date(System.currentTimeMillis());
        this.date = dateFormat.format(DATE);
    }

    public IssueModel(){}

    public String getComment() {
        return comment;
    }

    public LatLng getPosition() {
        return position;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setPosition(LatLng position) {
        this.position = position;
    }
}
