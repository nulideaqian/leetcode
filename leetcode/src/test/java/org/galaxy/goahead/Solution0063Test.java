package org.galaxy.goahead;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Galaxy
 * @since 2022/4/5 10:17
 */
class Solution0063Test {

  private Solution0063 solution0063 = new Solution0063();

  @Test
  void uniquePathsWithObstacles01() {
    int[][] obstacleGrid = {{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};
    Assertions.assertThat(solution0063.uniquePathsWithObstacles(obstacleGrid)).isEqualTo(2);
  }

  @Test
  void uniquePathsWithObstacles02() {
    int[][] obstacleGrid = {{0, 0, 0}, {0, 1, 0}, {0, 1, 0}};
    Assertions.assertThat(solution0063.uniquePathsWithObstacles(obstacleGrid)).isEqualTo(1);
  }

  @Test
  void uniquePathsWithObstacles03() {
    int[][] obstacleGrid = {{0, 0, 1}, {0, 1, 0}, {0, 1, 0}};
    Assertions.assertThat(solution0063.uniquePathsWithObstacles(obstacleGrid)).isZero();
  }

  @Test
  void uniquePathsWithObstacles04() {
    int[][] obstacleGrid = {{0, 1}, {0, 0}};
    Assertions.assertThat(solution0063.uniquePathsWithObstacles(obstacleGrid)).isEqualTo(1);
  }

  @Test
  void uniquePathsWithObstacles05() {
    int[][] obstacleGrid = {{0}, {0}};
    Assertions.assertThat(solution0063.uniquePathsWithObstacles(obstacleGrid)).isEqualTo(1);
  }

  @Test
  void uniquePathsWithObstacles06() {
    int[][] obstacleGrid = {{1}, {0}};
    Assertions.assertThat(solution0063.uniquePathsWithObstacles(obstacleGrid)).isZero();
  }

  @Test
  void uniquePathsWithObstacles07() {
    int[][] obstacleGrid = {{0}, {1}};
    Assertions.assertThat(solution0063.uniquePathsWithObstacles(obstacleGrid)).isZero();
  }

  @Test
  void uniquePathsWithObstacles08() {
    int[][] obstacleGrid = {{0}};
    Assertions.assertThat(solution0063.uniquePathsWithObstacles(obstacleGrid)).isEqualTo(1);
  }
}