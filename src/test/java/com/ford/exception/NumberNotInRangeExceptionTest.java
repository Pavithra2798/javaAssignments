package com.ford.exception;

import org.junit.Test;

public class NumberNotInRangeExceptionTest {
    @Test
    public void shouldThrowCustomException() {
        NumberNotInRangeException numberNotInRangeException = new NumberNotInRangeException("string");
        numberNotInRangeException.newCustomException(70);
    }
}
