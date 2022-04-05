package org.galaxy.goahead;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Galaxy
 * @since 2022/4/5 11:03
 */
class Solution1143Test {

  private Solution1143 solution1143 = new Solution1143();

  @Test
  void longestCommonSubsequence01() {
    Assertions.assertThat(solution1143.longestCommonSubsequence("abcde", "ace")).isEqualTo(3);
  }

  @Test
  void longestCommonSubsequence02() {
    Assertions.assertThat(solution1143.longestCommonSubsequence("abc", "abc")).isEqualTo(3);
  }

  @Test
  void longestCommonSubsequence03() {
    Assertions.assertThat(solution1143.longestCommonSubsequence("abc", "def")).isZero();
  }

  @Test
  void longestCommonSubsequence04() {
    Assertions.assertThat(solution1143.longestCommonSubsequence("aec", "abcde")).isEqualTo(2);
  }

  @Test
  void longestCommonSubsequence05() {
    Assertions.assertThat(solution1143.longestCommonSubsequence("abcde", "cdaec")).isEqualTo(3);
  }

  @Test
  void longestCommonSubsequence06() {
    Assertions.assertThat(solution1143.longestCommonSubsequence("bsbininm", "jmjkbkjkv")).isEqualTo(1);
  }

  @Test
  void longestCommonSubsequence07() {
    Assertions.assertThat(solution1143.longestCommonSubsequence("abcba", "abcbcba")).isEqualTo(5);
  }

  @Test
  void longestCommonSubsequence08() {
    Assertions.assertThat(solution1143.longestCommonSubsequence("pmjghexybyrgzczy", "hafcdqbgncrcbihkd")).isEqualTo(4);
  }

  @Test
  void longestCommonSubsequence09() {
    Assertions.assertThat(solution1143.longestCommonSubsequence("oxcpqrsvwf", "shmtulqrypy")).isEqualTo(2);
  }
}