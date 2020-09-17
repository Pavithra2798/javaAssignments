package com.ford.collections;

import org.junit.Assert;
import org.junit.Test;

public class CollectionDemoTest {
    @Test
    public void shouldOperateCollection(){
        CollectionDemo collectionDemo = new CollectionDemo();
        //collectionDemo.operateCollection();
        Assert.assertEquals(1,collectionDemo.operateCollection());
    }

    @Test
    public void shouldOperateVector() {
        CollectionDemo collectionDemo = new CollectionDemo();
        //collectionDemo.operateVector();
        Assert.assertEquals(1,collectionDemo.operateVector());
    }

    @Test
    public void shouldOperateHashTable() {
        CollectionDemo collectionDemo = new CollectionDemo();
        Assert.assertEquals("hi",collectionDemo.operateHashTable());
    }

    @Test
    public void shouldOperateArrayList() {
        CollectionDemo collectionDemo = new CollectionDemo();
        collectionDemo.operateArrayList();
    }

    @Test
    public void shouldOperateHashMap() {
        CollectionDemo collectionDemo = new CollectionDemo();
        //collectionDemo.operateHashMap();
        Assert.assertEquals(200, collectionDemo.operateHashMap());
    }

    @Test
    public void shouldOperateQueues() {
        CollectionDemo collectionDemo = new CollectionDemo();
        collectionDemo.operateQueues();
        //Assert.assertEquals(1, collectionDemo.operateQueues());
    }
}
