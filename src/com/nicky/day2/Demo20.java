package com.nicky.day2;

interface IBankAccount {
    boolean deposit(double amount);

    boolean withdraw(double amount);

    void getBalance();

}

class SavingsAccount implements IBankAccount {
    private double _balance;
    private double _perDayLimit;

    @Override
    public boolean deposit(double amount) {
        _balance += amount;
        return true;
    }

    @Override
    public boolean withdraw(double amount) {
        if (_balance < amount) {
            System.out.println("Insufficient balance!");
            return false;
        } else if (_perDayLimit + amount > 5000) {
            System.out.println("Daily withdraw limit has been exceeded");
            return false;
        } else {
            System.out.println(amount + " was withdrawn");
            _balance -= amount;
            return true;
        }
    }

    @Override
    public void getBalance() {
        System.out.println("Savings Account balance: "+_balance);
    }
}

class CurrentAccount implements IBankAccount {
    private double _balance;

    @Override
    public boolean deposit(double amount) {
        _balance += amount;
        return true;
    }

    @Override
    public boolean withdraw(double amount) {
        if (_balance < amount) {
            System.out.println("Insufficient balance!");
            return false;
        } else {
            _balance -= amount;
            System.out.println(amount + " was withdrawn");
            return true;
        }
    }

    @Override
    public void getBalance(){
        System.out.println("Current Account balance: "+_balance);
    }
}

public class Demo20 {
    public static void main(String[] args) {
        IBankAccount savingsAccount = new SavingsAccount();
        IBankAccount currentAccount = new CurrentAccount();

        savingsAccount.deposit(2000);
        savingsAccount.withdraw(1000);
        savingsAccount.getBalance();

        currentAccount.deposit(10_000);
        currentAccount.withdraw(20_000);
        currentAccount.withdraw(5000);
        currentAccount.getBalance();
    }
}
