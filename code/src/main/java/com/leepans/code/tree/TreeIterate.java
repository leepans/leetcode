package com.leepans.code.tree;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @Author Victor
 * @Date 2026-06-20 2:23 p.m.
 */

public class TreeIterate {

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

    private void preOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    private void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.val + " ");
        inOrder(root.right);
    }

    private void postOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val + " ");
    }

    //BFS
    private void bfs(TreeNode root) {
        if (root == null) {
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            System.out.print(node.val + " ");
            if (node.left != null) {
                queue.offer(node.left);
            }
            if (node.right != null) {
                queue.offer(node.right);
            }
        }
    }

    //printTree
    private List<List<Integer>> printTree(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            List<Integer> level = new ArrayList<>();
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                level.add(node.val);
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right!=null){
                    queue.offer(node.right);
                }
            }
            result.add(level);
        }
        return result;
    }

    /**
     * 1
     * / \
     * 2   3
     * / \   \
     * 4   5   6
     **/
    private TreeNode buildTree() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        root.right.right = new TreeNode(6);
        return root;
    }

    public static void main(String[] args) {
        TreeIterate treeIterate = new TreeIterate();
        TreeNode root = treeIterate.buildTree();

        System.out.println("==========PreOrder==========");
        treeIterate.preOrder(root);
        System.out.println();
        System.out.println("==========InOrder===========");
        treeIterate.inOrder(root);
        System.out.println();
        System.out.println("==========PostOrder=========");
        treeIterate.postOrder(root);
        System.out.println();
        System.out.println("==========BFS===========");
        treeIterate.bfs(root);
        System.out.println();
        System.out.println("==========PrintTree===========");
        List<List<Integer>> result = treeIterate.printTree(root);
        System.out.println(result);
    }

}
