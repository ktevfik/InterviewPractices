/*
 * Copyright (c) 16.08.2021 13:03.
 * @author Mustafa Tevfik Kadan
 */

package Algorithms.chapter1.section1;

import edu.princeton.cs.algs4.StdOut;

public class Exercise30_ArrayExercise {
    public static void main(String[] args) {
        int n = 5;
        boolean[][] array = createCoprimeArray(n);
        printArray(array);
    }

    public static boolean[][] createCoprimeArray(int n) {
        boolean[][] array = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = isCoprime(i, j);
            }
        }
        return array;
    }

    public static void printArray(boolean[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                StdOut.printf("%6b", array[i][j]);
            }
            StdOut.println();
        }
    }

    public static boolean isCoprime(int a, int b) {
        if (a == b && a != 1) {
            return false;
        }

        if (a == 0 || b == 0) {
            return handleZero(a, b);
        }

        return gcd(a, b) == 1;
    }

    public static boolean handleZero(int a, int b) {
        return (a == 0 && b == 1) || (a == 0 && b == -1) || (b == 0 && a == 1) || (b == 0 && a == -1);
    }

    public static int gcd(int a, int b) {
        if (b == 0) return a;

        return gcd(b, a % b);
    }
}
