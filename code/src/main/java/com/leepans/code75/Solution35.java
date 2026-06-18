package com.leepans.code75;

/**
 * @Author Victor
 * @Date 2026-06-18 7:01 p.m.
 */

public class Solution35 {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public int goodNodes(TreeNode root) {
        return goodNodes(root, -10000);
    }

    private int goodNodes(TreeNode root, int max) {
        if (root == null) {
            return 0;
        }
        int res = root.val >= max ? 1 : 0;
        res += goodNodes(root.left, Math.max(max, root.val));
        res += goodNodes(root.right, Math.max(max, root.val));
        return res;
    }
}
