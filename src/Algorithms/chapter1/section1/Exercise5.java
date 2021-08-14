/*
 * Copyright (c) 14.08.2021 18:27.
 * @author Mustafa Tevfik Kadan
 */

package Algorithms.chapter1.section1;

import edu.princeton.cs.algs4.StdOut;

public class Exercise5 {

    public static void main(String[] args) {
        isStrictlyBetween0And1(1.12, 1.33);
        StdOut.println("Expected: false");

        isStrictlyBetween0And1(0.2, 1);
        StdOut.println("Expected: false");

        isStrictlyBetween0And1(0.5, 0.75);
        StdOut.println("Expected: true");
    }

    private static void isStrictlyBetween0And1(double x, double y) {
        if (x > 0 && x < 1 && y > 0 && y < 1) {
            StdOut.println("true");
        } else {
            StdOut.println("false");
        }
    }
}
