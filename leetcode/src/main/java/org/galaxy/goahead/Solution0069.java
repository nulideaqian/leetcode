package org.galaxy.goahead;

/**
 * @author Galaxy
 * @since 2022/4/2 0:52
 */
public class Solution0069 {

  public int mySqrt(int x) {
    if (x == 0 || x == 1) {
      return x;
    }
    int left = 1;
    int right = x;
    while (left < right) {
      int mid = left + (right - left + 1) / 2;
      if (mid * mid > x) {
        right = mid - 1;
      } else {
        left = mid;
      }
    }
    return left;
  }

}
