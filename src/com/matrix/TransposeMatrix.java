package com.matrix;

public class TransposeMatrix {
    public static int[][] transpose(int[][] matrix){
        int[][] result = new int[matrix[0].length][matrix.length];

        for(int i=0; i < matrix[0].length; i++){
            for(int j=0; j < matrix.length; j++){
                result[i][j] = matrix[j][i];
            }
        }
        return result;
    }

    public static void printMatrix(int[][] matrix){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++)
                System.out.print(matrix[i][j] + " ");
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] matrixTwo = {{1,2,3},{4,5,6}};

        printMatrix(matrix);
        printMatrix(transpose(matrix));
        printMatrix(matrixTwo);
        printMatrix(transpose(matrixTwo));
    }
}
