package org.galaxy.goahead;

import java.util.Arrays;

/**
 * @author Galaxy
 * @since 2022/4/5 9:39
 */
public class Solution0062 {

  public int uniquePaths(int m, int n) {
    int[][] dp = new int[m][n];
    Arrays.fill(dp[0], 1);
    for (int i = 0; i < dp.length; i++) {
      dp[i][0] = 1;
    }
    for (int i = 1; i < m; i++) {
      for (int j = 1; j < n; j++) {
        dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
      }
    }
    return dp[m - 1][n - 1];
  }

}
