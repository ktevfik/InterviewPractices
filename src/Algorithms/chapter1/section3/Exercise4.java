/*
 * Copyright (c) 18.08.2021 21:45.
 * @author Mustafa Tevfik Kadan
 */

package Algorithms.chapter1.section3;

import edu.princeton.cs.algs4.*;

public class Exercise4 {
    public static void main(String[] args) {
        Exercise4 exercise4 = new Exercise4();

        String text1 = "[()]{}{[()()]()}";
        String text2 = "[(])";
        StdOut.println("Is balanced [()]{}{[()()]()}: " + exercise4.isBalanced(text1));
        StdOut.println("Is balanced [(]): " + exercise4.isBalanced(text2));
    }
    private boolean isBalanced(String input) {
        char[] parantheses = input.toCharArray();
        Stack<Character> stack = new Stack<>();

        for(char paranthesis : parantheses) {
            if(paranthesis == '(' || paranthesis == '[' ||paranthesis == '{') {
                stack.push(paranthesis);
            } else {
                if(stack.isEmpty()) {
                    return false;
                }
                char firstItem = stack.pop();
                if(paranthesis == ')' && firstItem != '('
                || paranthesis == ']' && firstItem != '['
                || paranthesis == '}' && firstItem != '{') {
                    return false;
                }
            }
        }
        return true;
    }
}
