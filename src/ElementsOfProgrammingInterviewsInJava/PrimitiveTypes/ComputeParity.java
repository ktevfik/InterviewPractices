/*
 * Copyright (c) 2.09.2021 14:09.
 * @author Mustafa Tevfik Kadan
 */

package ElementsOfProgrammingInterviewsInJava.PrimitiveTypes;

public class ComputeParity {
    public static void main(String[] args) {
        System.out.println(isParity(144));
        System.out.println(isParity(1));
        System.out.println(isParity(63));
    }

    // Time complexity O(n)
    public static boolean isParity(long x) {
        short numBits = 0;
        while (x != 0) {
            numBits += (x & 1);
            x >>>= 1;
        }
        return numBits % 2 == 1;
    }
//    Time complexity O(n)
//    public static short parity(long x) {
//        short result = 0;
//        while (x != 0) {
//            result ^= (x & 1);
//            x >>>= 1;
//        }
//        return result;
//    }
//
//    Time complexity O(k)
//    public static short parity (long x) {
//        short result = 0;
//        while (x != 0) {
//            result ^= 1;
//            x &= (x - 1); // Drops the lowest set bit of x.
//        }
//        return result; // e.g. 10001010 k = 3(number of 1's) O(k)
//    }
//
//    Index lookup table O(n/L)
//    public static short parity(long x) {
//        final int WORD_SIZE = 16;
//        final int BIT_MASK = 0xFFFF;
//        return (short) (
//                precomputedParity[(int)((x >>> (3 * WORD_SIZE)) & BIT_MASK)] ^
//                precomputedParity[(int)((x >>> (2 * WORD_SIZE)) & BIT_MASK)] ^
//                precomputedParity[(int)((x >>> WORD_SIZE) & BIT_MASK)] ^
//                precomputedParity[(int)((x & BIT_MASK)]
//                )
//    }
//    public static short parity(long x) { // best for 64 bit words "
//        x ^= x >>> 32;
//        x ^= x >>> 16;
//        x ^= x >>> 8;
//        x ^= x >>> 4;
//        x ^= x >>> 2;
//        x ^= x >>> 1;
//        return (short) (x & 0x1);
//    }
}
