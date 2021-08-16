/*
 * Copyright (c) 16.08.2021 13:30.
 * @author Mustafa Tevfik Kadan
 */

package Algorithms.chapter1.section1;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;


/*
1.1.38 - Binary search versus brute-force search

largeW.txt results: 1million number

Bruteforce: 760274
Duration: 9705800 nanoseconds.
BinarySearch: 760274
Duration: 112000 nanoseconds.

largeT.txt results: 10million number

Bruteforce: 7328283
Duration: 1325191800 nanoseconds.
BinarySearch: 7328279
Duration: 158600 nanoseconds.

For testing:
https://algs4.cs.princeton.edu/11model/tinyW.txt
https://algs4.cs.princeton.edu/11model/tinyT.txt
https://algs4.cs.princeton.edu/11model/largeW.txt
https://algs4.cs.princeton.edu/11model/largeT.txt

*/

public class Exercise38_BinarySearchVersusBruteForce {
    public static void main(String[] args) {
        int key = 760788;

        // Read the integers from a file
        In in = new In(args[0]);
        int[] array = in.readAllInts();

        // Sort the array
        Arrays.sort(array);

        // BRUTEFORCE
        long startTime = System.nanoTime();

        StdOut.println("Bruteforce: " + bruteForceSearch(key, array));

        long endTime = System.nanoTime();
        long duration = (endTime - startTime);

        StdOut.println("Duration: " + duration + " nanoseconds.");

        // BINARY SEARCH
        startTime = System.nanoTime();

        StdOut.println("BinarySearch: " + binarySearch(key, array, 0, array.length - 1));

        endTime = System.nanoTime();
        duration = (endTime - startTime);

        StdOut.println("Duration: " + duration + " nanoseconds.");
    }

    private static int bruteForceSearch(int key, int[] array) {
        if (array == null) {
            throw new IllegalArgumentException();
        }

        int result = -1;

        for (int i = 0; i < array.length; i++) {
            if (key == array[i]) {
                result = i;
            }
        }

        return result;
    }

    private static int binarySearch(int key, int[] array, int low, int high) {
        if (array == null) {
            throw new IllegalArgumentException();
        }

        if (low <= high) {
            int middle = low + (high - low) / 2;

            if (key < array[middle]) {
                return binarySearch(key, array, low, middle - 1);
            } else if (key > array[middle]) {
                return binarySearch(key, array, middle + 1, high);
            } else {
                return middle;
            }
        } else {
            return -1;
        }
    }
}
