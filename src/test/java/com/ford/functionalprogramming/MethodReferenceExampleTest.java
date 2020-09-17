package com.ford.functionalprogramming;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceExampleTest {
    @Test
    public void shouldPrintGivenString() {
        List<String> list = Arrays.asList("pavi", "ashi", "vidhi");
        //list.forEach(input -> System.out.println(input));// input takes the value of each item
        // in the list and does sysout
        //for multiple output lines use sysout in curly braces
        list.forEach(System.out::println);//more precise for printing list items


    }

    @Test
    public void shouldSortArray() {
        String[] strings = new String[]{"Pavi","ashi","vidhi"};
        //Arrays.sort(strings);//sorts case sensitive
        Arrays.sort(strings, String::compareToIgnoreCase);
        for (String s:strings
             ) {
            System.out.println(s);
        }
    }
}
