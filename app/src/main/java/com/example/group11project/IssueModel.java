package com.example.group11project;

import com.google.android.gms.maps.model.LatLng;

public class IssueModel {
    // Aodan
    private int id;
    private String comment;
    LatLng position;


    public IssueModel(int id, String comment, LatLng position){
        this.id = id;
        this.comment = comment;
        this.position = position;
    }

    public IssueModel(){}

    public int getId() {
        return id;
    }

    public String getComment() {
        return comment;
    }

    public LatLng getPosition() {
        return position;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPosition(LatLng position) {
        this.position = position;
    }
}
