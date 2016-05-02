package com.example.craftycoders.deadlineapplication;

import android.app.Application;
import android.test.ApplicationTestCase;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.craftycoders.deadlineapplication.Data.DeadlineOpenHelper;
/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class ApplicationTest extends ApplicationTestCase<Application> {
    public ApplicationTest() {
        super(Application.class);
    }

    public void testCreateDB() throws Throwable {

        mContext.deleteDatabase(DeadlineOpenHelper.DB_NAME);

        DeadlineOpenHelper myDBHelper = new DeadlineOpenHelper();
        SQLiteDatabase db = myDBHelper.getWritableDatabase();

        assertEquals(true, db.isOpen());
        db.close();
    }

    public void testDatabaseData() throws Throwable{
        //Query db with cursor
        Cursor cursor = db.query(
                "DEADLINE_TABLE", // Table to Query
                columns,
                null, // Columns for the "where" clause
                null, // Values for the "where" clause
                null, // columns to group by
                null, // columns to filter by row groups
                null // sort order
        )
    }
}