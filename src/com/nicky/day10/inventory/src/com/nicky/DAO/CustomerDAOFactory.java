package com.nicky.DAO;

public class CustomerDAOFactory {
    private static CustomerDAO dao;
    private CustomerDAOFactory(){

    }
    public static CustomerDAO getCustomerDao(){
        if(dao == null){
            dao = new CustomerDAOImpl();
        }
        return dao;
    }
}
