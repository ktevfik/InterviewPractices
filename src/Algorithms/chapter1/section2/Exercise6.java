/*
 * Copyright (c) 16.08.2021 14:55.
 * @author Mustafa Tevfik Kadan
 */

package Algorithms.chapter1.section2;

import edu.princeton.cs.algs4.StdOut;

public class Exercise6 {
    public static void main(String[] args) {
        StdOut.println(isCircularShit("ACTGACG", "TGACGAC") ? "YES CIRCULAR SHIFT" : "NOT CIRCULAR SHIFT");
    }

    public static boolean isCircularShit(String s, String t) {
        return s.length() == t.length() && s.concat(s).contains(t);
    }
}
