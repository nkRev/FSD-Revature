package com.company;

import java.sql.*;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Executor;

import static java.lang.String.format;

public class Main {

    public static void main(String[] args) throws SQLException {
	// write your code here

        //step 1: load the driver
        try{
            Class.forName("com.mysql.jdbc.Driver");

        }catch(ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
        String host = "jdbc:mysql://localhost:3306/";
        String database = "revature";
        String connectionStr= host+database;
        String username= "root";
        String password = "0011223344";
        //step 2 create connection
        Connection connection = DriverManager.getConnection(connectionStr, username, password);

        //step 3 create statement obj
        Statement statement = connection.createStatement();

        //DEMO1: create a table
//        String query = "Create table employeeDemo (id INTEGER PRIMARY KEY AUTO_INCREMENT, name char(50), email char(50))";
//        statement.executeUpdate(query);
//        System.out.println("Table created");

        //DEMO2: insert data into our table
        String query = "insert into employeeDemo(name, email) values (?, ?)";

        //get prepared statement obj
        PreparedStatement ps = connection.prepareStatement(query);
        //set the values to query;
        ps.setString(1, "mark smith");
        ps.setString(2, "m@gmail.com");
//        ps.setString(1, "nicky k");
//        ps.setString(2, "nk@gmailcom");
//        ps.setString(1, "alex a");
//        ps.setString(2, "AA@gmail.com");
        //execute query
        int rowsAffected = ps.executeUpdate();
        System.out.println(rowsAffected + " are affected");


        //DEMO3: update data of our table
//        String query = "update employeeDemo set name = ?, email = ? where id = ?";
//        PreparedStatement ps = connection.prepareStatement(query);
//        ps.setString(1,"paul");
//        ps.setString(2, "p@gmail.com");
//        ps.setInt(3, 1);
//        int rowsAffected = ps.executeUpdate();
//        System.out.println(rowsAffected + " rows affected");


         //DEMO4
//        String query = "delete from employeedemo where id = ?";
//        PreparedStatement ps = connection.prepareStatement(query);
//        ps.setInt(1, 1);
//        int rowAffected = ps.executeUpdate();
//        System.out.println(rowAffected + " rows affected");



        //DEMO5
        String sql = "Select * from employeeDemo";

        ResultSet rs = statement.executeQuery(sql);

        while(rs.next()){
            int id = rs.getInt("id");
            String name = rs.getString("name");
            String email = rs.getString("email");

            System.out.printf("id: %d, Name: %s, Email: %s%n", id, name, email);
        }

        if(connection.isClosed()){
            System.out.println("Connection closed");
        }else{
            System.out.println("Connection is open");
        }

        connection.close();
    }
}
