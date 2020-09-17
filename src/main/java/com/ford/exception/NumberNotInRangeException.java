package com.ford.exception;

public class NumberNotInRangeException extends Exception {
    public NumberNotInRangeException(String s) {
        super(s);
    }

//    public NumberNotInRangeException() {
//
//    }

    public void newCustomException(int number) {
        try{
            validate(number);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void validate(int number) throws NumberNotInRangeException {
        if(number > 50 || number < 0) {
            throw new NumberNotInRangeException("Invalid Number");
        }
        else{
            System.out.println("Valid number");
        }
    }

//    public void newCustomException(int number) throws NumberNotInRangeException{
//        if(number > 50 || number < 0){
//            throw new NumberNotInRangeException("Invalid Number");
//        }
//    }
}
