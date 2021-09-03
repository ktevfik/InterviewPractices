/*
 * Copyright (c) 3.09.2021 03:05.
 * @author Mustafa Tevfik Kadan
 */

package ElementsOfProgrammingInterviewsInJava.PrimitiveTypes;

public class ReverseDigits {
    public static void main(String[] args) {
        System.out.println(reverseDigits(4313));
    }

    public static long reverseDigits(long x) {
        long result = 0;
        long xRemaining = Math.abs(x);
        while (xRemaining != 0) {
            result = result * 10 + xRemaining % 10;
            xRemaining /= 10;
        }
        return result;
    }
}
