package com.matrix;

import java.util.Arrays;

public class RotationEquals {
    public static boolean findRotation(int[][] mat, int[][] target) {
        for(int i=0; i<4; i++){
            if (Arrays.deepEquals(mat, target)) return true;
            rotate(mat);
        }
        return false;
    }

    private static void rotate(int[][] matrix) {
        transpose(matrix);
        reverse(matrix);
    }

    private static void transpose(int[][] matrix){
        for(int i=0; i<matrix.length; i++){
            for(int j=i; j<matrix.length; j++){
                int temp = matrix[j][i];
                matrix[j][i] = matrix[i][j];
                matrix[i][j] = temp;
            }
        }
    }

    private static void reverse(int[][] matrix){
        int n = matrix.length;
        for(int i=0; i<n; i++){
            for(int j=0; j<n/2; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n-j-1];
                matrix[i][n-j-1] = temp;
            }
        }
    }
}
