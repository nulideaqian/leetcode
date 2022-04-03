package org.galaxy.goahead;

/**
 * @author Galaxy
 * @since 2022/4/4 1:22
 */
public class Solution0367 {

  public boolean isPerfectSquare(int num) {
    // boundary conditions
    if (num == 0 || num == 1) {
      return true;
    }
    int left = 1;
    int right = num;
    while (right > left) {
      int mid = left + (right - left + 1) / 2;
      if (num / mid < mid) {
        right = mid - 1;
      } else if (num / mid == mid && num % mid == 0) {
        return true;
      } else {
        left = mid;
      }
    }
    return false;
  }

}
