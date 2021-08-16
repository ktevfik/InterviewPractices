/*
 * Copyright (c) 16.08.2021 15:01.
 * @author Mustafa Tevfik Kadan
 */

package Algorithms.chapter1.section2;

import edu.princeton.cs.algs4.Counter;
import edu.princeton.cs.algs4.StdOut;

public class Exercise9 {
    static Counter counter = new Counter("Operations Count");

    public static void main(String[] args) {
        int[] arr = new int[3000];
        for (int i = 0; i < 3000; i++) arr[i] = i;
        int index = binarySearch(arr, 2432);
        StdOut.println(counter);
    }

    public static int binarySearch(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            counter.increment();
            if (key < arr[mid]) end = mid - 1;
            else if (key > arr[mid]) start = mid + 1;
            else return mid;
        }
        return -1;
    }
}
