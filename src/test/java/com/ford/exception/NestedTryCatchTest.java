package com.ford.exception;

import org.junit.Assert;
import org.junit.Test;

public class NestedTryCatchTest {
    @Test
    public void shouldTestNestedTryCatch() throws Exception {
        NestedTryCatch nestedTryCatch = new NestedTryCatch();
        Assert.assertEquals(0,nestedTryCatch.throwingException());
    }
}
