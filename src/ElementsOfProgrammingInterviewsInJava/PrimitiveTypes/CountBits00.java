/*
 * Copyright (c) 2.09.2021 13:58.
 * @author Mustafa Tevfik Kadan
 */

package ElementsOfProgrammingInterviewsInJava.PrimitiveTypes;

public class CountBits00 {
    public static void main(String[] args) {
        System.out.println(countBits(255));
        System.out.println(countBits(63));
        System.out.println(countBits(1));
        System.out.println(countBits(0));
        System.out.println(countBits(149));
    }

    // Counting 1's in the number
    public static short countBits(int x) {
        short numBits = 0;
        while (x != 0) {
            numBits += (x & 1);
            x >>>= 1;
        }
        return numBits;
    }
}
