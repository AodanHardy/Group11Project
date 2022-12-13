package com.example.group11project;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DatabaseHelper extends SQLiteOpenHelper {
    // Aodan

    public DatabaseHelper(@Nullable Context context) {
        super(context, "Issues.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE \"issues\" (\"issueID\" INTEGER NOT NULL UNIQUE,\"issueComment\"\tTEXT NOT NULL,\"issuePosition\"TEXT NOT NULL,\"issueDate\"TEXT NOT NULL,PRIMARY KEY(\"issueID\" AUTOINCREMENT));");

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("drop table if exists issues");
    }

    public boolean addRow(IssueModel issueModel){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();

        String position = issueModel.getPosition().toString();

        cv.put("issueComment", issueModel.getComment());
        cv.put("issuePosition", position);
        cv.put("issueDate", issueModel.getDate());

        long insert = db.insert("issues", null, cv);
        if (insert == -1){
            return false;

        }else return true;

    }
}
