package org.galaxy.goahead;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * @author Galaxy
 * @since 2022/4/14 0:36
 */
class Solution0212Test {

  private Solution0212 solution0212 = new Solution0212();

  @Test
  void findWords() {
    solution0212.findWords(
        new char[][]{{'o', 'a', 'a', 'n'}, {'e', 't', 'a', 'e'}, {'i', 'h', 'k', 'r'},
            {'i', 'f', 'l', 'v'}}, new String[]{"oath", "pea", "eat", "rain"});
  }
}