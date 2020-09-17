package com.ford.collections;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Set;

public class SetDemoTest {
    @Test
    public void shouldOperateSet() {
        SetDemo setDemo = new SetDemo();
        Set<Integer> set = setDemo.printNumbers();
        Assert.assertEquals(2, set.size());
    }
    @Test
    public void shouldOperateLinkedHashSet() {
        SetDemo setDemo = new SetDemo();
        Set<Integer> set = setDemo.printNumbersFromLinkedHashSet();
        Assert.assertEquals(3, set.size());
    }
    @Test
    public void shouldSortNumbersFromTreeSet() {
        SetDemo setDemo = new SetDemo();
        Set<Integer> set = setDemo.sortNumbersFromTreeSet();
        Assert.assertEquals(3, set.size());
    }
}
