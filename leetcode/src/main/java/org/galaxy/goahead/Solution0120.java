package org.galaxy.goahead;

import java.util.Arrays;
import java.util.List;

/**
 * @author Galaxy
 * @since 2022/4/5 23:33
 */
public class Solution0120 {

  public int minimumTotal(List<List<Integer>> triangle) {
    int m = triangle.size();
    int[][] dp = new int[m][m];
    for (int[] elem : dp) {
      Arrays.fill(elem, Integer.MAX_VALUE);
    }
    dp[0][0] = triangle.get(0).get(0);
    for (int i = 1; i < m; i++) {
      for (int j = 0; j < i + 1; j++) {
        if (j == 0) {
          dp[i][j] = dp[i - 1][j] + triangle.get(i).get(j);
          continue;
        }
        dp[i][j] = Math.min(dp[i - 1][j], dp[i - 1][j - 1]) + triangle.get(i).get(j);
      }
    }
    int result = Integer.MAX_VALUE;
    for (int i : dp[m - 1]) {
      result = Math.min(result, i);
    }
    return result;
  }

}
