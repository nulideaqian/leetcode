package org.galaxy.goahead;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Galaxy
 * @since 2022/3/6 1:14
 */
class Solution0055Test {

  private Solution0055 solution0055 = new Solution0055();

  @Test
  void canJump01() {
    Assertions.assertThat(solution0055.canJump(new int[]{2, 3, 1, 1, 4})).isTrue();
  }

  @Test
  void canJump02() {
    Assertions.assertThat(solution0055.canJump(new int[]{3, 2, 1, 0, 4})).isFalse();
  }

  @Test
  void canJump03() {
    Assertions.assertThat(solution0055.canJump(new int[]{4, 2, 1, 0, 4})).isTrue();
  }


  @Test
  void canJump04() {
    Assertions.assertThat(solution0055.canJump(new int[]{4, 2, 1, 1, 4})).isTrue();
  }
}