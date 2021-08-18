/*
 * Copyright (c) 18.08.2021 21:36.
 * @author Mustafa Tevfik Kadan
 */

package Algorithms.chapter1.section3;
import edu.princeton.cs.algs4.*;
public class Exercise2 {
    public static void main(String[] args) throws NoSuchFieldException {
        ExampleLinkedStack<String> stack = new ExampleLinkedStack<>();

        while (!StdIn.isEmpty()) {
            String item = StdIn.readString();

            if (!item.equals("-")) {
                stack.push(item);
            } else if (!stack.isEmpty()) {
                StdOut.print(stack.pop() + " ");
            }
        }
        StdOut.println("(" + stack.size() + " left on stack)");
    }
}

class ExampleLinkedStack<Item> {
    private Node first;
    private int n;

    private class Node {
        Item item;
        Node next;
    }

    public boolean isEmpty() {
        return n == 0;
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
    public Item pop() throws NoSuchFieldException {
        if(isEmpty()) {
            throw new NoSuchFieldException("Stack underflow");
        }
        Item item = first.item;
        first = first.next;
        n--;
        return item;
    }
}
