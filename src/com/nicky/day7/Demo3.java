package com.nicky.day7;

class Calculator2<T> {
    public boolean areEqual(T a, T b) {
        if (a.equals(b)) {
            return true;
        } else {
            return false;
        }
    }
}

public class Demo3 {
    public static void main(String[] args) {
        Calculator2<String> cal = new Calculator2<>();
        System.out.println(cal.areEqual("A", "B")); //false
        System.out.println(cal.areEqual("a", "B"));//false
        System.out.println(cal.areEqual("a", "a")); //true
        System.out.println(cal.areEqual("A", "A")); //true

        //cal.areEqual(1, "b"); //not allowed since cal is defined as type string

        Calculator2<Integer> cal2 = new Calculator2<>();

        //cal2.areEqual("a", 12); //not allowed
        System.out.println(cal2.areEqual(10, 20)); //false
        System.out.println(cal2.areEqual(10, 10)); //true


    }
}
