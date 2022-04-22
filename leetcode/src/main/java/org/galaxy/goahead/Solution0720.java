package org.galaxy.goahead;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author Galaxy
 * @since 2022/4/23 0:48
 */
public class Solution0720 {

  public String longestWord(String[] words) {
    List<String> sortWords = Arrays.stream(words).sorted(Comparator.comparingInt(String::length))
        .toList();
    String result = "";
    Trie trie = new Trie();
    for (String word : sortWords) {
      if (trie.startWith(word.substring(0, word.length() - 1))) {
        trie.insert(word);
        if (strCompare(result, word)) {
          result = word;
        }
      }
    }
    return result;
  }

  public boolean strCompare(String oldValue, String newVal) {
    if (newVal.length() > oldValue.length()) {
      return true;
    }
    if (newVal.length() == oldValue.length()) {
      for (int i = 0; i < newVal.toCharArray().length; i++) {
        if (newVal.charAt(i) == oldValue.charAt(i)) {
          continue;
        }
        return newVal.charAt(i) < oldValue.charAt(i);
      }
    }
    return false;
  }

  private static class Trie {
    private final Trie[] children;

    private boolean isEnd;

    public Trie() {
      this.children = new Trie[26];
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
}
