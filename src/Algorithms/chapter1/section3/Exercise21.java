/*
 * Copyright (c) 3.09.2021 16:44.
 * @author Mustafa Tevfik Kadan
 */

package Algorithms.chapter1.section3;

public class Exercise21 {
    public static boolean find(LinkedList<String> linkedList, String item) {
        for(String s:linkedList) {
            if(s.equals(item)) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.insert("1");
        linkedList.insert("2");
        linkedList.insert("3");
        linkedList.insert("4");
        linkedList.insert("5");

        System.out.println(find(linkedList,"9")); // false;
        System.out.println(find(linkedList,"3")); // true;
    }
}
