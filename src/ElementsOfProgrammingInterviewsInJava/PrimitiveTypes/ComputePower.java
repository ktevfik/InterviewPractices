/*
 * Copyright (c) 3.09.2021 02:22.
 * @author Mustafa Tevfik Kadan
 */

package ElementsOfProgrammingInterviewsInJava.PrimitiveTypes;

public class ComputePower {
    public static void main(String[] args) {
        System.out.println(power(4D, 3)); // 64.0
        System.out.println(power(4.3D, 3)); // 79.5069999999999
    }

    public static double power(double x, int y) {
        double result = 1d;
        long power = y;
        if (y < 0) {
            power = -power;
            x = 1d / x;
        }
        while (power != 0) {
            if ((power & 1) != 0) {
                result *= x;
            }
            x *= x;
            power >>>= 1;
        }
        return result;
    }
}
