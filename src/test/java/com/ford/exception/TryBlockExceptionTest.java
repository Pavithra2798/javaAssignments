package com.ford.exception;

import org.junit.Assert;
import org.junit.Test;

public class TryBlockExceptionTest {
    @Test
    public void shouldRaiseAnExceptionInTryBlock() throws Exception {
        TryBlockException tryBlockException = new TryBlockException();
        Assert.assertEquals(0,tryBlockException.shouldThrowException(10,0));
    }
}
