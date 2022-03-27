package org.galaxy.goahead;

/**
 * @author Galaxy
 * @since 2022/3/27 17:14
 */
public class Solution0704 {

  public int search(int[] nums, int target) {
    if (nums.length == 0) {
      return -1;
    }
    int left = 0;
    int right = nums.length - 1;
    int mid = (left + right) / 2;
    while (right >= left) {
      if (nums[mid] == target) {
        return mid;
      }
      if (nums[mid] > target) {
        right = mid - 1;
      } else {
        left = mid + 1;
      }
      mid = (left + right) / 2;
    }
    return -1;
  }

}
