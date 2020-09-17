package com.ford.exception;

import org.junit.Assert;
import org.junit.Test;

public class ArithmeticExceptionTest {
    @Test
    public void shouldThrowArithmeticException() {
        ArithmeticClass arithmeticClass = new ArithmeticClass();
        //arithmeticClass.divideNumbers(10,0);
        try {
            Assert.assertEquals(0,arithmeticClass.divideNumbers(10,0));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
