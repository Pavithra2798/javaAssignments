package com.ford.calculations;

import org.junit.Assert;
import org.junit.Test;

public class SimpleInterestTest {
    @Test
    public void shouldCalculateSimpleInterest(){
        SimpleInterest calculate = new SimpleInterest();
        Assert.assertEquals(200000,calculate.interestCalculation(2,20000,5),2);

    }


}
