package com.nicky.day5;

import java.util.Scanner;

public class Demo26 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first and last name: ");
        String firstName = in.nextLine();
        String lastName = in.nextLine();
        System.out.println("FullName: " + firstName +" "+lastName);
    }
}
