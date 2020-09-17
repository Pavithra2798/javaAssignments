package com.ford.abstraction;

public abstract class BankAccount {

    private final String name;
    private static final String accountNumber="1234";
    public static int balance;

    public BankAccount(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }
    

    public abstract void depositAmount(int amount);
    public abstract void withdrawAmount(int amount);

    public static int getBalance() {
        return balance;
    }

    //public abstract void balanceAmount();

//    public static String getAccountNumber() {
//        return accountNumber;
//    }
//
//    public int getBalance() {
//        return balance;
//    }
}
