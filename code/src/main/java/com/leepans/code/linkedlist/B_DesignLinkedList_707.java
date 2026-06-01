package com.leepans.code.linkedlist;

/**
 * @Author Victor
 * @Date 2026-05-31 7:50 p.m.
 */
public class B_DesignLinkedList_707 {

    class MyLinkedList {

        class Node {
            int val;
            Node next;

            Node(int val) {
                this.val = val;
            }
        }

        private Node tempNode;
        private int size;

        public MyLinkedList() {
            tempNode = new Node(0);
            size = 0;
        }

        public int get(int index) {
            if (index < 0 || index >= size) {
                return -1;
            }

            Node cur = tempNode.next;
            for (int i = 0; i < index; i++) {
                cur = cur.next;
            }

            return cur.val;
        }

        public void addAtHead(int val) {
            addAtIndex(0, val);
        }

        public void addAtTail(int val) {
            addAtIndex(size, val);
        }

        public void addAtIndex(int index, int val) {
            if (index > size) return;
            if (index < 0) index = 0;

            Node prev = tempNode;

            for (int i = 0; i < index; i++) {
                prev = prev.next;
            }

            Node node = new Node(val);
            node.next = prev.next;
            prev.next = node;

            size++;
        }

        public void deleteAtIndex(int index) {
            if (index < 0 || index >= size) return;

            Node prev = tempNode;

            for (int i = 0; i < index; i++) {
                prev = prev.next;
            }

            prev.next = prev.next.next;
            size--;
        }

        public void print() {
            Node cur = tempNode.next;
            System.out.print("LinkedList: ");
            while (cur != null) {
                System.out.print(cur.val);
                if (cur.next != null) {
                    System.out.print(" -> ");
                }
                cur = cur.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("==========Test==========");
        B_DesignLinkedList_707 outer = new B_DesignLinkedList_707();
        MyLinkedList list = outer.new MyLinkedList();

        list.addAtHead(1);
        list.print(); // 1

        list.addAtTail(3);
        list.print(); // 1 -> 3

        list.addAtIndex(1, 2);
        list.print(); // 1 -> 2 -> 3

        System.out.println("get(1): " + list.get(1)); // 2

        list.deleteAtIndex(1);
        list.print(); // 1 -> 3

        System.out.println("get(1): " + list.get(1)); // 3

        list.deleteAtIndex(0);
        list.print(); // 3

        list.deleteAtIndex(0);
        list.print(); // null
    }
}