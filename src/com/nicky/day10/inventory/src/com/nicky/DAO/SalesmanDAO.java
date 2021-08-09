package com.nicky.DAO;

import com.nicky.model.Salesman;

import java.sql.SQLException;
import java.util.List;

public interface SalesmanDAO {
    void addSalesman(Salesman salesman) throws SQLException;

    void updateSalesman(Salesman salesman) throws SQLException;

    void deleteSalesman(int id) throws SQLException;


    List<Salesman> getSalesmen() throws SQLException;

    Salesman salesmanByID(int id) throws SQLException;

}
