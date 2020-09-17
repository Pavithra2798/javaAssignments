package com.ford.calculations;

import org.junit.Assert;
import org.junit.Test;

public class CompoundInterestTest {
    @Test
    public void shouldCalculateCompoundInterest(){
        CompoundInterest calculate = new CompoundInterest();
        Assert.assertEquals(2050.0,calculate.compoundInterestCalculation(2,20000,5),3);

    }
}
