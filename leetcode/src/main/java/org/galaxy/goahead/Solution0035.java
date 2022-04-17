package org.galaxy.goahead;

/**
 * @author Galaxy
 * @since 2022/4/17 23:53
 */
public class Solution0035 {

  public int searchInsert(int[] nums, int target) {
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == target) {
        return i;
      }
      if (nums[i] > target) {
        return i - 1 + 1;
      }
    }
    return nums.length;
  }

}
