/*
 * Copyright (c) 1.09.2021 22:18.
 * @author Mustafa Tevfik Kadan
 */

package DataStructuresAndAlgorithmsInJava.chapter2;

public class GenericDemo {
    public static <T> void reverse(T[] data) {
        int low = 0, high = data.length - 1;
        while (low < high) {
            T temp = data[low];
            data[low++] = data[high];
            data[high--] = temp;
        }
    }
}
