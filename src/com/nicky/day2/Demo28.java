package com.nicky.day2;

class Student2 {
    //while these are public it is accessible to be modified by package
    //so we use private to make it in-accessable from outside entities
    private int id;
    private String name;
    private int passMark = 40;

    public int getId() {
        return id;
    }
    //cannot be negative
    public void setId(int id) throws Exception{
        if (id<0) {
            throw new Exception("id cannot be blank");
        }else{
            this.id = id;
        }
    }

    public String getName() {
        return name;
    }
    //name should not be null
    public void setName(String name) throws Exception {
        if(name.isBlank()){
            throw new Exception("Name cannot be blank!");
        }else{
            this.name = name;
        }
    }
    //read only
    public int getPassMark() {
        return passMark;
    }


}

public class Demo28 {
    public static void main(String[] args) throws Exception {
        Student2 student = new Student2();
//        student.id = 1;
//        student.name = "Nicky";
//
//        System.out.println("Id: " + student.id + " Name: " + student.name + " passmark: " + student.passMark);
        student.setId(1);
        student.setName("Nicky");

        System.out.println("Id: " + student.getId() + " Name: " + student.getName() + " passmark: " + student.getPassMark());
    }

}
