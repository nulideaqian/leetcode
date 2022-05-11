package org.galaxy.goahead;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Galaxy
 * @since 2022/5/12 0:50
 */
public class Solution0101V2 {

  public boolean isSymmetric(TreeNode root) {
    if (root == null) {
      return true;
    }
    TreeNode leftNode = root.left;
    TreeNode rightNode = root.right;
    return check(leftNode, rightNode);
  }

  public boolean check(TreeNode leftNode, TreeNode rightNode) {
    if (leftNode == null && rightNode == null) {
      return true;
    }
    if (leftNode != null && rightNode == null) {
      return false;
    }
    if (leftNode == null && rightNode != null) {
      return false;
    }
    if (leftNode.val != rightNode.val) {
      return false;
    }
    return check(leftNode.left, rightNode.right) && check(leftNode.right, rightNode.left);
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
}


