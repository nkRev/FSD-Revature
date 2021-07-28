package com.nicky.day3;

class InsufficientFundsException extends Exception {
    public InsufficientFundsException() {
        System.out.println("Insufficient amount requested");
    }
    //to pass a custom message we create a constructor
    // then pass a String with a message in it
    public  InsufficientFundsException(String message){
        System.out.println(message);
    }
}

class BankAccount {
    private int _balance = 0;
    private int _accountNumber;

    //account number of current BankAccount obj
    public BankAccount(int _accountNumber) {
        this._accountNumber = _accountNumber;

    }

    //deposit amount and add to balance, prints amount deposited
    public void deposit(int amount) {
        _balance += amount;
        System.out.println("Amount deposited: " + amount);
    }

    //withdraw amount; if amount is less than or equal to balance then it will print amount withdrawn message
    //otherwise it will throw the custom InsufficientFundsException
    public void withdraw(int amount) throws InsufficientFundsException {
        if (amount <= _balance) {
            _balance -= amount;
            System.out.println("Amount withdrawn: " + amount);
        } else {
            //the message inside the constructor gets passed to new constructor with String message
            throw new InsufficientFundsException("Sorry, your balance in not sufficient enough to withdraw");
        }
    }
    //returns balance of current BankAccount obj
    public int get_balance() {
        return _balance;
    }
    //returns account number of current BankAccount obj
    public int get_accountNumber() {
        return _accountNumber;
    }

}

public class Demo20 {

    /**
     * We are using try blocks for risky situations or can cause an exception.
     * In the case of the main method, bankAccount.withdraw() may be risky
     * due to having an insufficient balance
     *
     * the catch block is where the exception will be caught and the appropriate message
     * will be relayed from the InsufficientFundsException class or
     * a custom message we passed to InsufficientFundsException class from
     * BankAccount
     *
     * @param args
     * @throws InsufficientFundsException
     */
    public static void main(String[] args) throws InsufficientFundsException {
        BankAccount bankAccount = new BankAccount(123456);
        System.out.println(bankAccount.get_balance());
        bankAccount.deposit(5000);
        try{
            bankAccount.withdraw(2000);
        }catch (InsufficientFundsException e){
            e.printStackTrace();
        }

        bankAccount.deposit(1000);

        try{
            bankAccount.withdraw(10000);
        }catch (InsufficientFundsException e){
            e.printStackTrace();
        }

    }
}
