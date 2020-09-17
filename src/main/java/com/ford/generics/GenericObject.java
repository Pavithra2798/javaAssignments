package com.ford.generics;

public class GenericObject {
    public <E> E[] createCommonArray(E[] inputArray){
//        for (E e : inputArray) {
//            System.out.printf("%S", e);
//        }
        return inputArray;
    }
}
