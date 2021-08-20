/*
 * Copyright (c) 20.08.2021 02:20.
 * @author Mustafa Tevfik Kadan
 */

package Algorithms.chapter1.section3;
import edu.princeton.cs.algs4.*;
import java.util.NoSuchElementException;

public class Exercise7 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("String 1");
        stack.push("String 2");
        stack.push("String 4");
        stack.push("String 8");

        StdOut.println("Peek: " + stack.peek());
        StdOut.println("Expected: String 8\n");

        StdOut.println("Pop: " + stack.pop());
        StdOut.println("Expected: String 8\n");
        StdOut.println("Pop: " + stack.pop());
        StdOut.println("Expected: String 4");
    }
}

class Stack<Item> {
    private Node first;
    private int n;
    private class Node {
        Item item;
        Node next;
    }
    public boolean isEmpty() {
        return first == null;
    }
    public int size() {
        return n;
    }
    public void push(Item item) {
        Node oldFirst = first;
        first = new Node();
        first.item = item;
        first.next = oldFirst;
        n++;
    }
    public Item pop() throws NoSuchElementException {
        if(isEmpty()) {
            throw new NoSuchElementException("Stack underflow");
        }
        Item item = first.item;
        first = first.next;
        n--;
        return item;
    }
    public Item peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("Stack underflow");
        }
        return first.item;
    }
}