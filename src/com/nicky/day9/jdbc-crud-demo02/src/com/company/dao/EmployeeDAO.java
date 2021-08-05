package com.company.dao;

import com.company.model.Employee;

import java.sql.SQLException;
import java.util.List;

public interface EmployeeDAO {
    void addEmployee(Employee employee) throws SQLException;

    void updateEmployee(Employee employee) throws SQLException;

    void deleteEmployee(int id) throws SQLException;

    List<Employee> getEmployees() throws SQLException;

    Employee employeeByID(int id) throws SQLException;
}
