package org.galaxy.goahead;

import java.util.Arrays;
import java.util.List;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Galaxy
 * @since 2022/4/6 0:01
 */
class Solution0120Test {

  private Solution0120 solution0120 = new Solution0120();

  @Test
  void minimumTotal() {
    List<List<Integer>> triangle = Arrays.asList(Arrays.asList(2), Arrays.asList(3, 4),
        Arrays.asList(6, 5, 7), Arrays.asList(4, 1, 8, 3));
    Assertions.assertThat(solution0120.minimumTotal(triangle)).isEqualTo(11);
  }

  @Test
  void minimumTotal01() {
    List<List<Integer>> triangle = Arrays.asList(Arrays.asList(-1), Arrays.asList(3, 2),
        Arrays.asList(-3, 1, -1));
    Assertions.assertThat(solution0120.minimumTotal(triangle)).isEqualTo(-1);
  }
}