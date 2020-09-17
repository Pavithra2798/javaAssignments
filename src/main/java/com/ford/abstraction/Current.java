package com.ford.abstraction;

public class Current extends BankAccount {
    public Current(String name, int balance) {
        super(name,balance);
    }

    @Override
    public void depositAmount(int amount) {
        balance += amount;
        System.out.println("Your balance after deposition is : " + balance);
    }

    @Override
    public void withdrawAmount(int amount) {
        if(amount < balance) {
            int creditLimit = 5000;
            if (amount < creditLimit) {
                balance -= amount;
                System.out.println("Your balance after withdrawal is : " + balance);
            } else {
                System.out.println("More than the limit");
            }
        }
        else{
            System.out.println("not enough balance");
        }
    }

}
