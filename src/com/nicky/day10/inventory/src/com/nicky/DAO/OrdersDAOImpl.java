package com.nicky.DAO;

import com.nicky.model.Orders;
import com.nicky.utils.DAOConnectionUtilities;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class OrdersDAOImpl implements OrdersDAO {
    static PreparedStatement ps;
    Connection connection = null;

    public OrdersDAOImpl() {
        try {
            connection = DAOConnectionUtilities.getConnection();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void addOrder(Orders order) throws SQLException {

        String sql = "INSERT INTO orders (ord_no, purch_amt, ord_date, customer_id, salesman_id) VALUES (?, ? ,?, ?, ?)";
        //prepare query
        ps = connection.prepareStatement(sql);
        //insert into query's '?'
        ps.setInt(1, order.getOrd_no());
        ps.setDouble(2, order.getPurch_amt());
        ps.setDate(3, order.getOrd_date());
        ps.setInt(4, order.getCustomer_id());
        ps.setInt(5, order.getSalesman_id());

        //execute
        int count = ps.executeUpdate();
        if (count > 0) {
            System.out.println("Order added");
        } else {
            System.out.println("Uh. Oh. Order did not save.");
        }
    }

    @Override
    public void updateOrder(Orders order) throws SQLException {
        String sql = "UPDATE orders SET purch_amt = ?, ord_date = ?, customer_id = ?, salesman_id = ? WHERE ord_no = ?";
        ps = connection.prepareStatement(sql);
        //set purch_amt, ord_date, customer_id, salesman_id
        ps.setDouble(1, order.getPurch_amt());
        ps.setDate(2, order.getOrd_date());
        ps.setInt(3, order.getCustomer_id());
        ps.setInt(4, order.getSalesman_id());
        //where ord_no = "?"
        ps.setInt(5, order.getOrd_no());
        int count = ps.executeUpdate();
        if (count > 0) {
            System.out.println("Order updated.");
        } else {
            System.out.println("Not again. Go fix your query.");
        }
    }

    @Override
    public void deleteOrder(int id) throws SQLException {
        String sql = "DELETE FROM orders where ord_no = ?";
        ps = connection.prepareStatement(sql);
        ps.setInt(1, id);

        int count = ps.executeUpdate();
        if (count > 0) {
            System.out.println("Order was successfully deleted!");
        } else {
            System.out.println("Something went wrong. Please try again or contact the developer");
        }
    }

    @Override
    public List<Orders> getOrders() throws SQLException {
        List<Orders> ordersList = new ArrayList<>();
        String sql = "SELECT * FROM orders";
        ps = connection.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            Orders order = new Orders();
            order.setOrd_no(rs.getInt("ord_no"));
            order.setPurch_amt(rs.getDouble("purch_amt"));
            order.setOrd_date(rs.getDate("ord_date"));
            order.setCustomer_id(rs.getInt("customer_id"));
            order.setSalesman_id(rs.getInt("salesman_id"));

            ordersList.add(order);
        }
        return ordersList;
    }

    @Override
    public Orders showOrderByID(int id) throws SQLException {
        String sql = "SELECT * FROM orders WHERE ord_no = ?";
        ps = connection.prepareStatement(sql);
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();

        //create customer obj to send back to console
        Orders order = new Orders();
        if (rs.next()) {
            order.setOrd_no(rs.getInt("ord_no"));
            order.setPurch_amt(rs.getDouble("purch_amt"));
            order.setOrd_date(rs.getDate("ord_date"));
            order.setCustomer_id(rs.getInt("customer_id"));
            order.setSalesman_id(rs.getInt("salesman_id"));
        } else {
            System.out.println("It broke somewhere, go fix it!");
        }
        return order;
    }
}
