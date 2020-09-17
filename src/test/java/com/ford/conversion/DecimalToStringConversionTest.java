package com.ford.conversion;

import org.junit.Assert;
import org.junit.Test;

public class DecimalToStringConversionTest {
    @Test
    public void shouldConvertDecimalToString(){
        DecimalToStringConversion conversion = new DecimalToStringConversion();
        Assert.assertEquals("15.666", conversion.decimalToString(15.666));

    }

}
