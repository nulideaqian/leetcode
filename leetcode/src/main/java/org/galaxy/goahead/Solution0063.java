package org.galaxy.goahead;

/**
 * @author Galaxy
 * @since 2022/4/5 10:15
 */
public class Solution0063 {

  public int uniquePathsWithObstacles(int[][] obstacleGrid) {
    int rowNum = obstacleGrid.length;
    int colNum = obstacleGrid[0].length;
    int[][] dp = new int[rowNum][colNum];
    for (int i = 0; i < rowNum; i++) {
      for (int j = 0; j < colNum; j++) {
        // 1. 首节点
        if (i == 0 && j == 0) {
          dp[i][j] = obstacleGrid[i][j] == 1 ? 0 : 1;
          continue;
        }
        // 2. 左边界
        if (i == 0) {
          dp[i][j] = dp[i][j - 1] == 0 || obstacleGrid[i][j] == 1 ? 0 : 1;
          continue;
        }
        // 3. 上边界
        if (j == 0) {
          dp[i][j] = dp[i - 1][j] == 0 || obstacleGrid[i][j] == 1 ? 0 : 1;
          continue;
        }
        // 4. 非边界点
        if (obstacleGrid[i][j] == 1) {
          dp[i][j] = 0;
        } else {
          dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
        }
      }
    }
    return dp[rowNum - 1][colNum - 1];
  }

}
