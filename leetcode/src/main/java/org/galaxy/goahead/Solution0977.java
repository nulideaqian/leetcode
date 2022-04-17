package org.galaxy.goahead;

/**
 * @author Galaxy
 * @since 2022/4/18 0:07
 */
public class Solution0977 {

  public int[] sortedSquares(int[] nums) {
    int left = 0;
    int right = nums.length - 1;
    int[] result = new int[nums.length];
    int currIdx = right;
    while (right > left) {
      int leftVal = Math.abs(nums[left]);
      int rightVal = Math.abs(nums[right]);
      if (rightVal > leftVal) {
        result[currIdx] = rightVal * rightVal;
        right--;
      } else {
        result[currIdx] = leftVal * leftVal;
        left++;
      }
      currIdx--;
    }
    result[0] = nums[left] * nums[left];
    return result;
  }

}
