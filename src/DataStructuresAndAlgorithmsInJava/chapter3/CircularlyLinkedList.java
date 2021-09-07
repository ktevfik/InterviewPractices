/*
 * Copyright (c) 7.09.2021 18:02.
 * @author Mustafa Tevfik Kadan
 */

package DataStructuresAndAlgorithmsInJava.chapter3;

public class CircularlyLinkedList<E> {
    private static class Node<E> {
        private E element;
        private Node<E> next;

        public Node(E element, Node<E> next) {
            this.element = element;
            this.next = next;
        }

        public void setElement(E element) {
            this.element = element;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }

        public E getElement() {
            return element;
        }

        public Node<E> getNext() {
            return next;
        }
    }

    private Node<E> tail = null;
    private int size = 0;

    public CircularlyLinkedList() {
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public E first() {
        if (isEmpty()) return null;

        return tail.getNext().getElement();
    }

    public E last() {
        if (isEmpty()) return null;
        return tail.getElement();
    }

    public void rotateElement() {
        if (tail != null) {
            tail = tail.getNext();
        }
    }

    public void addFirst(E e) {
        if (isEmpty()) {
            tail = new Node<>(e, null);
            tail.setNext(tail);
        } else {
            Node<E> newest = new Node<>(e, tail.getNext());
            tail.setNext(newest);
        }
        size++;
    }

    public void addLast(E e) {
        addFirst(e);
        tail = tail.getNext();
    }

    public E removeFirst() {
        if (isEmpty()) {
            return null;
        }
        Node<E> head = tail.getNext();
        if (head == tail) tail = null;
        else tail.setNext(head.getNext());
        size--;
        return head.getElement();
    }

    public void printLinkedList() {
        if (isEmpty()) {
            System.out.println("Linked List is empty");
            return;
        }

        Node current = tail.getNext();
        Node head = tail.getNext();
        while (current != null) {
            System.out.printf("%s ", current.getElement());
            current = current.getNext();
            if (current == head) break;
        }

    }

    public static void main(String[] args) {
        CircularlyLinkedList<String> cLinkedList = new CircularlyLinkedList<>();
        cLinkedList.addLast("1");
        cLinkedList.addLast("2");
        cLinkedList.addLast("3");
        cLinkedList.addFirst("0");
        cLinkedList.printLinkedList();
    }
}
