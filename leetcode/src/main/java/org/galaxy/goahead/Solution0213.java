package org.galaxy.goahead;

/**
 * @author Galaxy
 * @since 2022/4/7 0:32
 */
public class Solution0213 {

  public int rob(int[] nums) {
    int length = nums.length;
    if (length == 1) {
      return nums[0];
    }
    if (length == 2) {
      return Math.max(nums[0], nums[1]);
    }
    int[] dp = new int[length - 1];
    dp[0] = nums[0];
    dp[1] = Math.max(nums[0], nums[1]);
    for (int i = 2; i < length - 1; i++) {
      dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
    }
    int first = dp[length - 2];
    dp[0] = nums[1];
    dp[1] = Math.max(nums[1], nums[2]);
    for (int i = 3; i < length; i++) {
      dp[i - 1] = Math.max(dp[i - 2], dp[i - 3] + nums[i]);
    }
    return Math.max(first, dp[length - 2]);
  }

}
