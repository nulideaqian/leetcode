package org.galaxy.goahead;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Galaxy
 * @since 2022/4/5 23:25
 */
class Solution0070Test {

  private Solution0070 solution0070 = new Solution0070();

  @Test
  void climbStairs() {
    Assertions.assertThat(solution0070.climbStairs(2)).isEqualTo(2);
    Assertions.assertThat(solution0070.climbStairs(3)).isEqualTo(3);
    Assertions.assertThat(solution0070.climbStairs(4)).isEqualTo(5);
  }
}