/*
 * Copyright (c) 5.09.2021 19:58.
 * @author Mustafa Tevfik Kadan
 */

package DataStructuresAndAlgorithmsInJava.chapter3;

public class SinglyLinkedList<E> {
    private static class Node<E> {
        private E element;
        private Node<E> next;

        public Node(E element,Node<E> next) {
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

    private Node<E> head = null;
    private Node<E> tail = null;
    private int size = 0;

    public SinglyLinkedList() {}
    public int size() {return size;}
    public boolean isEmpty() {return size == 0;}
    public E first() {
        if(isEmpty()) {
            return null;
        }

        return head.getElement();
    }
    public E last() {
        if(isEmpty()) {
            return null;
        }

        return tail.getElement();
    }
    public void addFirst(E e) {
        head = new Node<>(e,head);
        if(size == 0) {
            tail = head;
        }
        size++;
    }
    public void addLast(E e) {
        Node<E> newest = new Node<>(e,null);

        if(isEmpty()) {
            head = newest;
        } else {
            tail.setNext(newest);
        }

        tail = newest;
        size++;
    }

    public E removeFirst() {
        if(isEmpty()) {
            return null;
        }
        E answer = head.getElement();
        head = head.getNext();
        size--;
        if(size == 0) {
            tail = null;
        }
        return answer;
    }
    public void printLinkedList() {
        if(isEmpty()) {
            System.out.println("List is empty");
        }

        Node current = head;
        while (current != null) {
            System.out.printf("%s ",current.getElement());
            current = current.getNext();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        SinglyLinkedList<String> linkedList = new SinglyLinkedList<>();
        linkedList.addLast("1");
        linkedList.addLast("2");
        linkedList.addLast("3");
        linkedList.printLinkedList();
    }
}
