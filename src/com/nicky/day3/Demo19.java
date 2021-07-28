package com.nicky.day3;

class EmployeeException extends RuntimeException {
    //this EmployeeException class must extend RuntimeException to be able to throw a custom Exception
}

public class Demo19 {
    public static void main(String[] args) {

        //throw new ArithmeticException()
        throw new EmployeeException();
    }
}
