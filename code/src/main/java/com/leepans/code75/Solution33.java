package com.leepans.code75;

import com.sun.source.tree.Tree;

/**
 * @Author Victor
 * @Date 2026-06-18 6:24 p.m.
 */

public class Solution33 {

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public int maxDepth(TreeNode root) {
        return deep(root);
    }

    private int deep(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int left = deep(node.left);
        int right = deep(node.right);
        return Math.max(left, right) + 1;
    }
}
