package com.ford.exception;

public class TryBlockException {

    public int shouldThrowException(int dividend, int divisor) throws Exception {

        int result = 0;

        try {
            result = dividend/divisor;
        } catch (ArithmeticException e) {
            e.printStackTrace();
            return -1;
        }
        finally {
            System.out.println("This is a statement in finally");
            return result;

        }

    }
}
