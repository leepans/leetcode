package com.leepans.code.linkedlist;

/**
 * @Author Victor
 * @Date 2026-06-20 4:29 p.m.
 */

public class C_OddEvenLinkedList_328 {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode oddEvenList(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even;
        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;

            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }

    public static void main(String[] args) {
        C_OddEvenLinkedList_328 cOddEvenLinkedList328 = new C_OddEvenLinkedList_328();
        /**
         * Input: head = [1,2,3,4,5]
         * Output: [1,3,5,2,4]
         */
        System.out.println("==========Test==========");
        System.out.println(cOddEvenLinkedList328.oddEvenList(new C_OddEvenLinkedList_328().new ListNode(1).next = new C_OddEvenLinkedList_328().new ListNode(2).next = new C_OddEvenLinkedList_328().new ListNode(3).next = new C_OddEvenLinkedList_328().new ListNode(4).next = new C_OddEvenLinkedList_328().new ListNode(5)));
    }
}
