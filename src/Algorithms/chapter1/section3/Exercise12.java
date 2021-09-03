/*
 * Copyright (c) 3.09.2021 13:55.
 * @author Mustafa Tevfik Kadan
 */

package Algorithms.chapter1.section3;

import edu.princeton.cs.algs4.Stack;

public class Exercise12 {
    private static Stack<String> copy(Stack<String> stack) {
        Stack<String> temp = new Stack<>();
        Stack<String> copy = new Stack<>();

        for (String s : stack) {
            temp.push(s);
        }
        for (String s : temp) {
            copy.push(s);
        }
        return copy;
    }

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("ilk");
        stack.push("iki");
        stack.push("uc");

        Stack<String> copy = copy(stack);

        stack.pop();
        stack.pop();

        for (String s : copy) {
            System.out.println(s);
        }
    }
}
