package org.galaxy.goahead;

/**
 * @author Galaxy
 * @since 2022/5/8 3:32
 */
public class Solution0191 {

  public int hammingWeight(int n) {
    int count = 0;
    while (n != 0) {
      count++;
      n = n & (n - 1);
    }
    return count;
  }
}
