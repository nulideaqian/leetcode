package org.galaxy.goahead;

/**
 * @author Galaxy
 * @since 2022/4/23 17:15
 */
public class Solution0130 {

  public void solve(char[][] board) {
    int m = board.length;
    int n = board[0].length;
    boolean[][] visited = new boolean[m][n];
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        if (i == 0 || i == m - 1 || j == 0 || j == n - 1) {
          if (board[i][j] == 'O') {
            dfs(board, visited, i, j);
          }
        }
      }
    }
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        if (!visited[i][j] && board[i][j] == 'O') {
          board[i][j] = 'X';
        }
      }
    }
  }

  private void dfs(char[][] board, boolean[][] visited, int x, int y) {
    if (x < 0 || y < 0 || x >= board.length || y >= board[0].length || board[x][y] == 'X' || visited[x][y]) {
      return;
    }
    visited[x][y] = true;
    dfs(board, visited, x - 1, y);
    dfs(board, visited, x + 1, y);
    dfs(board, visited, x, y - 1);
    dfs(board, visited, x, y + 1);
  }

  private static class DisjointSet {
    private int count;
    private final int[] parents;
    public DisjointSet(int n) {
      count = n;
      parents = new int[n];
      for (int i = 0; i < n; i++) {
        parents[i] = i;
      }
    }
    public int find(int n) {
      int i = n;
      while (parents[i] != i) {
        i = parents[i];
      }
      return i;
    }
    public void union(int p, int q) {
      int rootQ = find(q);
      int rootP = find(p);
      if (rootP == rootQ) {
        return;
      }
      parents[rootP] = rootQ;
      count--;
    }
  }

}
