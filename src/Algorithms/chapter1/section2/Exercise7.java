/*
 * Copyright (c) 16.08.2021 14:59.
 * @author Mustafa Tevfik Kadan
 */

package Algorithms.chapter1.section2;

import edu.princeton.cs.algs4.StdOut;

public class Exercise7 {
    public static void main(String[] args) {
        StdOut.println(mystery("mustafa"));
    }

    public static String mystery(String s) {
        int N = s.length();
        if (N <= 1) return s;
        String a = s.substring(0, N / 2);
        String b = s.substring(N / 2, N);
        return mystery(b) + mystery(a);
    }
}
