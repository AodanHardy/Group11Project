package com.example.group11project;

import com.google.android.gms.maps.model.LatLng;

public class IssueModel {
    // Aodan

    private String comment;
    LatLng position;


    public IssueModel(String comment, LatLng position){
        this.comment = comment;
        this.position = position;
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
