/*
 * Copyright (c) 3.09.2021 22:45.
 * @author Mustafa Tevfik Kadan
 */

package Algorithms.chapter1.section3;

import java.util.Iterator;

public class Exercise25<Item> implements Iterable<Item> {
    private class Node {
        public Item item;
        public Node next;
    }

    private int size;
    private Node first;

    public Node createNode(Item item) {
        Node newNode = new Node();
        newNode.item = item;
        return newNode;
    }

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
            first = new Node();
            first.item = item;
        } else {
            Node current = first;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new Node();
            current.next.item = item;
        }
        size++;
    }

    public void deleteLastNode() {
        if (isEmpty()) return;
        if (!isEmpty()) {
            if (size == 1) {
                first = null;
            } else {
                Node current = first;
                while (current.next.next != null) {
                    current = current.next;
                }
                current.next = null;
            }
            size--;
        }
    }

    public void delete(int index) {
        if (isEmpty()) return;
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("Index must be between 0 and " + (size() - 1));
        }
        if (index == 0) {
            first = first.next;
        } else {
            Node current = first;
            int currentIndex = 0;
            while (currentIndex < index - 1) {
                currentIndex++;
                current = current.next;
            }
            current.next = current.next.next;
        }
        size--;
    }

    public boolean find(String key) {
        if (isEmpty()) return false;

        Node current = first;
        while (current.next != null) {
            if (current.item == key) return true;
            current = current.next;
        }
        return false;
    }

    public void removeAfter(Node node) {
        if (isEmpty() || node == null) {
            return;
        }

        Node current = first;

        while (current.next != null) {
            if(current.item.equals(node.item)) {
                current.next = current.next.next;
                size--;
                return;
            }
            current = current.next;
        }
    }
    public void insertAfter(Node node,Node addedItem) {
        if (isEmpty() || node == null || addedItem == null) {
            return;
        }
        Node current = first;
        while (current.next != null) {
            if(current.item.equals(node.item)) {
                addedItem.next = current.next;
                current.next = addedItem;
            }
            current = current.next;
        }
        size++;
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
        Exercise25<String> e = new Exercise25<>();
        e.add("1");
        e.add("2");
        e.add("3");
        e.add("4");
        Exercise25<String>.Node f = e.createNode("2");
        Exercise25<String>.Node t = e.createNode("7");
        e.insertAfter(f,t);
        e.removeAfter(f);

        for (String s : e) {
            System.out.printf("%s ", s);
        }
        System.out.println();
    }
}
