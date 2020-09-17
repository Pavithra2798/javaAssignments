package com.ford.collections;

import org.junit.Assert;
import org.junit.Test;

public class LinkedListDemoTest {
    @Test
    public void shouldSortLinkedList() {
        LinkedListDemo linkedListDemo = new LinkedListDemo();
        linkedListDemo.sortLinkedList(7);
        Assert.assertNotNull(linkedListDemo);
    }
}
