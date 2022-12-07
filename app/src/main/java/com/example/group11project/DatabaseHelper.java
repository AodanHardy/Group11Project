package com.example.group11project;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DatabaseHelper extends SQLiteOpenHelper {
    // Aodan

    public static final String ISSUE_ID = "issueID";
    public static final String ISSUE_COMMENT = "issueComment";

    public DatabaseHelper(@Nullable Context context) {
        super(context, "Issues.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("Create table issues(issueID int primary key autoincrement, issueComment text, issuePosition text)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("drop table if exists issues");
    }

    public boolean addRow(IssueModel issueModel){
        SQLiteDatabase db = this.getReadableDatabase();
        ContentValues cv = new ContentValues();

        String position = issueModel.getPosition().toString();

        cv.put("comment", issueModel.getComment());
        cv.put("position", position);



        long insert = db.insert("issues", null, cv);
        if (insert == -1){
            return false;

        }else return true;

    }
}
