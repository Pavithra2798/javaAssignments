package com.ford.threads;

public class Banking extends Thread {
    int balanceAmount = 10000;

    public void run(){
        this.withdraw(5000);
        this.deposit(2000);
    }

    public synchronized int withdraw(int amount) {
        System.out.println("withdraw balance is " + this.balanceAmount + Thread.currentThread().getName());
        if (this.balanceAmount < amount){
            return 0;
        }
        else{
            return this.balanceAmount -= amount;
        }
    }

    public synchronized int deposit(int amount) {
        System.out.println("deposit balance is " + this.balanceAmount + Thread.currentThread().getName());
        return this.balanceAmount += amount;

    }
    public static void main(String args[]){
        Banking banking = new Banking();
        Thread thread1 = new Thread(banking);
        thread1.start();
        Thread thread2 = new Thread(new Banking());
        thread2.start();
        Thread thread3 = new Thread(new Banking());
        thread3.start();
    }
}
