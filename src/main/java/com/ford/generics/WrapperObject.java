package com.ford.generics;

public class WrapperObject<T> {
    private T input;

    public void set(T input){

        this.input = input;
    }
    public T get(){
        return input;
    }
}
