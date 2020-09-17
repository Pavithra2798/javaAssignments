package com.ford.abstraction;

public class Savings extends BankAccount {
    public Savings(String name, int balance) {
        super(name,balance);
    }

    @Override
    public void depositAmount(int amount) {
        balance += amount;
        System.out.println("Your balance after deposition is : " + balance);
    }

    @Override
    public void withdrawAmount(int amount) {
        if(amount < balance){
            balance -= balance - amount;
            System.out.println("Your balance after withdrawal is : " + balance);
        }
        else{
            System.out.println("Not enough balance");
        }
    }
}
