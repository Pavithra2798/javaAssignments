package com.ford.functionalprogramming;

public class FunctionalClass implements FunctionalInterfaceAddition {
    @Override
    public int addTwoNumbers(int number1, int number2) {
        int sum = number1+number2;
        return sum;
    }
}
@FunctionalInterface
interface FunctionalInterfaceAddition{
    public int addTwoNumbers(int number1, int number2);
}
