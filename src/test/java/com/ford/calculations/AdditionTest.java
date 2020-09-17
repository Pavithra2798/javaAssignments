package com.ford.calculations;

import org.junit.Assert;
import org.junit.Test;

public class AdditionTest {
    @Test
    public void shouldAddFiveAndSeven(){
        Addition addition = new Addition();
        System.out.println(addition.add(5,7));
        Assert.assertEquals(5+7,addition.add(5,7));
    }
}
