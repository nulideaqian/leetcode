package org.galaxy.goahead;

import static org.junit.jupiter.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Galaxy
 * @since 2022/4/30 18:23
 */
class Solution0022Test {

  private Solution0022 solution0022 = new Solution0022();

  @Test
  void generateParenthesis() {
    Assertions.assertThat(solution0022.generateParenthesis(1))
        .containsExactly("()");
  }

  @Test
  void generateParenthesis01() {
    Assertions.assertThat(solution0022.generateParenthesis(3))
        .containsExactly("((()))", "(()())", "(())()", "()(())", "()()()");
  }
}