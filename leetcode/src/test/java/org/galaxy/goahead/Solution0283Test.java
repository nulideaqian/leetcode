package org.galaxy.goahead;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Galaxy
 * @since 2022/4/23 12:46
 */
class Solution0283Test {

  private final Solution0283 solution0283 = new Solution0283();

  @Test
  void moveZeroes() {
    int[] data = new int[]{0, 1, 0, 3, 12};
    solution0283.moveZeroes(data);
    Assertions.assertThat(data).containsSequence(1, 3, 12, 0, 0);
  }

  @Test
  void moveZeroes01() {
    int[] data = new int[]{0};
    solution0283.moveZeroes(data);
    Assertions.assertThat(data).containsSequence(0);
  }

  @Test
  void moveZeroes02() {
    int[] data = new int[]{0, 0};
    solution0283.moveZeroes(data);
    Assertions.assertThat(data).containsSequence(0, 0);
  }

  @Test
  void moveZeroes03() {
    int[] data = new int[]{1, 0, 0};
    solution0283.moveZeroes(data);
    Assertions.assertThat(data).containsSequence(1, 0, 0);
  }

  @Test
  void moveZeroes04() {
    int[] data = new int[]{1, 0, 1};
    solution0283.moveZeroes(data);
    Assertions.assertThat(data).containsSequence(1, 1, 0);
  }
}