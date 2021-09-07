/*
 * Copyright (c) 7.09.2021 19:10.
 * @author Mustafa Tevfik Kadan
 */

package DataStructuresAndAlgorithmsInJava.chapter3;

public class DoublyLinkedList<E> {
    private static class Node<E> {
        private E element;
        private Node<E> next;
        private Node<E> prev;

        public Node(E e, Node<E> p, Node<E> n) {
            element = e;
            prev = p;
            next = n;
        }

        public E getElement() {
            return element;
        }

        public Node<E> getPrev() {
            return prev;
        }

        public Node<E> getNext() {
            return next;
        }

        ;

        public void setPrev(Node<E> p) {
            prev = p;
        }

        public void setNext(Node<E> n) {
            next = n;
        }
    }

    private Node<E> header;
    private Node<E> trailer;
    private int size = 0;

    public DoublyLinkedList() {
        header = new Node<>(null, null, null);
        trailer = new Node<>(null, header, null);
        header.setNext(trailer);
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public E first() {
        if (isEmpty()) return null;

        return header.getNext().getElement();
    }

    public E last() {
        if (isEmpty()) {
            return null;
        }
        return trailer.getPrev().getElement();
    }
    public void addFirst(E e) {
        addBetween(e,header, header.getNext());
    }
    public void addLast(E e) {
        addBetween(e,trailer.getPrev(),trailer);
    }
    public E removeFirst() {
        if(isEmpty()) return null;
        return remove(header.getNext());
    }
    public E removeLast() {
        if(isEmpty()) return null;
        return remove(trailer.getPrev());
    }
    public void addBetween(E e,Node<E> predecessor,Node<E> successor) {
        Node<E> newest = new Node<>(e,predecessor,successor);
        predecessor.setNext(newest);
        successor.setPrev(newest);
        size++;
    }
    public E remove(Node<E> node) {
        Node<E> predecessor = node.getPrev();
        Node<E> successor = node.getNext();
        predecessor.setNext(successor);
        successor.setPrev(predecessor);
        size--;
        return node.getElement();
    }
    public void printLinkedList() {
        if(isEmpty()) {
            System.out.println("Linked list is empty");
            return;
        }

        Node current = header.getNext();
        while (current != null) {
            System.out.printf("%s ",current.getElement());
            current = current.getNext();
            if(current == trailer) break;
        }
    }
    public static void main(String[] args) {
        DoublyLinkedList<String> dLinkedList = new DoublyLinkedList<>();
        dLinkedList.addLast("1");
        dLinkedList.addLast("2");
        dLinkedList.addLast("3");
        dLinkedList.addFirst("0");
        dLinkedList.printLinkedList();
    }
}
