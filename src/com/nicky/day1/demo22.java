package com.nicky.day1;

class Employee {
    public int empId;
    public String firstName;
    public String lastName;
    public String emailAddress;

    public void getFullName() {
        System.out.println(firstName + " " + lastName);
    }
}

class FullTimeEmployee extends Employee {

    public int annualSalary;

}

class PartTimeEmployee extends Employee {

    public int hourSalary;


}

public class demo22 {
    public static void main(String[] args) {
        FullTimeEmployee fte = new FullTimeEmployee();
        fte.firstName = "Nicky";
        fte.lastName = "Kayyarath";

        PartTimeEmployee pte = new PartTimeEmployee();
        pte.firstName = "Paul";
        pte.lastName = "Watson";

        fte.getFullName();
        pte.getFullName();
    }
}
