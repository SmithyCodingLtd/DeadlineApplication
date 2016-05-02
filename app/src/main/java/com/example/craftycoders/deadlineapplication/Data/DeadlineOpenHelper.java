package com.example.craftycoders.deadlineapplication.Data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by cols3 on 02/05/2016.
 */
public class DeadlineOpenHelper extends SQLiteOpenHelper{

    public static final String DB_NAME = "deadline.db";
    public static final int DATABASE_VERSION = 2;
    private static final String DEADLINE_TABLE_NAME = "deadline";
    private static final String DEADLINE_TABLE_CREATE =
            "CREATE TABLE " + DEADLINE_TABLE_NAME + " (" +
                    KEY_WORD + " TEXT, " +
                    KEY_DEFINITION + " TEXT);";

    //Constructor
    public DeadlineOpenHelper(Context context) {
        super(context, DB_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(DEADLINE_TABLE_CREATE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
