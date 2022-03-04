package org.galaxy.goahead;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Galaxy
 * @since  2022/3/4 0:13
 */
class Solution0322Test {

  private final Solution0322 solution0322 = new Solution0322();

  @Test
  void coinChange01() {
    Assertions.assertThat(solution0322.coinChange(new int[]{1, 2, 5}, 11)).isEqualTo(3);
  }

  @Test
  void coinChange02() {
    Assertions.assertThat(solution0322.coinChange(new int[]{2}, 3)).isEqualTo(-1);
  }

  @Test
  void coinChange03() {
    Assertions.assertThat(solution0322.coinChange(new int[]{1}, 0)).isZero();
  }

  @Test
  void coinChange04() {
    Assertions.assertThat(solution0322.coinChange(new int[]{1, 3, 5}, 7)).isEqualTo(3);
  }

  @Test
  void coinChange05() {
    Assertions.assertThat(solution0322.coinChange(new int[]{1, 3, 4, 5}, 7)).isEqualTo(2);
  }

  @Test
  void coinChange06() {
    Assertions.assertThat(solution0322.coinChange(new int[]{186, 419, 83, 408}, 6249)).isEqualTo(20);
  }
}