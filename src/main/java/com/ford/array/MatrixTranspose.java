package com.ford.array;

public class MatrixTranspose {
    int[][] transposeMatrix = new int[4][4];
    public int[][] transposeOfTheMatrix() {

        int[][] matrix = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        for(int row = 0;row < matrix.length;row++){
            for(int column = 0;column< matrix.length;column++){
                transposeMatrix[row][column] = matrix[column][row];
                System.out.print(transposeMatrix[row][column]+" ");
            }
            System.out.println();
        }
        return transposeMatrix;
    }
}
