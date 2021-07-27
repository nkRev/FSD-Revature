package com.nicky.day2;
class Bank{
    public int getRateofInterest(){
        return 0;
    }
}
class BankA extends Bank{
    public int getRateofInterest(){
        return 7;
    }
}
class BankB extends Bank{
    public int getRateofInterest(){
        return 8;
    }
}
class BankC extends Bank{
    @Override
    public int getRateofInterest(){
        return 8;
    }
}
public class Demo10 {
    public static void main(String[] args) {
        BankA bankA = new BankA();
        BankB bankB = new BankB();
        BankC bankC = new BankC();

        System.out.println(bankA.getRateofInterest());
        System.out.println(bankB.getRateofInterest());
        System.out.println(bankC.getRateofInterest());
    }
}
