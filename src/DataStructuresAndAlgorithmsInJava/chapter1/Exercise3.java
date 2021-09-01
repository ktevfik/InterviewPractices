/*
 * Copyright (c) 1.09.2021 18:07.
 * @author Mustafa Tevfik Kadan
 */

package DataStructuresAndAlgorithmsInJava.chapter1;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("Please input two numbers for n and m: ");
        long n = stdIn.nextLong();
        long m = stdIn.nextLong();
        System.out.println(isMultiple(n, m));
    }

    private static boolean isMultiple(long n, long m) {
        if (m > n) {
            return isMultiple(m, n);
        }
        return n % m == 0;
    }
}
