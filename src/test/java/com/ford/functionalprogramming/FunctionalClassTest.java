package com.ford.functionalprogramming;

import org.junit.Assert;
import org.junit.Test;

public class FunctionalClassTest {
    @Test
    public void shouldAddTwoNumbers() {
        FunctionalClass functionalClass = new FunctionalClass();
        //functionalClass.addTwoNumbers(1,2);
        Assert.assertEquals(3, functionalClass.addTwoNumbers(1,2));
    }
}
