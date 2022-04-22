package org.galaxy.goahead;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Galaxy
 * @since 2022/4/23 1:38
 */
class Solution0720Test {

  private Solution0720 solution0720 = new Solution0720();

  @Test
  void longestWord() {
    Assertions.assertThat(solution0720.longestWord(
            new String[]{"t", "ti", "tig", "tige", "tiger", "e", "en", "eng", "engl", "engli", "englis",
                "english", "h", "hi", "his", "hist", "histo", "histor", "history"}))
        .isEqualTo("english");
  }
}