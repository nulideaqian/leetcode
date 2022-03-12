package org.galaxy.goahead;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Galaxy
 * @since 2022/3/12 23:34
 */
class Solution0122Test {

  private Solution0122 solution0122 = new Solution0122();

  @Test
  void maxProfit01() {
    Assertions.assertThat(solution0122.maxProfit(new int[]{7, 1, 5, 3, 6, 4})).isEqualTo(7);
  }

  @Test
  void maxProfit02() {
    Assertions.assertThat(solution0122.maxProfit(new int[]{1, 2, 3, 4, 5})).isEqualTo(4);
  }

  @Test
  void maxProfit03() {
    Assertions.assertThat(solution0122.maxProfit(new int[]{7, 6, 4, 3, 1})).isEqualTo(0);
  }

  @Test
  void maxProfit04() {
    Assertions.assertThat(solution0122.maxProfit(new int[]{1, 1, 1, 1})).isEqualTo(0);
  }

  @Test
  void maxProfit05() {
    Assertions.assertThat(solution0122.maxProfit(new int[]{1, 1, 1, 2})).isEqualTo(1);
  }

  @Test
  void maxProfit06() {
    Assertions.assertThat(solution0122.maxProfit(new int[]{1, 2, 1, 2})).isEqualTo(2);
  }
}