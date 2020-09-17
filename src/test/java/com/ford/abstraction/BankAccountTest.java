package com.ford.abstraction;

import org.junit.Assert;
import org.junit.Test;

public class BankAccountTest {
    @Test
    public void shouldCheckSavingsAccount() {
        BankAccount savings = new Savings("Pavithra", 5000);
        System.out.println("Your current balance is : " + savings.getBalance());
        savings.depositAmount(1000);
        Assert.assertNotNull(savings);

    }

    @Test
    public void shouldCheckCurrentAccount() {
        BankAccount current = new Current("Pavithra",3000);
        System.out.println("Your current balance is : " + current.getBalance());
        current.depositAmount(12000);
        current.withdrawAmount(5000);
        Assert.assertNotNull(current);
    }

}
