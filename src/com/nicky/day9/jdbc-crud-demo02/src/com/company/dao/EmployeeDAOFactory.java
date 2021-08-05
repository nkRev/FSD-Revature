package com.company.dao;

import com.company.model.Employee;

import java.sql.SQLException;
import java.util.List;

public class EmployeeDAOFactory {
    private static EmployeeDAO dao;

    private EmployeeDAOFactory() {
    }

    public static EmployeeDAO getEmployeeDao() {
        if (dao == null) {
            dao = new EmployeeDAOImpl();
        }
        return dao;
    }
}
