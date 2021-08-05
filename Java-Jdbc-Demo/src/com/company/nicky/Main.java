package com.company.nicky;

import javax.xml.transform.Result;
import java.sql.*;


public class Main {

    public static void main(String[] args) throws SQLException {
        //load the driver
        //Class.forName(jdbc:mysql://localhost3306/revature);

        //step2: create connection obj
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/revature", "root", "Chinky127!");

        //step 3: create statement object
        Statement statement = connection.createStatement();

        //step4: execute query
        ResultSet resultSet = statement.executeQuery("SELECT * FROM employee");
        while (resultSet.next()) {
            System.out.println("id: " + resultSet.getInt(1)
                    + ", Name: " + resultSet.getString(2) + ", Email: "
                    + resultSet.getString(3));
        }
        //step 5 close the connection
        connection.close();
    }
}

