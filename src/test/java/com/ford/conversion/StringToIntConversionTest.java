package com.ford.conversion;

import org.junit.Assert;
import org.junit.Test;

public class StringToIntConversionTest {
    @Test
    public void shouldConvertStringToInt(){
        StringToIntConversion stringToIntConversion = new StringToIntConversion();
        stringToIntConversion.convert("15");
        Assert.assertEquals(15, stringToIntConversion.convert("15"));
    }
    @Test
    public void shouldSumConvertedString(){
        StringToIntConversion stringToIntConversion = new StringToIntConversion();
        Assert.assertEquals(45, stringToIntConversion.addingString("40","5"));
    }
}
