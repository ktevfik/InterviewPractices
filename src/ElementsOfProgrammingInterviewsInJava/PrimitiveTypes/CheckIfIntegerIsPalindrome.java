/*
 * Copyright (c) 3.09.2021 03:08.
 * @author Mustafa Tevfik Kadan
 */

package ElementsOfProgrammingInterviewsInJava.PrimitiveTypes;

public class CheckIfIntegerIsPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(157751));
        System.out.println(isPalindrome(1577513));
    }

    public static boolean isPalindrome(int x) {
        if (x < 0) return false;
        final int numDigits = (int) (Math.floor(Math.log10(x))) + 1;
        int msdMask = (int) Math.pow(10, numDigits - 1);
        for (int i = 0; i < (numDigits / 2); i++) {
            if (x / msdMask != x % 10) return false;
            x %= msdMask;
            x /= 10;
            msdMask /= 100;
        }
        return true;
    }
}
