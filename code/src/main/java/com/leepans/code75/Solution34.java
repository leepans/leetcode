package com.leepans.code75;

import java.util.Stack;

/**
 * @Author Victor
 * @Date 2026-06-18 6:50 p.m.
 */

public class Solution34 {
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

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        Stack<TreeNode> s1 = new Stack<>();
        Stack<TreeNode> s2 = new Stack<>();
        s1.push(root1);
        s2.push(root2);
        while (!s1.empty() && !s2.empty()) {
            if (dfs(s1) != dfs(s2)) {
                return false;
            }
        }
        return s1.empty() && s2.empty();
    }

    private int dfs(Stack<TreeNode> s) {
        while (true) {
            TreeNode node = s.pop();
            if (node.right != null) {
                s.push(node.right);
            }
            if (node.left != null) {
                s.push(node.left);
            }
            if (node.left == null && node.right == null) {
                return node.val;
            }
        }
    }
}
