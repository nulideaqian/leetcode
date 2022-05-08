package org.galaxy.goahead;

import static org.junit.jupiter.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Galaxy
 * @since 2022/5/8 3:34
 */
class Solution0191Test {

  private Solution0191 solution0191 = new Solution0191();

  @Test
  void hammingWeight() {
    Assertions.assertThat(solution0191.hammingWeight(11)).isEqualTo(3);
    Assertions.assertThat(solution0191.hammingWeight(0)).isZero();
    Assertions.assertThat(solution0191.hammingWeight(7)).isEqualTo(3);
    Assertions.assertThat(solution0191.hammingWeight(0b11111111111111111111111111111101))
        .isEqualTo(31);
  }
}