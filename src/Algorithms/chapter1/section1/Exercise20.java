/*
 * Copyright (c) 14.08.2021 19:56.
 * @author Mustafa Tevfik Kadan
 */

package Algorithms.chapter1.section1;

import edu.princeton.cs.algs4.StdOut;

public class Exercise20 {
    public static void main(String[] args) {
        StdOut.println("ln(5!) = " + lnFactorial(5));
        StdOut.println("Expected: 4.787491742782046");
    }

    private static double lnFactorial(int n) {
        if (n == 1) {
            return 0;
        }
        return Math.log(n) + lnFactorial(n - 1);
    }
}
