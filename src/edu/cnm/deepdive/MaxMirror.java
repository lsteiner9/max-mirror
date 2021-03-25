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

  public static int recurseMirror(int[] nums, int start, int stop) {
    if (start >= stop) {
      return 1;
    } else if (!isMirror(nums, start, stop)) {
      return Math.max(recurseMirror(nums, start + 1, stop), recurseMirror(nums, start, stop - 1));
    } else {
      return nums.length;
    }
  }

  public static boolean isMirror(int[] nums, int start, int stop) {
    for (int i = 0, j = stop - start; j >= 0; i++, j--) {
      if (nums[i] != nums[j]) {
        return false;
      }
    }
    return true;
  }

  public static boolean areMirrors(int[] nums, int start1, int stop1, int start2, int stop2) {
    if (stop1 - start1 != stop2 - start2) {
      return false;
    }
    for (int i = start1, j = stop2; i <= stop1; i++, j--) {
      if (nums[i] != nums[j]) {
        return false;
      }
    }
    return true;
  }
}
