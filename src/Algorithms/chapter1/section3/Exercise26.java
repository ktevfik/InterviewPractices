/*
 * Copyright (c) 3.09.2021 23:37.
 * @author Mustafa Tevfik Kadan
 */

package Algorithms.chapter1.section3;

import javax.swing.plaf.IconUIResource;
import java.util.Iterator;

public class Exercise26<Item> implements Iterable<Item> {
    private class Node {
        public Item item;
        public Node next;

        public Node(Item item) {
            this.item = item;
        }
    }

    private int size;
    private Node first;

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public Node getFirstNode() {
        return first;
    }

    public void add(Item item) {
        if (isEmpty()) {
            first = new Node(item);
        } else {
            Node current = first;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new Node(item);
        }
        size++;
    }

    public void remove(Item key) {
        if (isEmpty() || key == null) {
            return;
        }

        while (first != null && first.item.equals(key)) {
            first = first.next;
            size--;
        }
        Node current;
        for(current = first;current != null;current = current.next) {
            Node next = current.next;
            while (next != null && next.item.equals(key)) {
                next = next.next;
                size--;
            }
            current.next = next;
        }
    }

    @Override
    public Iterator<Item> iterator() {
        return new ListIterator();
    }

    private class ListIterator implements Iterator<Item> {
        Node current = first;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public Item next() {
            Item item = current.item;
            current = current.next;

            return item;
        }
    }

    public static void main(String[] args) {
        Exercise26<Integer> linkedList = new Exercise26<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(2);
        linkedList.add(2);
        linkedList.add(2);
        linkedList.remove(2);
        for (Integer i : linkedList) {
            System.out.printf("%d ", i);
        }
        System.out.println();
    }
}
