/*
 * Copyright (c) 1.09.2021 18:00.
 * @author Mustafa Tevfik Kadan
 */

package DataStructuresAndAlgorithmsInJava.chapter1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        inputAllBaseTypes();
    }

    private static void inputAllBaseTypes() {
        Scanner stdIn = new Scanner(System.in);
        List<Object> list = new ArrayList<>();
        // basic types: int, short, long, char, byte, boolean, float, double
        short aShort = stdIn.nextShort();
        int anInt = stdIn.nextInt();
        long aLong = stdIn.nextLong();
        char aChar = stdIn.next().charAt(0);
        byte aByte = stdIn.nextByte();
        boolean aBoolean = stdIn.nextBoolean();
        float aFloat = stdIn.nextFloat();
        double aDouble = stdIn.nextDouble();

        list.add(aShort);
        list.add(anInt);
        list.add(aLong);
        list.add(aChar);
        list.add(aByte);
        list.add(aBoolean);
        list.add(aFloat);
        list.add(aDouble);

        System.out.println(list);
    }
}
