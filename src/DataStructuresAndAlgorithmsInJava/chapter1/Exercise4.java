/*
 * Copyright (c) 1.09.2021 20:09.
 * @author Mustafa Tevfik Kadan
 */

package DataStructuresAndAlgorithmsInJava.chapter1;
import java.util.*;
public class Exercise4 {
    public static void main(String[] args) {
        System.out.println(isEven(4));
        System.out.println(sum(5));
        System.out.println(oddSum(35));
        System.out.println(sumPow(32));
    }
    public static boolean isEven(int n) {
        return n % 2 == 0;
    }
    public static int sum(int n) {
        int result = 0;
        for(int i = 1;i <= n;i++) result += i;
        return result;
    }
    public static int oddSum(int n) {
        int result = 0;
        for(int i = 1;i <= n;i++) {
            if(i % 2 == 1) result += i;
        }
        return result;
    }
    public static int sumPow(int n) {
        int result = 0;
        for(int i = 1;i <= n;i++) result += (i * i);
        return result;
    }
}
