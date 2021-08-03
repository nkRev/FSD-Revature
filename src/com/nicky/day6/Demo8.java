package com.nicky.day6;

interface IBank {
    void deposit(int amount);

    void withdraw(int amount);
}

class SavingsAccount implements IBank {

    @Override
    public void deposit(int amount) {
        System.out.println("Deposited amount: " + amount);
    }

    @Override
    public void withdraw(int amount) {
        System.out.println("Withdrew amount: " + amount);
    }
}

class CurrentAccount implements IBank {
    @Override
    public void deposit(int amount) {
        System.out.println("Deposited amount: " + amount);
    }

    @Override
    public void withdraw(int amount) {
        System.out.println("Withdrew amount: " + amount);
    }

}

class LoanAccount implements IBank {
    @Override
    public void deposit(int amount) {
        System.out.println("Deposited amount: " + amount);
    }

    @Override
    public void withdraw(int amount) {
        System.out.println("Withdrew amount: " + amount);
    }
}

class Factory {
    public static IBank getAccount(AccountType id) {
        switch (id) {
            case SAVINGS_ACCOUNT:
                return new SavingsAccount();
            case CURRENT_ACCOUNT:
                return new CurrentAccount();
            case LOAN_ACCOUNT:
                return new LoanAccount();
            default:
                return null;
        }
    }
}

enum AccountType {
    SAVINGS_ACCOUNT,
    CURRENT_ACCOUNT,
    LOAN_ACCOUNT
}

public class Demo8 {
    public static void main(String[] args) {
        IBank account = Factory.getAccount(AccountType.CURRENT_ACCOUNT);
        IBank account2 = Factory.getAccount(AccountType.LOAN_ACCOUNT);
        IBank account3 = Factory.getAccount(AccountType.SAVINGS_ACCOUNT);

    }
}
