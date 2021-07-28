package com.nicky.day3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Demo28 {
    public static void main(String[] args)  {
        BufferedReader bufferedReader = null;
        try{
            //FileReader has to have the absolute pathname to where it exists in order to be read
            bufferedReader = new BufferedReader(new FileReader("C:\\Users\\[USERNAME]\\IdeaProjects\\FSD-Revature\\src\\com\\nicky\\day3\\data.txt"));
            System.out.println(bufferedReader.readLine());

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bufferedReader!=null){
                try{
                    bufferedReader.close();
                }catch (IOException e){
                    e.printStackTrace();
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}
