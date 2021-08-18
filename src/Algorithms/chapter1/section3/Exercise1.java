/*
 * Copyright (c) 18.08.2021 21:31.
 * @author Mustafa Tevfik Kadan
 */

package Algorithms.chapter1.section3;
import edu.princeton.cs.algs4.*;
public class Exercise1 {
    public static void main(String[] args) {
        FixedCapacityStackOfStrings example = new FixedCapacityStackOfStrings(2);
        StdOut.println("Is Full 1: " + example.isFull() + " Expected: false");
        example.push("a");
        example.push("b");
        StdOut.println("Is Full 2: " + example.isFull() + " Expected: true");
    }
}

class FixedCapacityStackOfStrings {
    private String[] a;
    private int n;

    public FixedCapacityStackOfStrings(int capacity) {
        a = new String[capacity];
    }

    public boolean isEmpty() {
        return n == 0;
    }

    public int size() {
        return n;
    }
    public void push(String item) {
        a[n++] = item;
    }

    public String pop() {
        return a[--n];
    }

    public boolean isFull() {
        return n == a.length;
    }
}