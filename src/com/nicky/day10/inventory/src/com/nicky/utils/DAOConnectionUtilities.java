package com.nicky.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DAOConnectionUtilities {

    private static Connection connection;
    private static final String URL = "jdbc:mysql://localhost:3306/augusteight";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "0011223344";

    public DAOConnectionUtilities (){

    }

    public static Connection getConnection() throws SQLException {
        if(connection==null){
            //CREATE CONNECTION
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        }
        if(connection.isClosed()){
            System.out.println("Opening a new connection...");
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        }
        return connection;
    }


}
