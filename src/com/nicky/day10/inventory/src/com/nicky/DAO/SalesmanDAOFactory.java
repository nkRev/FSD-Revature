package com.nicky.DAO;

public class SalesmanDAOFactory {
    private static SalesmanDAO dao;

    private SalesmanDAOFactory() {

    }

    public static SalesmanDAO getSalesmanDAO() {
        if (dao == null) {
            dao = new SalesmanDAOImpl();
        }
        return dao;
    }
}
