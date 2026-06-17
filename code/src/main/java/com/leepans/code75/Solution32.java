package com.leepans.code75;

/**
 * @Author Victor
 * @Date 2026-06-17 4:51 p.m.
 */

public class Solution32 {

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

    public int pairSum(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode pre = null;
        ListNode cur = slow;

        while (cur != null) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }

        ListNode first = head;
        ListNode second = pre;
        int max = 0;
        while (second != null) {
            max = Math.max(max, first.val + second.val);
            first = first.next;
            second = second.next;
        }
        return max;
    }
}
