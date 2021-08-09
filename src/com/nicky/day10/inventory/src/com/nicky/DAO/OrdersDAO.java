package com.nicky.DAO;

import com.nicky.model.Orders;

import java.sql.SQLException;
import java.util.List;

public interface OrdersDAO {
    void addOrder(Orders order) throws SQLException;

    void updateOrder(Orders order) throws SQLException;

    void deleteOrder(int id) throws SQLException;

    List<Orders> getOrders() throws SQLException;

    Orders showOrderByID(int id) throws SQLException;
}
