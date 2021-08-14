/*
 * Copyright (c) 14.08.2021 19:38.
 * @author Mustafa Tevfik Kadan
 */

package Algorithms.chapter1.section1;

public class Exercise12 {
    public static void main(String[] args) {
        int[] a = new int[10];
        for (int i = 0; i < 10; i++) {
            a[i] = 9 - i;
        }
        for (int i = 0; i < 10; i++) {
            a[i] = a[a[i]];
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}
