package com.ford.generics;

import org.junit.Assert;
import org.junit.Test;

public class GenericObjectTest {
    @Test
    public void shouldTestGenericObject() {
        GenericObject genericObject = new GenericObject();
        Integer[] intArray = new Integer[]{10,20,30};
        //String[] stringArray = new String[]{"pavi","ashi","vidhi"};
        Integer[] outputArray = genericObject.createCommonArray(intArray);
        Assert.assertEquals(3, outputArray.length);
        //genericObject.createCommonArray(stringArray);
    }

    @Test
    public void shouldTestWrapperObjects() {
//        WrapperObject<Integer> wrapperObject = new WrapperObject<>();
//        wrapperObject.set(1);
//        Assert.assertEquals(String.valueOf(1), wrapperObject.get());// Type casted from T to integer

        WrapperObject<String> wrapperStringObject = new WrapperObject<>();
        wrapperStringObject.set("Hi");
        Assert.assertEquals(String.valueOf("Hi"), wrapperStringObject.get());
    }
}
