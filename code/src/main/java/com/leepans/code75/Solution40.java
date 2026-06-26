package com.leepans.code75;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author Victor
 * @Date 2026-06-26 5:48 p.m.
 */

public class Solution40 {

    class TreeNode {
        TreeNode left;
        TreeNode right;
        int val;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public int maxLevelSum(TreeNode root) {
        int result = 1;
        int max = Integer.MIN_VALUE;
        int level = 0;
        if (root == null) {
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            level++;
            int size = queue.size();
            int levelSum = 0;
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
                levelSum += node.val;
            }
            if (levelSum > max) {
                max = levelSum;
                result = level;
            }
        }
        return result;
    }
}
