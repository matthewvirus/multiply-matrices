package com.epam.rd.autotasks.matrices;
import java.util.Arrays;

public class MultiplyMatrix {
    public static int[][] multiply(int[][] matrix1, int[][] matrix2) {
        // Put your code here
        int rows1 = 0;
        int col1rows2 = 0;
        int col2 = 0;
        for (int i = 0; i< matrix1.length; i++) {
            rows1 = matrix1.length;
            for (int j = 0; j < matrix1[0].length; j++) {
                col1rows2 = matrix1[0].length;
            }
        }
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[0].length; j++) {
                col2 = matrix2[0].length;
            }
        }
        int[][] resultMatrix = new int[rows1][col2];
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < col2; j++) {
                int r = 0;
                while (r != col1rows2) {
                    resultMatrix[i][j] += matrix1[i][r] * matrix2[r][j];
                    r++;
                }
            }
        }

        return resultMatrix;
    }

    public static void main(String[] args) {

        System.out.println("Test your code here!\n");

        // Get a result of your code

        int[][] a = {
                {0, 12345},
                {4509, 0},
                {3, 567} };

        int[][] b = {
                {653, 0, 25353},
                {0, 61, 6} };

        int[][] result = multiply(a, b);
        System.out.println(Arrays.deepToString(result).replace("],", "]\n"));
    }
}
