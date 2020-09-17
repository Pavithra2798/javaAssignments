package com.ford.labaratory;

import org.junit.Assert;
import org.junit.Test;

public class LabTestTest {
    @Test
    public void shouldCreateBloodTest(){
        LabTest bloodTest = new LabTest();
    }
    @Test
    public void shouldCreateSwabTest(){
        LabTest bloodTest = new LabTest();
    }
    @Test
    public void shouldHaveBloodTestName(){
        LabTest bloodTest = new LabTest();
        bloodTest.name = "blood sugar test";
        Assert.assertEquals("blood sugar test", bloodTest.name);
    }
    @Test
    public void shouldHaveBloodTestType(){
        LabTest bloodTest = new LabTest();
        bloodTest.type = "injection";
        Assert.assertEquals("injection", bloodTest.type);
    }
    @Test
    public void shouldHaveBloodTestTime(){
        LabTest bloodTest = new LabTest();
        bloodTest.time = 4.5;
        Assert.assertEquals(4.5, bloodTest.time,1);
    }
    @Test
    public void shouldHaveBloodTestPrice(){
        LabTest bloodTest = new LabTest();
        bloodTest.price = 100.9;
        Assert.assertEquals(100.9, bloodTest.price,1);
    }


    @Test
    public void shouldHaveSwabTestName(){
        LabTest swabTest = new LabTest();
        swabTest.name = "swab ear test";
        Assert.assertEquals("swab ear test", swabTest.name);
    }
    @Test
    public void shouldHaveSwabTestType(){
        LabTest swabTest = new LabTest();
        swabTest.type = "buds";
        Assert.assertEquals("buds", swabTest.type);
    }
    @Test
    public void shouldHaveSwabTestTime(){
        LabTest swabTest = new LabTest();
        swabTest.swabTime = 1;
        Assert.assertEquals(1, swabTest.swabTime);
    }
    @Test
    public void shouldHaveSwabTestPrice(){
        LabTest swabTest = new LabTest();
        swabTest.price = 10.4;
        Assert.assertEquals(10.4, swabTest.price,1);
    }
}
