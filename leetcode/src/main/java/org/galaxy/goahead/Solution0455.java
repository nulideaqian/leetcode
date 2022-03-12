package org.galaxy.goahead;

import java.util.Arrays;

/**
 * @author Galaxy
 * @since 2022/3/12 23:44
 */
public class Solution0455 {

  public int findContentChildren(int[] g, int[] s) {
    // 贪心策略：优先满足胃口最低的
    int count = 0;
    Arrays.sort(g);
    Arrays.sort(s);
    int cookieIndex = 0;
    for (int appetite : g) {
      for (; cookieIndex < s.length; cookieIndex++) {
        if (s[cookieIndex] >= appetite) {
          count++;
          cookieIndex++;
          break;
        }
      }
    }
    return count;
  }

}
