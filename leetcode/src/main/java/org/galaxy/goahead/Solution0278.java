package org.galaxy.goahead;

/**
 * @author Galaxy
 * @since 2022/3/27 18:45
 */
public class Solution0278 {

  public int firstBadVersion(int n) {
    int left = 1;
    int right = n;
    while (right > left) {
      int mid = left + (right - left) / 2;
      if (isBadVersion(mid)) {
        right = mid;
      } else {
        left = mid + 1;
      }
    }
    return right;
  }

  /**
   * 2126753390
   * 1500000000
   * @param version
   * @return
   */
  private boolean isBadVersion(int version) {
    return version >= 1500000000;
  }

}
