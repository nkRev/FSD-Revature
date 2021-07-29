package com.nicky.day4;

import java.util.ArrayList;

class Student{
    public int id;
    public String name;
    public String email;

    public Student(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    /**
     * without a toString it the Student object will
     * print out it's location in memory
     * @return id, name, and email as a string
     */
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
public class Demo5 {
    public static void main(String[] args) {
        //user defined students
        Student student1 = new Student(1, "Mark", "Mark@gmail.com");
        Student student2 = new Student(2, "Stacy", "Stacy@gmail.com");
        Student student3 = new Student(4, "Jake", "Jake@gmail.com");

        //create student arraylist
        ArrayList<Student> studentArrayList = new ArrayList<>();
        studentArrayList.add(student1);
        studentArrayList.add(student2);
        studentArrayList.add(student3);

        //for each student in studentArrayList
        for (Student student :
                studentArrayList) {
            System.out.println(student);
        }
        System.out.println();
        //forEach method
        studentArrayList.forEach(stud ->{
            System.out.println(stud);
        });

    }
}
