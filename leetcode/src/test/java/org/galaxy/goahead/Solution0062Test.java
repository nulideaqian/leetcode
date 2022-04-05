package org.galaxy.goahead;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Galaxy
 * @since 2022/4/5 10:01
 */
class Solution0062Test {

  private Solution0062 solution0062 = new Solution0062();

  @Test
  void uniquePaths01() {
    Assertions.assertThat(solution0062.uniquePaths(3, 7)).isEqualTo(28);
  }

  @Test
  void uniquePaths02() {
    Assertions.assertThat(solution0062.uniquePaths(3, 2)).isEqualTo(3);
  }

  @Test
  void uniquePaths03() {
    Assertions.assertThat(solution0062.uniquePaths(7, 3)).isEqualTo(28);
  }

  @Test
  void uniquePaths04() {
    Assertions.assertThat(solution0062.uniquePaths(3, 3)).isEqualTo(6);
  }

  @Test
  void uniquePaths05() {
    Assertions.assertThat(solution0062.uniquePaths(1, 1)).isEqualTo(1);
  }

  @Test
  void uniquePaths06() {
    Assertions.assertThat(solution0062.uniquePaths(1, 2)).isEqualTo(1);
  }
}