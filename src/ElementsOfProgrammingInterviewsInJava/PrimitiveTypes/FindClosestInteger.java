/*
 * Copyright (c) 2.09.2021 19:35.
 * @author Mustafa Tevfik Kadan
 */

package ElementsOfProgrammingInterviewsInJava.PrimitiveTypes;

public class FindClosestInteger {
    public static void main(String[] args) {
        System.out.println(closestIntSameBitCount(65535));
    }
    public static long closestIntSameBitCount(long x) {
        for (int i = 0; i < 62; i++) {
            if (((x >>> i) & 1) != ((x >>> i + 1) & 1)) {
                long MASK = ((1 << i) | (1 << i + 1));
                return x ^ MASK;
            }
        }
        return x;
    }
}
