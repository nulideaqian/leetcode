package org.galaxy.goahead;

/**
 * 算法模板
 *
 * @author Galaxy
 * @since 2022/4/23 12:30
 */
public class ModuleAnswer {

  /**
   * 字典树 (前缀树)
   */
  private static class Trie {

    private final Trie[] children;

    private boolean isEnd;

    public Trie() {
      this.children = new Trie[26];
      this.isEnd = false;
    }

    public void insert(String word) {
      Trie currNode = this;
      for (char ch : word.toCharArray()) {
        if (currNode.children[ch - 'a'] == null) {
          currNode.children[ch - 'a'] = new Trie();
        }
        currNode = currNode.children[ch - 'a'];
      }
      currNode.isEnd = true;
    }

    public boolean search(String word) {
      Trie currNode = this;
      for (char ch : word.toCharArray()) {
        if (currNode.children[ch - 'a'] == null) {
          return false;
        }
        currNode = currNode.children[ch - 'a'];
      }
      return currNode.isEnd;
    }

    public boolean startWith(String prefix) {
      Trie currNode = this;
      for (char ch : prefix.toCharArray()) {
        if (currNode.children[ch - 'a'] == null) {
          return false;
        }
        currNode = currNode.children[ch - 'a'];
      }
      return true;
    }
  }

  /**
   * 并查集 Disjoint Set
   */
  private static class UnionFind {
    private int count = 0;
    private final int[] parent;
    public UnionFind(int n) {
      count = n;
      parent = new int[n];
      for (int i = 0; i < n; i++) {
        parent[i] = i;
      }
    }
    public int find(int p) {
      while (p != parent[p]) {
        parent[p] = parent[parent[p]];
        p = parent[p];
      }
      return p;
    }
    public void union(int p, int q) {
      int rootP = find(p);
      int rootQ = find(q);
      if (rootQ == rootP) {
        return;
      }
      parent[rootP] = rootQ;
      count--;
    }
  }
}
