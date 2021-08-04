package com.nicky.day7;

import java.sql.SQLOutput;

class GenericDemo<T> {
    T object;

    void add(T object) {
        this.object = object;
    }

    T getObject() {
        return object;
    }
}

public class Demo4 {
    public static void main(String[] args) {
        GenericDemo<Integer> genericDemo = new GenericDemo<>();
        genericDemo.add(10);
        System.out.println(genericDemo.getObject());

        GenericDemo<String> stringGenericDemo = new GenericDemo<>();
        stringGenericDemo.add("Hello");
        System.out.println(stringGenericDemo.getObject());
    }
}
