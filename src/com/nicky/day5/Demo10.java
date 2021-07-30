package com.nicky.day5;

class Bank {
    int balance = 10000;

    synchronized void withdraw(int amt) { //synchronizing with deposit
        System.out.println("Withdraw processing...");
        if (balance < amt) {
            System.out.println("Insufficient Balance.. waiting for deposit");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        balance -= amt;
        System.out.println(amt + " withdrawn");

    }

    synchronized void deposit(int amt) { //synchronizing with withdraw
        System.out.println("Processing deposit...");
        balance += amt;
        System.out.println(amt + " deposited successfully");
        notify();
    }
}

class DepositThread extends Thread {
    Bank bank;

    public DepositThread(Bank bank) {
        this.bank = bank;
    }

    @Override
    public void run() {
        bank.deposit(10_000);
    }
}

class WithdrawThread extends Thread {
    Bank bank;

    public WithdrawThread(Bank bank) {
        this.bank = bank;
    }

    @Override
    public void run() {
        bank.withdraw(15_000);
    }
}

public class Demo10 {
    public static void main(String[] args) {
        Bank bank = new Bank();

        DepositThread depositThread = new DepositThread(bank);
        WithdrawThread withdrawThread = new WithdrawThread(bank);

        // thread order matters... in this case, if deposit happens first,
        // there would be no insufficient balance waiting for deposit.
        withdrawThread.start();
        depositThread.start();


    }
}
