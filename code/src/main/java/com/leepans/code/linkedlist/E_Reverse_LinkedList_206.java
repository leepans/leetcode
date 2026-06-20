package com.leepans.code.linkedlist;

/**
 * @Author Victor
 * @Date 2026-06-20 4:45 p.m.
 */

public class E_Reverse_LinkedList_206 {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode reverseList(ListNode head) {
        ListNode cur = head;
        ListNode pre = null;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }
}
