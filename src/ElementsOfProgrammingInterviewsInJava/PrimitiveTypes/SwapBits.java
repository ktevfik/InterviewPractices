/*
 * Copyright (c) 2.09.2021 16:41.
 * @author Mustafa Tevfik Kadan
 */

package ElementsOfProgrammingInterviewsInJava.PrimitiveTypes;

public class SwapBits {
    public static void main(String[] args) {
        System.out.println(swapBits(73,6,1)); // Expected 11 01001001 -> 00001011
    }
    // Time complexity O(1)
    public static long swapBits(long x,int i,int j) {
        // We are checking ith bit and jth bit, if they differs.
        if(((x >>> i) & 1) != ((x >>> j) & 1)) {
            // We are just flipping values because if the values differs 0->1 and 1->0
            long bitMask = (1L << i) | (1L << j);
            x ^= bitMask;
        }
        return x;
    }
}
