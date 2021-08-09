package com.nicky.DAO;

import com.nicky.model.Salesman;
import com.nicky.utils.DAOConnectionUtilities;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SalesmanDAOImpl implements SalesmanDAO {
    static PreparedStatement ps;
    Connection connection = null;

    public SalesmanDAOImpl() {
        try {
            connection = DAOConnectionUtilities.getConnection();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void addSalesman(Salesman salesman) throws SQLException {
        String sql = "INSERT INTO salesman (salesman_id, name, city, commission) VALUES (?, ? ,?, ?)";
        //prepare query
        ps = connection.prepareStatement(sql);
        //insert into query's '?'
        ps.setInt(1, salesman.getSalesman_id());
        ps.setString(2, salesman.getName());
        ps.setString(3, salesman.getCity());
        ps.setDouble(4, salesman.getCommission());


        //execute
        int count = ps.executeUpdate();
        if (count > 0) {
            System.out.println("Salesman information added");
        } else {
            System.out.println("Uh. Oh. Salesman information did not save.");
        }
    }

    @Override
    public void updateSalesman(Salesman salesman) throws SQLException {
        String sql = "UPDATE salesman SET name = ?, city = ?, commission = ? WHERE salesman_id = ?";
        ps = connection.prepareStatement(sql);
        //set name, city and commission
        ps.setString(1, salesman.getName());
        ps.setString(2, salesman.getCity());
        ps.setDouble(3, salesman.getCommission());
        //where salesman_id = "?"
        ps.setInt(4, salesman.getSalesman_id());

        int count = ps.executeUpdate();
        if (count > 0) {
            System.out.println("Salesman information updated.");
        } else {
            System.out.println("Not again. Go fix your query.");
        }
    }

    @Override
    public void deleteSalesman(int id) throws SQLException {
        String sql = "DELETE FROM salesman where salesman_id = ?";
        ps = connection.prepareStatement(sql);
        ps.setInt(1, id);

        int count = ps.executeUpdate();
        if (count > 0) {
            System.out.println("Salesman information was successfully deleted!");
        } else {
            System.out.println("Something went wrong. Please try again or contact the developer");
        }
    }

    @Override
    public List<Salesman> getSalesmen() throws SQLException {
        List<Salesman> salesmanList = new ArrayList<>();
        String sql = "SELECT * FROM salesman";
        ps = connection.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            Salesman salesman = new Salesman();
            salesman.setSalesman_id(rs.getInt("salesman_id"));
            salesman.setName(rs.getString("name"));
            salesman.setCity(rs.getString("city"));
            salesman.setCommission(rs.getDouble("commission"));


            salesmanList.add(salesman);
        }
        return salesmanList;
    }

    @Override
    public Salesman salesmanByID(int id) throws SQLException {
        String sql = "SELECT * FROM salesman WHERE salesman_id = ?";
        ps = connection.prepareStatement(sql);
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();

        //create customer obj to send back to console
        Salesman salesman = new Salesman();
        if (rs.next()) {
            salesman.setSalesman_id(rs.getInt("salesman_id"));
            salesman.setName(rs.getString("name"));
            salesman.setCity(rs.getString("city"));
            salesman.setCommission(rs.getDouble("commission"));
        } else {
            System.out.println("It broke somewhere, go fix it!");
        }
        return salesman;
    }

}
