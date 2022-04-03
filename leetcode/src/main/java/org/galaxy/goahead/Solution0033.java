package org.galaxy.goahead;

/**
 * @author Galaxy
 * @since 2022/4/4 1:51
 */
public class Solution0033 {

  public int search(int[] nums, int target) {
    // 1. find the rotated index
    int rotatedIdx = findRotatedIndex(nums);
    // 2. find the target index
    int result = findTargetIndex(nums, 0, rotatedIdx - 1, target);
    if (result != -1) {
      return result;
    }
    return findTargetIndex(nums, rotatedIdx, nums.length - 1, target);
  }

  private int findTargetIndex(int[] nums, int left, int right, int target) {
    while (right > left) {
      int mid = left + (right - left + 1) / 2;
      if (nums[mid] > target) {
        right = mid - 1;
      } else if (nums[mid] == target) {
        return mid;
      } else {
        left = mid;
      }
    }
    return nums[left] == target ? left : -1;
  }

  private int findRotatedIndex(int[] nums) {
    for (int i = 1; i < nums.length; i++) {
      if (nums[i] < nums[i - 1]) {
        return i;
      }
    }
    return 0;
  }

}
