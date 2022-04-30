package org.galaxy.goahead;

import static org.junit.jupiter.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.util.StopWatch;

/**
 * @author Galaxy
 * @since 2022/5/1 0:49
 */
class Solution0051Test {

  private Solution0051 solution0051 = new Solution0051();

  @Test
  void solveNQueens() {
    StopWatch sw = new StopWatch();
    for (int i = 0; i < 10; i++) {
      sw.start(String.valueOf(i));
      solution0051.solveNQueens(i);
      sw.stop();
    }
    System.out.println(sw.prettyPrint());
  }
}