package org.galaxy.goahead;

/**
 * @author Galaxy
 * @since 2022/4/14 0:00
 */
public class TrieNode {

  private final int R = 26;

  private TrieNode[] links;

  private boolean isEnd;

  public TrieNode() {
    links = new TrieNode[R];
  }

  public void put(char ch) {
    links[ch - 'a'] = new TrieNode();
  }

  public TrieNode get(char ch) {
    return links[ch - 'a'];
  }

  public boolean containKey(char ch) {
    return links[ch - 'a'] != null;
  }

  public boolean isEnd() {
    return isEnd;
  }

  public void setEnd() {
    isEnd = true;
  }

}
