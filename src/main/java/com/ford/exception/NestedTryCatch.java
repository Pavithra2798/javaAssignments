package com.ford.exception;

public class NestedTryCatch {
    public Object throwingException() throws Exception {
        int[] numbers = {1,2,3,4};
        int number = 0,reminder = 0;
        try{
            reminder = numbers[2]/0;
            try{
                number = numbers[4];
            } catch (ArrayIndexOutOfBoundsException e1) {
                e1.printStackTrace();
            }
        } catch (ArithmeticException e2) {
            e2.printStackTrace();
            System.out.println("This is the outer catch block");
            return reminder;
        }
        finally {
            System.out.println("This is the finally block");
        }
        return null;
    }
}
