package org.galaxy.goahead;

/**
 * @author Galaxy
 * @since 2022/4/7 0:11
 */
public class Solution0198 {

  /**
   * dp[0] = f0 dp[1] = max(f0, f1) dp[i] = max(dp[i-2] + fi, dp[i-1])
   *
   * @param nums
   * @return
   */
  public int rob(int[] nums) {
    if (nums.length == 1) {
      return nums[0];
    }
    if (nums.length == 2) {
      return Math.max(nums[0], nums[1]);
    }
    int length = nums.length;
    int[] dp = new int[length];
    dp[0] = nums[0];
    dp[1] = Math.max(nums[0], nums[1]);
    for (int i = 2; i < length; i++) {
      dp[i] = Math.max(dp[i - 2] + nums[i], dp[i - 1]);
    }
    return dp[length - 1];
  }

}
