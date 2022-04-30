package org.galaxy.goahead;

import org.junit.jupiter.api.Test;

/**
 * @author Galaxy
 * @since 2022/4/23 17:55
 */
class Solution0130Test {

  private Solution0130 solution0130 = new Solution0130();

  @Test
  void solve() {
    char[][] board = new char[][]{{'X', 'X', 'X', 'X'}, {'X', 'O', 'O', 'X'}, {'X', 'X', 'O', 'X'},
        {'X', 'O', 'X', 'X'}};
    solution0130.solve(board);
    System.out.println();
  }
}