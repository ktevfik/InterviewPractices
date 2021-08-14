/*
 * Copyright (c) 14.08.2021 19:39.
 * @author Mustafa Tevfik Kadan
 */

package Algorithms.chapter1.section1;

import edu.princeton.cs.algs4.StdOut;

public class Exercise13 {
    public static void main(String[] args) {
        int[][] mat = {
                {1, 2, 3},
                {4, 5, 6}
        };

        transpose(mat);
        StdOut.println("\nExpected:");
        StdOut.println("1 4 \n" +
                "2 5 \n" +
                "3 6 ");
    }

    public static void transpose(int[][] matrix) {
        int[][] newMatrix = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                newMatrix[j][i] = matrix[i][j];
            }
        }
        print(newMatrix);
    }

    public static void print(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.printf("%d ", matrix[i][j]);
            }
            System.out.println();
        }
    }
}
