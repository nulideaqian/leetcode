package org.galaxy.goahead;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Galaxy
 * @since 2022/5/1 12:01
 */
public class Solution0036 {

  public boolean isValidSudoku(char[][] board) {
    return rowCheck(board) && columnCheck(board) && nineCheck(board);
  }

  private boolean rowCheck(char[][] board) {
    boolean[] record;
    for (int i = 0; i < 9; i++) {
      record = new boolean[9];
      for (int j = 0; j < 9; j++) {
        if (board[i][j] >= '1' && board[i][j] <= '9') {
          if (record[board[i][j] - '1']) {
            return false;
          }
          record[board[i][j] - '1'] = true;
        }
      }
    }
    return true;
  }

  private boolean columnCheck(char[][] board) {
    Map<Character, Boolean> countMap = new HashMap<>();
    for (int i = 0; i < 9; i++) {
      countMap.clear();
      for (int j = 0; j < 9; j++) {
        if (countMap.containsKey(board[j][i])) {
          return false;
        }
        if (board[j][i] >= '1' && board[j][i] <= '9') {
          countMap.put(board[j][i], true);
        }
      }
    }
    return true;
  }

  private boolean nineCheck(char[][] board) {
    Map<Character, Boolean> countMap = new HashMap<>();
    for (int levelX = 0; levelX < 3; levelX++) {
      for (int levelY = 0; levelY < 3; levelY++) {
        countMap.clear();
        for (int i = levelX * 3; i < levelX * 3 + 3; i++) {
          for (int j = levelY * 3; j < levelY * 3 + 3; j++) {
            if (countMap.containsKey(board[i][j])) {
              return false;
            }
            if (board[i][j] >= '1' && board[i][j] <= '9') {
              countMap.put(board[i][j], true);
            }
          }
        }
      }
    }
    return true;
  }

}
