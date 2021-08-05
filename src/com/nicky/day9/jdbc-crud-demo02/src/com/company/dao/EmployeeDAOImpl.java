package com.company.dao;

import com.company.model.Employee;
import com.company.utilities.DAOConnectionUtility;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAOImpl implements EmployeeDAO {
    private static Statement statement;
    static PreparedStatement ps;
    Connection connection = null;

    public EmployeeDAOImpl() {
        try {
            this.connection = DAOConnectionUtility.getConnection();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void addEmployee(Employee employee) throws SQLException {
        String sql = "insert into employeedemo (name, email) values (?, ?)";
        ps = connection.prepareStatement(sql);
        ps.setString(1, employee.getName());
        ps.setString(2, employee.getEmail());
        int count = ps.executeUpdate();
        if (count > 0) {
            System.out.println("Employee saved");

        } else System.out.println("have you tried to turn it on and off again?");
    }

    @Override
    public void updateEmployee(Employee employee) throws SQLException {
        String sql = "update employeedemo set name = ?, email = ? where id = ?";
        ps = connection.prepareStatement(sql);
        ps.setString(1, employee.getName());
        ps.setString(2, employee.getEmail());
        ps.setInt(3, employee.getId());
        int count = ps.executeUpdate();
        if (count > 0) {
            System.out.println("Employee saved");

        } else {
            System.out.println("have you tried to turn it on and off again?");
        }
    }

    @Override
    public void deleteEmployee(int id) throws SQLException {
        String sql = "delete from employeedemo where id = ?";
        ps = connection.prepareStatement(sql);
        ps.setInt(1, id);
        int count = ps.executeUpdate();
        if (count > 0) {
            System.out.println("Employee saved");
        } else {
            System.out.println("have you tried to turn it on and off again?");
        }
    }

    @Override
    public List<Employee> getEmployees() throws SQLException {
        List<Employee> employeeList = new ArrayList<>();
        String sql = "select * from employeedemo";
        ps = connection.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()){
            Employee employee = new Employee();
            employee.setId(rs.getInt("id"));
            employee.setName(rs.getString("name"));
            employee.setEmail(rs.getString("email"));
            employeeList.add(employee);
        }
        return employeeList;
    }

    @Override
    public Employee employeeByID(int id) throws SQLException {
        String sql = "select * from employeedemo where id = ?";
        ps = connection.prepareStatement(sql);
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();
        Employee employee = new Employee();

        if(rs.next()){
            employee.setId(rs.getInt("id"));
            employee.setName(rs.getString("name"));
            employee.setEmail(rs.getString("email"));
        }else{
            System.out.println("go fix it!");
        }
        return employee;
    }
}
