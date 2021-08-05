package com.company.utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class DAOConnectionUtility {
    private static Connection connection = null;


    public DAOConnectionUtility() {
    }

    public static Connection getConnection() throws SQLException {
        if (connection == null) {
            ResourceBundle rb = ResourceBundle.getBundle("com/company/utilities/dbconfig");
            final String url = rb.getString("url");
            final String username = rb.getString("username");
            final String password = rb.getString("password");
            connection = DriverManager.getConnection(url, username, password);

        }

        return connection;
    }
}
