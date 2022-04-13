package org.galaxy.goahead;

import java.util.List;

/**
 * @author Galaxy
 * @since 2022/4/13 0:50
 */
public class Solution0208 {



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