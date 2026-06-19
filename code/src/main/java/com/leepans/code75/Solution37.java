package com.leepans.code75;

/**
 * @Author Victor
 * @Date 2026-06-19 6:17 p.m.
 */

public class Solution37 {

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public int longestZigZag(TreeNode root) {
        return deep(root)[2];
    }

    private int[] deep(TreeNode node) {
        if (node == null) {
            return new int[] { -1, -1, -1 };
        }
        int left[] = deep(node.left);
        int right[] = deep(node.right);
        int res = Math.max(Math.max(left[1], right[0]) + 1, Math.max(left[2], right[2]));
        return new int[] { left[1] + 1, right[0] + 1, res };
    }
}
