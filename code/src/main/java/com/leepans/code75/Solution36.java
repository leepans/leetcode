package com.leepans.code75;

/**
 * @Author Victor
 * @Date 2026-06-19 5:50 p.m.
 */

public class Solution36 {

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

    public int pathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return 0;
        }

        return deep(root, targetSum) + pathSum(root.left, targetSum) + pathSum(root.right, targetSum);
    }

    private int deep(TreeNode node, long sum) {
        if (node == null) {
            return 0;
        }
        return (node.val == sum ? 1 : 0) + deep(node.left, sum - node.val) + deep(node.right, sum - node.val);

    }
}
