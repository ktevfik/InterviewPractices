/*
 * Copyright (c) 18.08.2021 21:53.
 * @author Mustafa Tevfik Kadan
 */

package Algorithms.chapter1.section3;

import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdOut;

public class Exercise5 {
    private static void decimalToBinary(int n) {
        Stack<Integer> stack = new Stack<>();
        while(n > 0) {
            stack.push(n % 2);
            n = n / 2;
        }
        for(int d : stack) {
            StdOut.print(d);
        }
        StdOut.println();
    }
    public static void main(String[] args) {
        decimalToBinary(50);
        StdOut.println("Expected: 110010");
    }
}
