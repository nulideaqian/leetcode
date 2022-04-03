package org.galaxy.goahead;

import static org.junit.jupiter.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Galaxy
 * @since 2022/4/4 1:23
 */
class Solution0367Test {
  private Solution0367 solution0367 = new Solution0367();

  @Test
  void isPerfectSquare() {
    Assertions.assertThat(solution0367.isPerfectSquare(11)).isFalse();
    Assertions.assertThat(solution0367.isPerfectSquare(4)).isTrue();
    Assertions.assertThat(solution0367.isPerfectSquare(0)).isTrue();
    Assertions.assertThat(solution0367.isPerfectSquare(9)).isTrue();
    Assertions.assertThat(solution0367.isPerfectSquare(121)).isTrue();
  }
}