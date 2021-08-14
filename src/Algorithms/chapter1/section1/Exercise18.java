/*
 * Copyright (c) 14.08.2021 19:49.
 * @author Mustafa Tevfik Kadan
 */

package Algorithms.chapter1.section1;

import edu.princeton.cs.algs4.StdOut;

public class Exercise18 {
    public static void main(String[] args) {
        StdOut.println(mystery(2, 25));
        StdOut.println(mystery(3, 11));
        StdOut.println(mystery2(2, 25));
        StdOut.println(mystery2(3, 11));
    }

    public static int mystery(int a, int b) {
        if (b == 0) return 0;
        if (b % 2 == 0) return mystery(a + a, b / 2);
        return mystery(a + a, b / 2) + a;
    }

    public static int mystery2(int a, int b) {
        if (b == 0) return 1;
        if (b % 2 == 0) return mystery2(a * a, b / 2);
        return mystery2(a * a, b / 2) * a;
    }
}
