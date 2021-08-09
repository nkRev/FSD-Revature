package com.nicky;

import com.nicky.DAO.*;
import com.nicky.display.CustomerMenu;
import com.nicky.display.MainMenu;
import com.nicky.display.OrderMenu;
import com.nicky.display.SalesmanMenu;
import com.nicky.model.Customer;
import com.nicky.model.Orders;
import com.nicky.model.Salesman;

import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Scanner;

public class Main {
    static boolean finished = false;
    static Scanner in = new Scanner(System.in);
    static int input;

    public static void main(String[] args) throws SQLException, ParseException {
        inputMenu();
    }

    public static void inputMenu() throws SQLException, ParseException {
        MainMenu menu = new MainMenu();

        do {
            menu.display();
            System.out.println(">> ");
            input = in.nextInt();
            switch (input) {
                case 1:
                    customerMenu(in);
                    break;
                case 2:
                    ordersMenu(in);
                    break;
                case 3:
                    salesmanMenu(in);
                case 0:
                    System.out.println("I hope you saved before quiting....");
                    finished = true;
                    break;
                default:
                    System.out.println("Please use an integer from 1 - 3 to make your selection or 0 to quit");
                    break;
            }
        } while (!finished);
    }

    public static void customerMenu(Scanner in) throws SQLException, ParseException {
        Customer customer = new Customer();
        CustomerDAO customerDAO = new CustomerDAOImpl();
        CustomerMenu menu = new CustomerMenu();
        do{
            menu.display();
            System.out.println(">> ");
            input = in.nextInt();
            switch (input) {
                //add customer
                case 1:
                    //prompt user and set input
                    System.out.println("please enter customer id: ");
                    int id = in.nextInt();

                    System.out.println("please enter name: ");
                    String name = in.next();

                    System.out.println("Please enter city: ");
                    String city = in.next();

                    System.out.println("please enter grade: ");
                    int grade = in.nextInt();

                    System.out.println("please enter salesman id: ");
                    int salesman_id = in.nextInt();

                    //set customer object
                    customer.setCustomer_id(id);
                    customer.setCustomer_name(name);
                    customer.setCity(city);
                    customer.setGrade(grade);
                    customer.setSalesman_id(salesman_id);

                    //add customer to db
                    customerDAO.addCustomer(customer);
                    break;

                //remove customer
                case 2:
                    System.out.println("Please specify customer id for deletion: ");
                    id = in.nextInt();

                    //send id to db for deletion
                    customerDAO.deleteCustomer(id);
                    break;

                //update customer
                case 3:
                    //prompt user and take input
                    System.out.println("Please specify customer ID: ");
                    id = in.nextInt();

                    System.out.println("Please specify new customer name for updating: ");
                    name = in.next();

                    System.out.println("Please specify new city for updating: ");
                    city = in.next();

                    System.out.println("Please specify new grade for customer: ");
                    grade = in.nextInt();

                    System.out.println("Please specify new salesman ID for customer: ");
                    salesman_id = in.nextInt();

                    //create customer object
                    customer.setCustomer_id(id);
                    customer.setCustomer_name(name);
                    customer.setCity(city);
                    customer.setGrade(grade);
                    customer.setSalesman_id(salesman_id);

                    //update customer in database
                    customerDAO.updateCustomer(customer);
                    break;

                //view all customer
                case 4:
                    System.out.println("printing customers....");

                    List<Customer> customerList;
                    customerList = customerDAO.getCustomer();
                    for (Customer c : customerList) {
                        System.out.println(c.toString());
                    }
                    break;

                ///view a customer
                case 5:
                    System.out.println("Please specify the customer id: ");
                    id = in.nextInt();

                    System.out.println(customerDAO.customerByID(id));
                    break;

                //go back to main menu
                case 0:
                    System.out.println("Returning...");
                    finished = true;
                    inputMenu();
                    break;


            }
        }while(!finished);

    }

    public static void ordersMenu(Scanner in) throws SQLException, ParseException {
        Orders orders = new Orders();
        OrdersDAO ordersDAO = new OrdersDAOImpl();
        OrderMenu menu = new OrderMenu();
        do{
            menu.display();
            System.out.print(">> ");
            input = in.nextInt();
            switch (input) {
                //add orders
                case 1:
                    //prompt user and set input
                    System.out.println("please enter order number: ");
                    int ord_no = in.nextInt();

                    System.out.println("please enter purchase amount: ");
                    double purch_amt = in.nextDouble();

                    java.util.Date date = new java.util.Date();
                    java.sql.Date sqlDate = new java.sql.Date(date.getTime());

                    System.out.println("Please customer id: ");
                    int cust_id = in.nextInt();

                    System.out.println("please enter salesman id: ");
                    int salesman_id = in.nextInt();

                    //set customer object
                    orders.setOrd_no(ord_no);
                    orders.setPurch_amt(purch_amt);
                    orders.setOrd_date(sqlDate);
                    orders.setCustomer_id(cust_id);
                    orders.setSalesman_id(salesman_id);

                    //add customer to db
                    ordersDAO.addOrder(orders);
                    break;
                //update orders
                case 2:
                    //prompt user and take input
                    System.out.println("Please specify order number: ");
                    ord_no = in.nextInt();

                    System.out.println("Please specify new purchase amount for updating: ");
                    purch_amt = in.nextInt();

                    date = new java.util.Date();
                    sqlDate = new java.sql.Date(date.getTime());

                    System.out.println("Please specify new customer id for customer: ");
                    cust_id = in.nextInt();

                    System.out.println("Please specify new salesman ID for customer: ");
                    salesman_id = in.nextInt();

                    //create order object
                    orders.setOrd_no(ord_no);
                    orders.setPurch_amt(purch_amt);
                    orders.setOrd_date(sqlDate);
                    orders.setCustomer_id(cust_id);
                    orders.setSalesman_id(salesman_id);

                    //update order in database
                    ordersDAO.updateOrder(orders);
                    break;

                //rm orders
                case 3:
                    System.out.println("Please specify order number for deletion: ");
                    ord_no = in.nextInt();

                    //send id to db for deletion
                    ordersDAO.deleteOrder(ord_no);
                    break;

                //list orders
                case 4:
                    System.out.println("printing orders....");

                    List<Orders> ordersList;
                    ordersList = ordersDAO.getOrders();
                    for (Orders o : ordersList) {
                        System.out.println(o.toString());
                    }
                    break;

                //show order by id
                case 5:
                    System.out.println("Please specify the order number: ");
                    ord_no = in.nextInt();

                    System.out.println(ordersDAO.showOrderByID(ord_no));
                    break;

                case 0:
                    System.out.println("Returning...");
                    finished = true;
                    inputMenu();
                    break;


            }
        }while(!finished);

    }

    public static void salesmanMenu(Scanner in) throws SQLException, ParseException {
        Salesman salesman = new Salesman();
        SalesmanDAO salesmanDAO = new SalesmanDAOImpl();
        SalesmanMenu menu = new SalesmanMenu();


        do {
            menu.display();
            System.out.println(">> ");
            input = in.nextInt();
            switch (input) {
                //add salesman
                case 1:
                    System.out.println("please enter Salesman ID: ");
                    int salesman_id = in.nextInt();

                    System.out.println("please enter Salesman name: ");
                    String name = in.next();

                    System.out.println("please enter City: ");
                    String city = in.next();


                    System.out.println("Please enter Commission: ");
                    double commission = in.nextDouble();

                    salesman.setSalesman_id(salesman_id);
                    salesman.setName(name);
                    salesman.setCity(city);
                    salesman.setCommission(commission);

                    salesmanDAO.addSalesman(salesman);
                    break;

                //rm salesman
                case 2:
                    System.out.println("Please specify Salesman ID for deletion: ");
                    salesman_id = in.nextInt();

                    //send id to db for deletion
                    salesmanDAO.deleteSalesman(salesman_id);
                    break;

                //update salesman
                case 3:
                    //prompt user and take input
                    System.out.println("Please specify Salesman ID: ");
                    salesman_id = in.nextInt();

                    System.out.println("Please specify new Salesman name for updating: ");
                    name = in.next();

                    System.out.println("Please specify new Salesman City for updating: ");
                    city = in.next();

                    System.out.println("Please specify new commission for updating: ");
                    commission = in.nextDouble();


                    //create salesman object
                    salesman.setSalesman_id(salesman_id);
                    salesman.setName(name);
                    salesman.setCity(city);
                    salesman.setCommission(commission);

                    //update salesman in database
                    salesmanDAO.updateSalesman(salesman);
                    break;

                //view all salesman
                case 4:
                    System.out.println("printing orders....");
                    //since getEmployees
                    List<Salesman> salesmanList;
                    salesmanList = salesmanDAO.getSalesmen();
                    for (Salesman s : salesmanList) {
                        System.out.println(s.toString());
                    }
                    break;
                //view a salesman
                case 5:
                    System.out.println("Please specify the Salesman ID: ");
                    salesman_id = in.nextInt();

                    System.out.println(salesmanDAO.salesmanByID(salesman_id));
                    break;
                case 0:
                    System.out.println("Returning...");
                    finished = true;
                    inputMenu();
                    break;


            }
        } while (!finished);

    }


}
