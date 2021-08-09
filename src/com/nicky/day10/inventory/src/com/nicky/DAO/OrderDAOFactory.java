package com.nicky.DAO;

public class OrderDAOFactory {
    private static OrdersDAO dao;

    private OrderDAOFactory() {

    }

    public static OrdersDAO getOrdersDAO() {
        if (dao == null) {
            dao = new OrdersDAOImpl();
        }
        return dao;
    }

}
