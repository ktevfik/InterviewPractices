/*
 * Copyright (c) 15.08.2021 00:49.
 * @author Mustafa Tevfik Kadan
 */

package Algorithms.chapter1.section1;

import edu.princeton.cs.algs4.StdOut;

public class Exercise26 {
    public static void main(String[] args) {
        int a = 99, b = 10, c = 5, t = 0;

        if (a > b) {
            t = a;
            a = b;
            b = t;
        }
        if (a > c) {
            t = a;
            a = c;
            c = t;
        }
        if (b > c) {
            t = b;
            b = c;
            c = t;
        }
        StdOut.println("a: " + a);
        StdOut.println("b: " + b);
        StdOut.println("c: " + c);
    }
}
