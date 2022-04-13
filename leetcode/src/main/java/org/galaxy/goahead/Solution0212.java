package org.galaxy.goahead;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Galaxy
 * @since 2022/4/13 23:50
 */
public class Solution0212 {

  public List<String> findWords(char[][] board, String[] words) {
    // build trie tree
    TrieNode root = new TrieNode();
    TrieNode currNode;
    for (String word : words) {
      currNode = root;
      for (char ch : word.toCharArray()) {
        if (!currNode.containKey(ch)) {
          currNode.put(ch);
        }
        currNode = currNode.get(ch);
      }
      currNode.setEnd();
    }

    int m = board.length;
    int n = board[0].length;

    Set<String> result = new HashSet<>();
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        dfs(board, i, j, "", root, new boolean[m][n], result);
      }
    }
    return new ArrayList<>(result);
  }

  private void dfs(char[][] board, int x, int y, String word, TrieNode currNode, boolean[][] visited, Set<String> words) {
    if (x < 0 || y < 0 || x >= board.length || y >= board[0].length || visited[x][y]) {
      return;
    }
    visited[x][y] = true;
    currNode = currNode.get(board[x][y]);
    if (currNode == null) {
      visited[x][y] = false;
      return;
    }
    word += board[x][y];
    if (currNode.isEnd()) {
      words.add(word);
    }
    dfs(board, x + 1, y, word, currNode, visited, words);
    dfs(board, x - 1, y, word, currNode, visited, words);
    dfs(board, x, y + 1, word, currNode, visited, words);
    dfs(board, x, y - 1, word, currNode, visited, words);
    visited[x][y] = false;
  }

}
