package org.galaxy.goahead;

/**
 * @author Galaxy
 * @since 2022/4/13 0:50
 */
public class Solution0208 {

  public static void main(String[] args) {
    Trie trie = new Trie();
    trie.insert("apple");
    trie.search("apple");   // 返回 True
    trie.search("app");     // 返回 False
    trie.startsWith("app"); // 返回 True
    trie.insert("app");
    trie.search("app");     // 返回 True
  }

  private static class Trie {
    private final Trie[] children;

    private boolean isEnd;

    public Trie() {
      children = new Trie[26];
      isEnd = false;
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

    public boolean startsWith(String prefix) {
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

}

class TrieNodeTemp {

  private TrieNodeTemp[] links;

  private final int R = 26;

  private boolean isEnd;

  public TrieNodeTemp() {
    links = new TrieNodeTemp[R];
  }

  public boolean containsKey(char ch) {
    return links[ch - 'a'] != null;
  }

  public TrieNodeTemp get(char ch) {
    return links[ch - 'a'];
  }

  public void put(char ch, TrieNodeTemp node) {
    links[ch - 'a'] = node;
  }

  public void setEnd() {
    isEnd = true;
  }

  public boolean isEnd() {
    return isEnd;
  }
}