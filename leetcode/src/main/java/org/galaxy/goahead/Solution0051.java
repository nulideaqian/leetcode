package org.galaxy.goahead;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Galaxy
 * @since 2022/4/30 23:48
 */
public class Solution0051 {

  public List<List<String>> solveNQueens(int n) {
    List<String> records = new LinkedList<>();
    List<int[]> recordsV2 = new LinkedList<>();
    List<List<String>> result = new LinkedList<>();
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        boolean[][] visited = new boolean[n][n];
        dfs(visited, i, j, 1, n, records, recordsV2, result);
      }
    }
    return result.stream().distinct().toList();
  }

  private void dfs(boolean[][] visited, int x, int y, int count, int level, List<String> records, List<int[]> recordsV2,
      List<List<String>> result) {
    // 1. terminator
    // 1.1 beyond the edge
    if (x < 0 || y < 0 || x >= level || y >= level || visited[x][y]) {
      return;
    }
    // 1.2 count less than level
    if (count > level) {
      return;
    }
    // 2. process current logic
    records.add(getLine(level, y));
    recordsV2.add(new int[]{x, y});
    visited[x][y] = true;
    if (count == level) {
      result.add(new ArrayList<>(records));
    }

    // 3. drill down
    for (int j = 0; j < level; j++) {
      if (!canAttack(recordsV2, x + 1, j)) {
        dfs(visited, x + 1, j, count + 1, level, records, recordsV2, result);
      }
    }
    // 4. reverse state
    records.remove(records.size() - 1);
    recordsV2.remove(recordsV2.size() - 1);
    visited[x][y] = false;
  }

  private boolean canAttack(List<int[]> records, int queenX, int queenY) {
    for (int[] record : records) {
      if (canAttack(record[0], record[1], queenX, queenY)) {
        return true;
      }
    }
    return false;
  }

  private boolean canAttack(int targetX, int targetY, int queenX, int queenY) {
    if (targetX == queenX || targetY == queenY) {
      return true;
    }
    return Math.abs(targetX - queenX) == Math.abs(targetY - queenY);
  }

  private String getLine(int level, int y) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < level; i++) {
      if (i == y) {
        sb.append("Q");
      } else {
        sb.append(".");
      }
    }
    return sb.toString();
  }

}
