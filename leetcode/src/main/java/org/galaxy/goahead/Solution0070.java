package org.galaxy.goahead;

/**
 * @author Galaxy
 * @since 2022/4/5 23:25
 */
public class Solution0070 {

  public int climbStairs(int n) {
    if (n <= 2) {
      return n;
    }
    int first = 1;
    int second = 2;
    for (int i = 2; i < n; i++) {
      int temp = second;
      second = first + second;
      first = temp;
    }
    return second;
  }

}
