/*
 * Copyright (c) 3.09.2021 14:14.
 * @author Mustafa Tevfik Kadan
 */

package Algorithms.chapter1.section3;

import edu.princeton.cs.algs4.Queue;

public class Exercise15 {
    private static void printItem(Queue<String> queue,int k) {
        int count = 0;
        for(String s : queue) {
            if(k == count) {
                System.out.println(s);
            }
            count++;
        }
    }
    public static void main(String[] args) {
        Queue<String> queue = new Queue<>();

        String[] input = {"0","1","2","3","4","5","6","7"};

        for(String s : input) {
            queue.enqueue(s);
        }
        printItem(queue,3);
    }
}
