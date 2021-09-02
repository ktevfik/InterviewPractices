/*
 * Copyright (c) 3.09.2021 02:13.
 * @author Mustafa Tevfik Kadan
 */

package ElementsOfProgrammingInterviewsInJava.PrimitiveTypes;

public class ComputeDivision {
    public static void main(String[] args) {
        System.out.println(division(20, 5));
    }

    public static long division(long x, long y) {
        long result = 0;
        int power = 32;
        long yPower = y << power;
        while (x >= y) {
            while (yPower > x) {
                yPower >>>= 1;
                --power;
            }
            result += 1L << power;
            x -= yPower;
        }
        return result;
    }
}
