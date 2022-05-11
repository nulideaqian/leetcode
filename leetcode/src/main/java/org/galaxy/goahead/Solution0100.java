package org.galaxy.goahead;

import javax.swing.tree.TreeNode;

/**
 * @author Galaxy
 * @since 2022/5/12 0:32
 */
public class Solution0100 {

  public boolean isSameTree(TreeNode p, TreeNode q) {
    return dfs(p, q);
  }

  private boolean dfs(TreeNode p, TreeNode q) {
    if (p == null && q != null) {
      return false;
    }
    if (p != null && q == null) {
      return false;
    }
    if (p != null && q != null) {
      if (p.val != q.val) {
        return false;
      } else {
        return dfs(p.left, q.left) && dfs(p.right, q.right);
      }
    }
    return true;
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


