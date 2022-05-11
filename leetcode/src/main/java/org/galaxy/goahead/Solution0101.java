package org.galaxy.goahead;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Galaxy
 * @since 2022/5/12 0:50
 */
public class Solution0101 {

  public boolean isSymmetric(TreeNode root) {
    Deque<TreeNode> processQueue = new LinkedList<>();
    Deque<TreeNode> waitingQueue = new LinkedList<>();
    List<Integer> datas = new ArrayList<>();
    processQueue.addLast(root);
    while (!processQueue.isEmpty()) {
      TreeNode temp = processQueue.pollFirst();
      if (temp != null) {
        waitingQueue.addLast(temp.left);
        waitingQueue.addLast(temp.right);
        datas.add(temp.left == null ? null : temp.left.val);
        datas.add(temp.right == null ? null : temp.right.val);
      }
      if (processQueue.isEmpty()) {
        if (!isSymmetric(datas)) {
          return false;
        }
        datas.clear();
        processQueue = waitingQueue;
        waitingQueue = new LinkedList<>();
      }
    }
    return true;
  }

  private boolean isSymmetric(List<Integer> datas) {
    int leftIdx = 0;
    int rightIdx = datas.size() - 1;
    while (rightIdx > leftIdx) {
      Integer leftVal = datas.get(leftIdx);
      Integer rightVal = datas.get(rightIdx);
      if (leftVal != null && rightVal == null) {
        return false;
      } else if (leftVal == null && rightVal != null) {
        return false;
      } else if (leftVal != null && rightVal != null) {
        if (!leftVal.equals(rightVal)) {
          return false;
        }
      }
      leftIdx++;
      rightIdx--;
    }
    return true;
  }

  public static void main(String[] args) {
    System.out.println(new Solution0101().isSymmetric(List.of(3,4,4,3)));
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


