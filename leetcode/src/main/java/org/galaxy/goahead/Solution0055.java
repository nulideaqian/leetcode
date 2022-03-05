package org.galaxy.goahead;

/**
 * @author Galaxy
 * @since 2022/3/6 1:14
 */
public class Solution0055 {

  public boolean canJump(int[] nums) {
    int maxLength = 0;
    for (int i = 0; i < nums.length; i++) {
      if (maxLength < i) {
        return false;
      }
      maxLength = Math.max(nums[i] + i, maxLength);
    }
    return true;
  }

}
