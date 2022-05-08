package org.galaxy.goahead;

/**
 * @author Galaxy
 * @since 2022/5/8 10:53
 */
public class Solution0190 {

  public int reverseBits(int n) {
    int result = 0;
    boolean isNegative = n < 0;
    n = n & Integer.MAX_VALUE;
    int num;
    for (int i = 0; i < 31; i++) {
      num = (n & 1) == 0 ? 0 : 1;
      result = (result << 1) + num;
      n = n >> 1;
    }
    return result << 1 | (isNegative ? 1 : 0);
  }
}
