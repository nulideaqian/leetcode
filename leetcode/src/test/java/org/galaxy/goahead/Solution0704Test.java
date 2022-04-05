package org.galaxy.goahead;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Galaxy
 * @since 2022/3/27 17:16
 */
class Solution0704Test {

  private Solution0704 solution0704 = new Solution0704();

  @Test
  void search01() {
    Assertions.assertThat(solution0704.search(new int[]{-1, 0, 3, 5, 9, 12}, 9)).isEqualTo(4);
  }

  @Test
  void search02() {
    Assertions.assertThat(solution0704.search(new int[]{-1, 0, 3, 5, 9, 12}, 2)).isEqualTo(-1);
  }

  @Test
  void search03() {
    Assertions.assertThat(solution0704.search(new int[]{2, 5}, 2)).isEqualTo(0);
  }

  @Test
  void search04() {
    Assertions.assertThat(solution0704.search(new int[]{2, 5}, 5)).isEqualTo(1);
  }
}