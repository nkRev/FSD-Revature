package com.nicky.day2;
class Employee{
    public int empId;
    public String name;
    public static String companyName = "Revature";
    public Employee(int empId, String name){
        this.empId = empId;
        this.name = name;
    }
    public void printInfo(){
        System.out.println("ID: "+empId+", Name: "+name+", Company Name: "+ companyName);
    }

}
public class Demo4 {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Nicky");
        Employee emp2 = new Employee(2, "Stacy");
        emp1.printInfo();
        emp2.printInfo();

        Employee.companyName="FaceBook";
        emp1.printInfo();
        emp2.printInfo();
    }
}
