package com.nicky.day5;

import java.io.File;

public class Demo16 {
    public static void main(String[] args) {
        File file  = new File("db");
        System.out.println(file.exists());

        //creating a directory in root directory
        file.mkdir();
        System.out.println(file.exists());
    }
}
