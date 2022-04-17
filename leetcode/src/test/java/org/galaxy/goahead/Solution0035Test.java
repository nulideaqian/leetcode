package org.galaxy.goahead;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Galaxy
 * @since 2022/4/18 0:00
 */
class Solution0035Test {

  private Solution0035 solution0035 = new Solution0035();

  @Test
  void searchInsert() {
    Assertions.assertThat(solution0035.searchInsert(new int[]{1, 3, 5, 6}, 5)).isEqualTo(2);
  }

  @Test
  void searchInsert2() {
    Assertions.assertThat(solution0035.searchInsert(new int[]{1, 3, 5, 6}, 2)).isEqualTo(1);
  }

  @Test
  void searchInsert3() {
    Assertions.assertThat(solution0035.searchInsert(new int[]{1, 3, 5, 6}, 7)).isEqualTo(4);
  }

  @Test
  void searchInsert4() {
    Assertions.assertThat(solution0035.searchInsert(new int[]{1}, 7)).isEqualTo(1);
  }

  @Test
  void searchInsert5() {
    Assertions.assertThat(solution0035.searchInsert(new int[]{1}, 0)).isZero();
  }
}