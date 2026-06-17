package com.leepans.code75;

/**
 * @Author Victor
 * @Date 2026-06-17 3:41 p.m.
 */

public class Solution29 {

    class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

    }

    public ListNode deleteMiddle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        ListNode preSlow = head;

        while (fast != null && fast.next != null) {
            preSlow = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        preSlow.next = slow.next;
        return head;
    }
}
