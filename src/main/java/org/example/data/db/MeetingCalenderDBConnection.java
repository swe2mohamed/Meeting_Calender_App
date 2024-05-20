package org.example.data.db;

import org.example.Exception.DBConnecetionException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MeetingCalenderDBConnection {
    private static final String DB_NAME = "meting_calender_db";
    private static final String JDBC_URL = "jdbc:mysql://localhost/" + DB_NAME;
    private static final String JDBC_USERNAME = "root";
    private static final String JDBC_PASSWORD = "password";

    public static Connection getConnection() throws DBConnecetionException {
        try{
            return DriverManager.getConnection(JDBC_URL,JDBC_USERNAME, JDBC_PASSWORD);
        }catch (SQLException e){
            throw new DBConnecetionException("Failed to conncect to DB (" + DB_NAME + " )" );
        }
    }


}
