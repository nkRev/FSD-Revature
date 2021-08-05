package com.company;

import com.company.dao.EmployeeDAO;
import com.company.dao.EmployeeDAOFactory;
import com.company.model.Employee;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws SQLException {
        Scanner in = new Scanner(System.in);
        Employee employee = new Employee();
        EmployeeDAO employeeDAO = EmployeeDAOFactory.getEmployeeDao();

        int id;
        String name;
        String email;
        boolean finished = false;

        do {
            //display menu
            System.out.println("***********************");
            System.out.println("1. Add Employee");
            System.out.println("2. Delete Employee");
            System.out.println("3. Update Employee");
            System.out.println("4. View All Employees");
            System.out.println("5. View an Employee");
            System.out.println("0. Quit");
            System.out.println("***********************");

            //prompt user
            System.out.println("Please use the corresponding number to make your selection: ");
            //take input
            int selection = in.nextInt();

            switch (selection) {
                case 1:
                    //prompt user and set input
                    System.out.println("please enter employee name: ");
                    name = in.next();
                    System.out.println("please enter your email");
                    email = in.next();

                    //set employee object
                    employee.setName(name);
                    employee.setEmail(email);
                    employeeDAO.addEmployee(employee);
                    break;
                case 2:
                    System.out.println("Please specify the Employee ID for deletion: ");
                    id = in.nextInt();
                    employeeDAO.deleteEmployee(id);
                    break;
                case 3:
                    //prompt user and take input
                    System.out.println("Please specify Employee Id: ");
                    id = in.nextInt();
                    System.out.println("Please specify new Employee Name for updating: ");
                    name = in.next();
                    System.out.println("Please specify new Employee email for updating: ");
                    email = in.next();

                    //create employee object

                    employee.setId(id);
                    employee.setName(name);
                    employee.setEmail(email);


                    //update employee in database
                    employeeDAO.updateEmployee(employee);
                    break;
                case 4:
                    System.out.println("printing employees....");
                    //since getEmployees
                    List<Employee> employeeList;
                    employeeList = employeeDAO.getEmployees();
                    for (Employee e : employeeList) {
                        System.out.println(e.toString());
                    }
                    break;
                case 5:
                    System.out.println("Please specify the employee id: ");
                    id = in.nextInt();

                    System.out.println(employeeDAO.employeeByID(id));
                    break;
                case 0:
                    System.out.println("Terminating....");
                    finished = true;
                    break;
                default:
                    System.out.println("Please pick a number 1-5, 0 to quit");
                    break;

            }
        } while (!finished);


//        employee.setName("Nicky");
//        employee.setEmail("n@gmail.com");
//        EmployeeDAO dao = EmployeeDAOFactory.getEmployeeDao();
//        dao.addEmployee(employee);
    }


}
