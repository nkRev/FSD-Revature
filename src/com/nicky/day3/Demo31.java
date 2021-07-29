package com.nicky.day3;

import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;

public class Demo31 {
    public static void main(String[] args) {
        //try block to check for exception
        //creating an object of fileOutputStream
        //you can read and write with both FileOutputStream and BufferedReader
        try(FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\[USERNAME]\\IdeaProjects\\FSD-Revature\\src\\com\\nicky\\day3\\data.txt")){
            //custom string input
            String data = "Hello World";
            //converting string to bytes
            byte[] arr = data.getBytes();
            //byte array gets written to data.txt
            fileOutputStream.write(arr);
        }catch(Exception e){

        }
    }
}
