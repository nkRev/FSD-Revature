package com.nicky.day5;

import java.io.File;
import java.io.IOException;

public class Demo20 {
    public static void main(String[] args) {
        File file = new File("db", "first.txt");
        try {
            file.createNewFile(); //will create a new file
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(file.exists()); //true
        file.delete(); //deletes file

        System.out.println(file.exists()); //false
    }
}
