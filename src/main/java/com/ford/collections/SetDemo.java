package com.ford.collections;

import java.util.*;

public class SetDemo {
    public Set printNumbers() {
        Set<Integer> set = new HashSet<>();
        set.add(6);
        set.add(2);
        set.add(2);
        System.out.println(set);
        return set;
    }

    public Set<Integer> printNumbersFromLinkedHashSet() {
        Set<Integer> set = new LinkedHashSet<>();
        set.add(7);
        set.add(2);
        set.add(3);
        System.out.println(set);
        return set;
    }

    public Set<Integer> sortNumbersFromTreeSet() {
        NavigableSet<Integer> set = new TreeSet<>();
        set.add(7);
        set.add(2);
        set.add(3);
        System.out.println(set.descendingSet());
        return set;
    }
}
