package com.nicky.day7;

class GenericMethodDemo {
    public static <E> void printArray(E[] elements) {
        for (E element : elements) {
            System.out.println(element);
        }
        System.out.println("*************************");
    }
}

public class Demo5 {
    public static void main(String[] args) {
        Integer[] intArray = {12, 45, 21, 99};
        Character[] charArray = {'a', 'A', 'z', 'J'};
        String[] strArray = {"Hello", "my", "name", "is", "Nicky"};


        GenericMethodDemo.printArray(intArray);
        GenericMethodDemo.printArray(charArray);
        GenericMethodDemo.printArray(strArray);
    }
}
