package org.galaxy.goahead;

import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author Galaxy
 * @since 2022/5/2 15:25
 */
public class Solution0127V2 {

  /**
   * 输入：beginWord = "hit", endWord = "cog", wordList = ["hot","dot","dog","lot","log","cog"]
   * 输出：5
   * 解释：一个最短转换序列是 "hit" -> "hot" -> "dot" -> "dog" -> "cog", 返回它的长度 5。
   *
   * @param beginWord
   * @param endWord
   * @param wordList
   * @return
   */
  public int ladderLength(String beginWord, String endWord, List<String> wordList) {
    Deque<String> processQueue = new LinkedList<>();
    Set<String> wordSet = new HashSet<>();
    Map<String, Integer> recordMap = new HashMap<>();
    for (String word : wordList) {
      recordMap.put(word, Integer.MAX_VALUE);
      wordSet.add(word);
    }
    processQueue.add(beginWord);
    recordMap.put(beginWord, 1);
    while (!processQueue.isEmpty()) {
      String currVal = processQueue.pollFirst();
      if (currVal.equals(endWord)) {
        return recordMap.get(currVal);
      }
      for (String adjoin : getAdjoins(wordSet, currVal)) {
        if (recordMap.get(adjoin) == Integer.MAX_VALUE) {
          processQueue.addLast(adjoin);
          recordMap.put(adjoin, recordMap.get(currVal) + 1);
        }
      }
    }
    return 0;
  }

  private List<String> getAdjoins(Set<String> wordSet, String currVal) {
    List<String> result = new LinkedList<>();
    for (int i = 0; i < currVal.length(); i++) {
      char[] chars = currVal.toCharArray();
      char oldChar = chars[i];
      for (char j = 'a'; j <= 'z'; j++) {
        chars[i] = j;
        String word = String.valueOf(chars);
        if (oldChar != j && wordSet.contains(word)) {
          result.add(word);
        }
      }
    }
    return result;
  }

}
