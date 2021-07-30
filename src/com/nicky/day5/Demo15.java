package com.nicky.day5;

import java.io.File;
import java.io.IOException;

public class Demo15 {
    public static void main(String[] args) {
        File file = new File("data.txt");
        System.out.println(file.exists()); //false it does not exist

        try{
            file.createNewFile(); //this creates the new txt file
        }catch (IOException e){
            e.printStackTrace();
        }

        System.out.println(file.exists());//it exists
    }
}
