package com.nicky.day2;
class Company{
    public void test1(){
        System.out.println("test 1");
    }
    private void test2(){
        System.out.println("test 2");
    }
    protected void test3(){
        System.out.println("test 3");
    }
     void test4(){
         System.out.println("test 4");
     }
}
class SubCompany extends Company{
    public void test5(){
        System.out.println("Test 5");
        }
        }
public class Demo29 {
    public static void main(String[] args) {
        Company company = new Company();
        company.test1();//public
        //private void test2 method belongs here but is not accessible outside of its class
        company.test3();//protected
        company.test4(); //default access modifier
    }
}
