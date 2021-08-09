package com.nicky.DAO;

import com.nicky.model.Customer;
import com.nicky.utils.DAOConnectionUtilities;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class CustomerDAOImpl implements CustomerDAO {
    static PreparedStatement ps;
    Connection connection = null;

    public CustomerDAOImpl() {
        try {
            this.connection = DAOConnectionUtilities.getConnection();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void addCustomer(Customer customer) throws SQLException {
        //sql query
        String sql = "INSERT INTO customer (customer_id, cust_name, city, grade, salesman_id) VALUES (?, ?, ?, ?, ?)";

        //make connection and prepare the query
        ps = connection.prepareStatement(sql);

        //insert java parameters into query
        ps.setInt(1, customer.getCustomer_id());
        ps.setString(2, customer.getCustomer_name());
        ps.setString(3, customer.getCity());
        ps.setInt(4, customer.getGrade());
        ps.setInt(5, customer.getSalesman_id());

        //execute query and get a count to relay one of the corresponding messages
        int count = ps.executeUpdate();
        if (count > 0) {
            System.out.println("Customer Saved!");
        } else {
            System.out.println("Have you tried turning it on and off again?");
        }
    }

    @Override
    public void updateCustomer(Customer customer) throws SQLException {
        //sql query
        String sql = "UPDATE customer SET cust_name = ?, city = ?, grade = ?, salesman_id = ? WHERE customer_id = ?";
        //prepare query via connection
        ps = connection.prepareStatement(sql);

        //set customer name, city, grade, salesman id
        ps.setString(1, customer.getCustomer_name());
        ps.setString(2, customer.getCity());
        ps.setInt(3, customer.getGrade());
        ps.setInt(4, customer.getSalesman_id());
        //where id is customer id
        ps.setInt(5, customer.getCustomer_id());

        //execute and relay message
        int count = ps.executeUpdate();
        if (count > 0) {
            System.out.println("Customer updated.");
        } else {
            System.out.println("The developer's dog ate their keyboard, please send new keyboard to the developer.");
        }
    }

    @Override
    public void deleteCustomer(int id) throws SQLException {

        String sql = "DELETE FROM customer WHERE customer_id = ?";

        ps = connection.prepareStatement(sql);
        ps.setInt(1, id);
        ps.executeUpdate();
    }

    @Override
    public List<Customer> getCustomer() throws SQLException {
        List<Customer> customerList = new ArrayList<>();
        //select all columns from customer
        String sql = "SELECT * FROM customer";
        ps = connection.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            Customer customer = new Customer();
            customer.setCustomer_id(rs.getInt("customer_id"));
            customer.setCustomer_name(rs.getString("cust_name"));
            customer.setCity(rs.getString("city"));
            customer.setGrade(rs.getInt("grade"));
            customer.setSalesman_id(rs.getInt("salesman_id"));
            customerList.add(customer);
        }
        return customerList;
    }

    @Override
    public Customer customerByID(int id) throws SQLException {
        String sql = "SELECT * FROM customer WHERE customer_id = ?";
        ps = connection.prepareStatement(sql);
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();

        //create customer obj to send back to console
        Customer customer = new Customer();
        if (rs.next()) {
            customer.setCustomer_id(rs.getInt("customer_id"));
            customer.setCustomer_name(rs.getString("cust_name"));
            customer.setCity(rs.getString("city"));
            customer.setGrade(rs.getInt("grade"));
            customer.setSalesman_id(rs.getInt("salesman_id"));
        } else {
            System.out.println("It broke somewhere, go fix it!");
        }
        return customer;

    }
}
