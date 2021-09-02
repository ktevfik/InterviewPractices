/*
 * Copyright (c) 3.09.2021 01:21.
 * @author Mustafa Tevfik Kadan
 */

package ElementsOfProgrammingInterviewsInJava.PrimitiveTypes;

public class MultiplicationNoArithmeticOperators {
    public static void main(String[] args) {
        System.out.println(multiply(13,9));
    }

    public static long multiply(long x, long y) {
        long sum = 0;
        while (x != 0) {
            if ((x & 1) != 0) {
                sum = add(sum, y);
            }
            x >>>= 1;
            y <<= 1;
        }
        return sum;
    }

    private static long add(long x, long y) {
        long sum = 0, carryin = 0, k = 1, tempX = x, tempY = y;
        while (tempX != 0 || tempY != 0) {
            long xk = x & k, yk = y & k;
            long carryout = (xk & yk) | (xk & carryin) | (yk & carryin);
            sum |= (xk ^ yk ^ carryin);
            carryin = carryout << 1;
            k <<= 1;
            tempX >>>= 1;
            tempY >>>= 1;
        }
        return sum | carryin;
    }
}
