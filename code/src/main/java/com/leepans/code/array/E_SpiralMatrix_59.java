package com.leepans.code.array;

import java.util.Arrays;

/**
 * @Author Victor
 * @Date 2026-05-31 5:44 p.m.
 */

public class E_SpiralMatrix_59 {

    public static int[][] generateMatrix(int n) {

        int nums[][] = new int[n][n];

        int startX = 0;
        int startY = 0;

        int offset = 1;
        int count = 1;
        int loop = 0;

        int j;
        int i;
        while (loop < n / 2) {
            for (j = startY; j < n - offset; j++) {
                nums[startX][j] = count++;
            }
            for (i = startX; i < n - offset; i++) {
                nums[i][j] = count++;
            }
            for (; j > startY; j--) {
                nums[i][j] = count++;
            }
            for (; i > startX; i--) {
                nums[i][j] = count++;
            }
            offset++;
            loop++;

            startX++;
            startY++;
        }
        if (n % 2 == 1) {
            nums[startX][startY] = count;
        }
        return nums;
    }

    public static void printMatrix(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {

                System.out.printf("%4d", matrix[i][j]);
            }

            System.out.println();
        }

        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("==========Test==========");
        int n = 3;
        printMatrix(generateMatrix(n));

        n = 4;
        printMatrix(generateMatrix(n));

        n = 5;
        printMatrix(generateMatrix(n));
    }
}
