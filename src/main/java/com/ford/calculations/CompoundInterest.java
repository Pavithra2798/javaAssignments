package com.ford.calculations;

public class CompoundInterest {
    public double compoundInterestCalculation(int years, int principle, float rate) {

        return principle*(Math.pow(1+(rate/100),years))-principle;

    }
    /*public static void main(String args[]){
        CompoundInterest obj = new CompoundInterest();
        obj.compoundInterestCalculation(2,20000,5);
        System.out.println(obj.compoundInterestCalculation(2,20000,5));
    }*/
}
