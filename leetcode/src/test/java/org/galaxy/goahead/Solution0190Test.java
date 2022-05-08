package org.galaxy.goahead;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Galaxy
 * @since 2022/5/8 11:28
 */
class Solution0190Test {

  private final Solution0190 solution0190 = new Solution0190();

  @Test
  void reverseBits() {
    Assertions.assertThat(solution0190.reverseBits(0b00000010100101000001111010011100))
        .isEqualTo(0b00111001011110000010100101000000);
  }

  @Test
  void reverseBits01() {
    Assertions.assertThat(solution0190.reverseBits(0b11111111111111111111111111111101))
        .isEqualTo(  0b10111111111111111111111111111111);
  }
}