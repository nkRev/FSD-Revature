package com.nicky.day2;

class Student {
    public int rollNumber;
    public String name;
    static public String schoolName = "ABC School"; //schoolName with static will allocate space in memory for it's instance
}

public class Demo1 {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.rollNumber = 1;
        student1.name = "Nicky";

        Student student2 = new Student();
        student2.rollNumber = 2;
        student2.name = "Paul";

        //print student one info
        System.out.println("Roll number: " + student1.rollNumber + " Name: " + student1.name);
        //print student two info
        System.out.println("Roll number: " + student2.rollNumber + " Name: " + student2.name);

    }
}
