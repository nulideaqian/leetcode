package org.galaxy.goahead;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

/**
 * @author Galaxy
 * @since 2022/5/2 21:15
 */
class Solution0127Test {

  private Solution0127 solution0127 = new Solution0127();

  private Solution0127V2 solution0127V2 = new Solution0127V2();

  @Test
  void ladderLength() {
    List<String> data = Arrays.asList("hot", "dot", "dog", "lot", "log", "cog");
    int result = solution0127V2.ladderLength("hit", "cog", data);
    System.out.println(result);
  }
}