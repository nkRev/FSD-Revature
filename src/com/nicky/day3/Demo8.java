package com.nicky.day3;

public class Demo8 {
    public static void main(String[] args) {
        String message = "Welcome to java training"; // message obj is added to string pool in heap memory
        // expected output: Welcome; 0 is index to start at, 7 is the index to begin exclusion
        System.out.println(message.substring(0, 7));

        System.out.println("Original message " + message); //prints original String

        // the space in front of to will be included since it starts from there
        System.out.println("Substring starting from index 7: " + message.substring(7));

        //starts at 0 index and excludes everything from the 'space' which is at index 7
        System.out.println("substring starting from index 0 to 7: " + message.substring(0, 7));

    }
}
