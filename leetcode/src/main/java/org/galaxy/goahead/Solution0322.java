package org.galaxy.goahead;

import java.util.Arrays;

/**
 * @author Galaxy
 * @since 2022/3/4 0:12
 */
public class Solution0322 {

  public int coinChange(int[] coins, int amount) {
    // dp
    return dp(coins, amount);
  }

  private int dp(int[] coins, int amount) {
    int[] dp = new int[amount + 1];
    Arrays.fill(dp, amount + 1);
    dp[0] = 0;
    for (int i = 1; i <= amount; i++) {
      for (int coin : coins) {
        if (coin <= i) {
          dp[i] = Math.min(dp[i], dp[i - coin] + 1);
        }
      }
    }
    return dp[amount] > amount ? -1 : dp[amount];
  }
}
