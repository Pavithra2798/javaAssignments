package com.ford.array;

public class ArraySplit {
    public void splitArrayInTheMiddle() {
        int[] integerArray = new int[]{1,2,3,4,5,6,7,8,9,10};
        int middle = integerArray.length/2;
        int[] arrayOfFirstHalf = new int[middle];
        int[] arrayOfSecondHalf = new int[middle+1];
        for(int index = 0;index < middle;index++){
            arrayOfFirstHalf[index] = integerArray[index];
            System.out.print(arrayOfFirstHalf[index]+" ");
        }
        System.out.println("\n");
        int arrayIndex= 0;
        for(int index = middle;index < integerArray.length;index++){
            arrayOfSecondHalf[arrayIndex] = integerArray[index];
            System.out.print(arrayOfSecondHalf[arrayIndex]+" ");
            arrayIndex++;

        }
        //System.out.println(middle);

    }
}
