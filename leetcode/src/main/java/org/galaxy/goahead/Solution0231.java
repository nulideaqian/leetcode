package org.galaxy.goahead;

/**
 * @author Galaxy
 * @since 2022/5/8 10:39
 */
public class Solution0231 {

  public boolean isPowerOfTwo(int n) {
    int count = 0;
    while (n != 0) {
      n = n & (n - 1);
      count++;
      if (count > 1) {
        return false;
      }
    }
    return count != 0;
  }

}
