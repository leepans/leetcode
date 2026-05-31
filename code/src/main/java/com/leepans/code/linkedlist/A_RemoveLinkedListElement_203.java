package com.leepans.code.linkedlist;

/**
 * @Author Victor
 * @Date 2026-05-31 7:01 p.m.
 */

public class A_RemoveLinkedListElement_203 {

    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode removeElements(ListNode head, int val) {
        ListNode tempNode = new ListNode();
        tempNode.next = head;
        ListNode cur = tempNode;
        while (cur.next != null) {
            if (cur.next.val == val) {
                cur.next = cur.next.next;
            } else {
                cur = cur.next;
            }
        }
        return tempNode.next;
    }

    public static ListNode buildList(int[] arr) {
        ListNode temp = new ListNode(0);
        ListNode cur = temp;

        for (int num : arr) {
            cur.next = new ListNode(num);
            cur = cur.next;
        }

        return temp.next;
    }

    public static void printList(ListNode head) {
        if (head == null) {
            System.out.println("[]");
            return;
        }

        ListNode cur = head;
        while (cur != null) {
            System.out.print(cur.val);
            if (cur.next != null) {
                System.out.print(" -> ");
            }
            cur = cur.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("==========Test==========");
        ListNode head = buildList(new int[]{1, 2, 6, 3, 4, 5, 6});

        System.out.println("Original LinkList:");
        printList(head);

        int val = 6;
        ListNode newHead = removeElements(head, val);

        System.out.println("After delete " + val + ":");
        printList(newHead);

        ListNode head1 = buildList(new int[]{});
        System.out.println("Original LinkList:");
        printList(head1);

        val = 1;
        ListNode newHead1 = removeElements(head1, val);
        System.out.println("After delete " + val + ":");
        printList(newHead1);


        ListNode head2 = buildList(new int[]{7, 7, 7, 7});
        System.out.println("Original LinkList:");
        printList(head2);

        val = 7;
        ListNode newHead2 = removeElements(head2, val);
        System.out.println("After delete " + val + ":");
        printList(newHead2);
    }
}
