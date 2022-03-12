package org.galaxy.goahead;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Galaxy
 * @since 2022/3/12 23:56
 */
class Solution0455Test {

  private Solution0455 solution0455 = new Solution0455();

  @Test
  void findContentChildren01() {
    Assertions.assertThat(solution0455.findContentChildren(new int[]{1, 2, 3}, new int[]{1, 1}))
        .isEqualTo(1);
  }

  @Test
  void findContentChildren02() {
    Assertions.assertThat(solution0455.findContentChildren(new int[]{1, 2}, new int[]{1, 2, 3}))
        .isEqualTo(2);
  }

  @Test
  void findContentChildren03() {
    Assertions.assertThat(solution0455.findContentChildren(new int[]{1, 2, 3}, new int[]{1, 2, 3}))
        .isEqualTo(3);
  }

  @Test
  void findContentChildren04() {
    Assertions.assertThat(solution0455.findContentChildren(new int[]{1, 2, 3}, new int[]{1, 2, 3}))
        .isEqualTo(3);
  }
}