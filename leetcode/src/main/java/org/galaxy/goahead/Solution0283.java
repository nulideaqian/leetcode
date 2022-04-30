package org.galaxy.goahead;

/**
 * @author Galaxy
 * @since 2022/4/23 12:45
 */
public class Solution0283 {

  public void moveZeroes(int[] nums) {
    solution02(nums);
  }

  private void solution01(int[] nums) {
    if (nums.length <= 1) {
      return;
    }
    int firstZeroIdx = -1;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == 0 && firstZeroIdx == -1) {
        firstZeroIdx = i;
      }
      if (nums[i] != 0 && firstZeroIdx != -1) {
        int tmp = nums[i];
        nums[i] = 0;
        nums[firstZeroIdx] = tmp;
        firstZeroIdx++;
      }
    }
  }

  private void solution02(int[] nums) {
    int left = 0;
    int right = 0;
    int n = nums.length;
    while (right < n) {
      if (nums[right] != 0) {
        swap(nums, left, right);
        left++;
      }
      right++;
    }
  }

  private void swap(int[] nums, int left, int right) {
    int temp = nums[left];
    nums[left] = nums[right];
    nums[right] = temp;
  }
}
