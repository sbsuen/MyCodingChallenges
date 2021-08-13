package com.matrix;

public class RotateMatrix {
    /*Given an image in an NxN matrix, where each pixel is represented by an int, write a
    * method to rotate the image by 90 degrees. Can you do this in place?
    *
    * Hints:
    * Can you rotate a specific layer? Think layer by layer.
    * Rotating a specific layer would just mean swapping the values in four arrays.
    * If you were asked to swap the values in two arrays could you do this? Can you extend
    * it to four arrays?
    * */

    public static int[][] rotateImageWithTemp(int[][] image){
        int[][] result = new int[image.length][image.length];
        int last = image.length - 1;
        for(int i=0; i<image.length; i++){
            for(int j=0; j<image.length; j++){
                result[j][last] = image[i][j];
            }
            last--;
        }
        return result;
    }

    public static void rotate(int[][] matrix) {
        transpose(matrix);
        reverse(matrix);
    }

    public static void transpose(int[][] matrix){
        for(int i=0; i<matrix.length; i++){
            for(int j=i; j<matrix.length; j++){
                int temp = matrix[j][i];
                matrix[j][i] = matrix[i][j];
                matrix[i][j] = temp;
            }
        }
    }

    public static void reverse(int[][] matrix){
        int n = matrix.length;
        for(int i=0; i<n; i++){
            for(int j=0; j<n/2; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n-j-1];
                matrix[i][n-j-1] = temp;
            }
        }
    }

    public static void printImage(int[][] image){
        for(int i=0; i<image.length; i++){
            for(int j=0; j<image.length; j++)
                System.out.print(image[i][j] + " ");
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        int[][] image = {{1,2,3},{4,5,6},{7,8,9}};
        printImage(image);
        System.out.println("------");
        printImage(rotateImageWithTemp(image));
    }
}
