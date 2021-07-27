package com.nicky.day1;
class Student{
    private int id;
    private String name;
    private int passMark = 40;

    public Student(){

    }
    public Student(int id) throws Exception{
        if(id<0){
            throw new Exception("id cannot ve -ve");
        }
        this.id=id;
    }
        public int getId() {
        return id;
    }

    public void setId(int id) throws Exception {
        if(id < 0)
            throw new Exception("id cannot ve -ve");
        this.id = id;
    }
}
public class demo18 {
    public static void main(String[] args) throws Exception {
        Student student = new Student(-1);

        Student stud = new Student();
        student.setId(-1);

        //when public access modifier is used i can access these lines of code
        //otherwise when private access modifier is used,
        // I cannot unless pass arguments through parameterized constructor
//        System.out.println(student.getId());
//
//
//        student.id = -10;
//        student.name = null;
//        student.passMark = 20;
//
//        System.out.println("ID: "+ student.id);
//        System.out.println("Name: "+ student.name);
//        System.out.println("Passmark: "+ student.passMark);
    }
}
