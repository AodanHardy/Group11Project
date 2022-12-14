package com.example.group11project;

import com.google.android.gms.maps.model.LatLng;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class IssueModel {
    // Aodan
    private int id = 0;
    private String comment;
    private String position;
    private String date;


    public IssueModel(String comment, String position){
        this.comment = comment;
        this.position = position;
        this.setDate();
    }

    public IssueModel(int id, String comment, String position, String date){
        this.id = id;
        this.comment = comment;
        this.position = position;
        this.date = date;
    }

    public String getDate() {
        return date;
    }
    public int getId(){

        return id;
    }

    public void setDate() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        Date DATE = new Date(System.currentTimeMillis());
        this.date = dateFormat.format(DATE);
    }



    public String getComment() {
        return comment;
    }

    public String getPosition() {
        return position;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
