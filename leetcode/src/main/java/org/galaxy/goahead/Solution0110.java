package org.galaxy.goahead;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * @author Galaxy
 * @since 2022/5/14 2:20
 */
public class Solution0110 {

  public boolean isBalanced(TreeNode root) {
    Map<TreeNode, Integer> treeHeight = new HashMap<>();
    dfs(root, treeHeight);
    Deque<TreeNode> processQueue = new LinkedList<>();
    processQueue.addLast(root);
    while (!processQueue.isEmpty()) {
      TreeNode treeNode = processQueue.pollFirst();
      if (treeNode != null) {
        if (!isBalance(treeNode, treeHeight)) {
          return false;
        }
        processQueue.addLast(treeNode.left);
        processQueue.addLast(treeNode.right);
      }
    }
    return true;
  }

  private boolean isBalance(TreeNode node, Map<TreeNode, Integer> treeHeight) {
    if (node == null) {
      return true;
    }
    TreeNode leftNode = node.left;
    TreeNode rightNode = node.right;
    int leftHeight = leftNode == null ? 0 : treeHeight.get(leftNode);
    int rightHeight = rightNode == null ? 0 : treeHeight.get(rightNode);
    return Math.abs(leftHeight - rightHeight) <= 1;
  }

  private int dfs(TreeNode root, Map<TreeNode, Integer> treeHeight) {
    if (root == null) {
      return 0;
    }
    int leftHeight = dfs(root.left, treeHeight);
    int rightHeight = dfs(root.right, treeHeight);
    int rootHeight = Math.max(leftHeight, rightHeight) + 1;
    treeHeight.put(root, rootHeight);
    return rootHeight;
  }

  private static class TreeNode {
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

  public static void main(String[] args) {
    TreeNode node7 = new TreeNode(7);
    TreeNode node6 = new TreeNode(6);
    TreeNode node4 = new TreeNode(4, node6, node7);
    TreeNode node5 = new TreeNode(5);
    TreeNode node2 = new TreeNode(2, node4, node5);
    TreeNode node3 = new TreeNode(3);
    TreeNode node1 = new TreeNode(1, node2, node3);
    boolean balanced = new Solution0110().isBalanced(node1);
    System.out.println(balanced);
  }

}
