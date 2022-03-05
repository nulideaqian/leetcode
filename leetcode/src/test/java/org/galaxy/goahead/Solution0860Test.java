package org.galaxy.goahead;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Galaxy
 * @since 2022/3/5 1:19
 */
class Solution0860Test {

  private static final Solution0860 SOLUTION_0860 = new Solution0860();

  @Test
  void lemonadeChange01() {
    Assertions.assertThat(SOLUTION_0860.lemonadeChange(new int[]{5, 5, 5, 10, 20})).isTrue();
  }

  @Test
  void lemonadeChange02() {
    Assertions.assertThat(SOLUTION_0860.lemonadeChange(new int[]{5, 5, 10, 10, 20})).isFalse();
  }

  @Test
  void lemonadeChange03() {
    Assertions.assertThat(SOLUTION_0860.lemonadeChange(new int[]{10, 10})).isFalse();
  }

  @Test
  void lemonadeChange04() {
    Assertions.assertThat(SOLUTION_0860.lemonadeChange(new int[]{5, 5, 10})).isTrue();
  }
}