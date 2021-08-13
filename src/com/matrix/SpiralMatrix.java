package com.matrix;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

    public static List<Integer> spiralMatrix(int[][] matrix){
        ArrayList<Integer> result = new ArrayList<>();
        if (matrix.length == 0) return result;

        int firstRow = 0, lastRow = matrix.length - 1;
        int firstCol = 0, lastCol = matrix[0].length - 1;

        while (firstRow <= lastRow && firstCol <= lastCol){
            for(int c=firstCol; c <= lastCol; c++)
                result.add(matrix[firstRow][c]);
            for(int r=firstRow+1; r <= lastRow; r++)
                result.add(matrix[r][lastCol]);
            if (firstRow < lastRow && firstCol < lastCol){
                for(int c=lastCol - 1; c > firstCol; c--)
                    result.add(matrix[lastRow][c]);
                for(int r=lastRow; r > firstRow; r--)
                    result.add(matrix[r][firstCol]);
            }
            firstCol++;
            lastCol--;
            firstRow++;
            lastRow--;
        }
        return result;
    }

    public static int[][] generateSpiralMatrix(int n){
        int[][] matrix = new int[n][n];

        int firstRow = 0, lastRow = n - 1;
        int firstCol = 0, lastCol = n - 1;
        int counter = 1;
        while (firstRow <= lastRow && firstCol <= lastCol){
            for(int c=firstCol; c <= lastCol; c++) {
                matrix[firstRow][c] = counter;
                counter++;
            }
            for(int r=firstRow+1; r <= lastRow; r++){
                matrix[r][lastCol] = counter;
                counter++;
            }
            if (firstRow < lastRow && firstCol < lastCol){
                for(int c=lastCol-1; c>=firstCol; c--){
                    matrix[lastRow][c] = counter;
                    counter++;
                }
                for(int r=lastRow-1; r>=firstRow+1; r--){
                    matrix[r][firstCol] = counter;
                    counter++;
                }
            }
            firstCol++;
            lastCol--;
            firstRow++;
            lastRow--;
        }
        return matrix;
    }

    public static void main(String[] args) {
        int[][] matrix = { {1,2,3}, {4,5,6}, {7,8,9} };
        ArrayList<Integer> spiral = (ArrayList<Integer>) spiralMatrix(matrix);
        for(Integer number : spiral){
            System.out.print(number + ", ");
        }
    }
}
