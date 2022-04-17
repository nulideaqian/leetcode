package org.galaxy.goahead;

/**
 * @author Galaxy
 * @since 2022/4/18 0:29
 */
public class Solution0189 {

  public void rotate(int[] nums, int k) {
    if (k % nums.length == 0) {
      return;
    }
    k = k % nums.length;
    int tailIdx = nums.length - k;
    int[] cache = new int[k];
    if (nums.length - tailIdx >= 0) {
      System.arraycopy(nums, tailIdx, cache, tailIdx - tailIdx, nums.length - tailIdx);
    }
    System.arraycopy(nums, 0, nums, 0 + k, tailIdx - 1 + 1);
    System.arraycopy(cache, 0, nums, 0, k);
  }

}
