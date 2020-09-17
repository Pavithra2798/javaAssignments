package com.ford.threads;

import org.junit.Assert;
import org.junit.Test;

public class BankingTest {
    @Test
    public void shouldWithdraw() {
        Banking banking = new Banking();
        //banking.withdraw(1000);
        Assert.assertEquals(0,banking.withdraw(10000));
    }

    @Test
    public void shouldDeposit() {
        Banking banking = new Banking();
        Thread thread1 = new Thread(banking);
        thread1.start();
        Thread thread2 = new Thread(new Banking());
        thread2.start();
        Thread thread3 = new Thread(new Banking());
        thread3.start();
        //banking.deposit(1000);
        //Assert.assertEquals(11000,banking.deposit(1000));
    }
}
