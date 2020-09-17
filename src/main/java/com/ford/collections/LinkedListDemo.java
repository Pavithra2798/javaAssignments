package com.ford.collections;

import java.util.LinkedList;
import java.util.*;

public class LinkedListDemo {

    public void sortLinkedList(int number) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(5);
        linkedList.add(6);
        linkedList.add(8);
        linkedList.add(9);
        linkedList.add(number);
        System.out.println(linkedList);
        Collections.sort(linkedList);
        System.out.println(linkedList);
    }
}
