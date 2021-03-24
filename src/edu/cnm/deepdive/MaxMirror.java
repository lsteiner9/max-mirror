package edu.cnm.deepdive;

public class MaxMirror {

  public static int maxMirror(int[] nums) {
    int count = nums.length;
    if (nums.length == 0) {
    } else if (nums[0] != nums [nums.length - 1]) {
      count = Math.max(recurseMirror(nums, 0, nums.length - 2), recurseMirror(nums, 1, nums.length - 1));
    }
    return count;
  }

  private static int recurseMirror(int[] nums, int start, int stop) {
    if (start >= stop) {
      return 1;
    } else if (!isMirror(nums, start, stop)) {
      return Math.max(recurseMirror(nums, start + 1, stop), recurseMirror(nums, start, stop - 1));
    } else {
      return nums.length;
    }
  }

  private static boolean isMirror(int[]nums, int start, int stop) {
    for (int i = 0, j = stop + 1 - start; j >= 0; i++, j--) {
      if (nums[i] != nums[j]) {
        return false;
      }
    }
    return true;
  }
}
