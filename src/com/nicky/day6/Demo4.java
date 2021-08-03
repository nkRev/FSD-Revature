package com.nicky.day6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student implements Comparable<Student> {
    int rollNumber;
    String name;
    int age;

    public Student(int rollNumber, String name, int age) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNumber=" + rollNumber +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    //sorts by roll number
    @Override
    public int compareTo(Student o) {
        if (rollNumber > o.rollNumber) {
            return 1; // if greater than
        } else if (rollNumber < o.rollNumber) {
            return -1; //if less than
        } else {
            return 0; //if equals
        }
    }
}

class SortByAge implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        if(o1.age > o2.age) {
            return 1;
        }else if(o1.age<o2.age){
            return -1;
        }else{
            return 0;
        }
    }
}
class SortByName implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
    return o1.name.compareTo(o2.name); //returns the comparison of object1's name to object2's name
    }
}
public class Demo4 {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(2,"Mark", 30));
        students.add(new Student(1,"Watson", 50));
        students.add(new Student(3,"Stacy", 20));
        students.add(new Student(4,"Andy", 18));

        System.out.println("before sorting...");
        for(Student student: students){
            System.out.println(student);
        }
        //Collections.sort(students);
        //Collections.sort(students, new SortByAge());
        Collections.sort(students, new SortByName());

        System.out.println("after sorting...");
        for(Student student: students){
            System.out.println(student);
        }

    }
}
