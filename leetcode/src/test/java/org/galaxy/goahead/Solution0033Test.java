package org.galaxy.goahead;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Galaxy
 * @since 2022/4/4 1:58
 */
class Solution0033Test {

  private Solution0033 solution0033 = new Solution0033();

  @Test
  void search01() {
    Assertions.assertThat(solution0033.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 0)).isEqualTo(4);
  }

  @Test
  void search02() {
    Assertions.assertThat(solution0033.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 3)).isEqualTo(-1);
  }

  @Test
  void search03() {
    Assertions.assertThat(solution0033.search(new int[]{1}, 0)).isEqualTo(-1);
  }

  @Test
  void search04() {
    Assertions.assertThat(solution0033.search(new int[]{1}, 1)).isZero();
  }

  @Test
  void search05() {
    Assertions.assertThat(solution0033.search(new int[]{2, 1}, 1)).isEqualTo(1);
  }

  @Test
  void search06() {
    Assertions.assertThat(solution0033.search(new int[]{1, 2}, 1)).isZero();
  }

  @Test
  void search07() {
    Assertions.assertThat(solution0033.search(new int[]{1, 2}, 2)).isEqualTo(1);
  }
}