/*
 * Copyright (c) 20.08.2021 02:33.
 * @author Mustafa Tevfik Kadan
 */

package Algorithms.chapter1.section3;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Iterator;

public class Exercise8 {
    public static void main(String[] args) {
        ResizingArrayStackOfStrings resizingArrayStackOfStrings = new ResizingArrayStackOfStrings();

        while (!StdIn.isEmpty()) {
            String item = StdIn.readString();

            if (!item.equals("-")) {
                resizingArrayStackOfStrings.push(item);
            } else if (!resizingArrayStackOfStrings.isEmpty()) {
                StdOut.print(resizingArrayStackOfStrings.pop() + " ");
            }
        }
        StdOut.println("(" + resizingArrayStackOfStrings.size() + " left on stack)");
    }
}

class ResizingArrayStackOfStrings implements Iterable<String> {
    private String[] items = new String[1];
    private int n = 0;

    public boolean isEmpty() {
        return n == 0;
    }

    public int size() {
        return n;
    }

    public void resize(int max) {
        String[] temp = new String[max];
        for (int i = 0; i < n; i++) {
            temp[i] = items[i];
        }
        items = temp;
    }

    public void push(String item) {
        if (n == items.length) {
            resize(n * 2);
        }
        items[n++] = item;
    }

    public String pop() {
        String item = null;
        if (!isEmpty()) {
            item = items[n--];
        }
        if (!isEmpty()) {
            items[n] = null; //to avoid loitering
        }

        if (n > 0 && n == items.length / 4) {
            resize(items.length / 2);
        }

        return item;
    }

    public Iterator<String> iterator() {
        return new ReverseArrayIterator();
    }

    private class ReverseArrayIterator implements Iterator<String> {

        int index = n;

        public boolean hasNext() {
            return index > 0;
        }

        public String next() {
            return items[--index];
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }
}