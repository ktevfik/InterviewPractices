/*
 * Copyright (c) 14.08.2021 19:59.
 * @author Mustafa Tevfik Kadan
 */

package Algorithms.chapter1.section1;

import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

public class Exercise22 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int key = 2;

        Arrays.sort(arr);

        int index = binarySearch(key, arr, 0, arr.length - 1, 0);

        StdOut.println();
        StdOut.println("Index: " + index);

        StdOut.println("\nExpected:");
        StdOut.println("start: 0 - end: 6\n" +
                " start: 0 - end: 2\n" +
                "Index: 1");
    }

    public static int binarySearch(int key, int[] arr, int start, int end, int depth) {
        if (depth != 0) {
            StdOut.println();
        }

        for (int i = 0; i < depth; i++) {
            StdOut.print(" ");
        }

        StdOut.println("start: " + start + " - end: " + end);

        if (start <= end) {
            int mid = start + (end - start) / 2;
            if (key < arr[mid]) {
                return binarySearch(key, arr, start, mid - 1, ++depth);
            } else if (key > arr[mid]) {
                return binarySearch(key, arr, mid + 1, end, ++depth);
            } else return mid;
        }
        return -1;
    }
}
