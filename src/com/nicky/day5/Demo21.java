package com.nicky.day5;

import java.io.FileWriter;
import java.io.IOException;

public class Demo21 {
    public static void main(String[] args) throws IOException {
        //first it will check if we have a file by this name
        //or else it will create the new file
        FileWriter fileWriter = new FileWriter("data2.txt", true);
        fileWriter.write(10);
        fileWriter.write(125);
        fileWriter.write("This is a random message");
        fileWriter.write("\n");
        char[] c1 ={'a', 'b', 'c','d'};
        fileWriter.write(c1);//it takes character arrays too
        fileWriter.write("\n");

        fileWriter.flush(); //all characters that are passed from the program will be transferred to the file including the last character
        fileWriter.close();//closes filewriter
    }
}
