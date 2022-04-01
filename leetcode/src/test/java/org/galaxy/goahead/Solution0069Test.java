package org.galaxy.goahead;

import static org.junit.jupiter.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Galaxy
 * @since 2022/4/2 0:52
 */
class Solution0069Test {
  private Solution0069 solution0069 = new Solution0069();

  @Test
  void mySqrt01() {
    Assertions.assertThat(solution0069.mySqrt(4)).isEqualTo(2);
  }

  @Test
  void mySqrt03() {
    Assertions.assertThat(solution0069.mySqrt(8)).isEqualTo(2);
  }

  @Test
  void mySqrt04() {
    Assertions.assertThat(solution0069.mySqrt(121)).isEqualTo(11);
  }

  @Test
  void mySqrt02() {
    Assertions.assertThat(solution0069.mySqrt(0)).isZero();
  }

  @Test
  void mySqrt05() {
    Assertions.assertThat(solution0069.mySqrt(1)).isEqualTo(1);
  }
}