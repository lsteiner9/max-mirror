package edu.cnm.deepdive;

import java.util.Arrays;

public class MaxMirror {

  public static int maxMirror(int[] nums) {
    int count = 0;
    String numbers = Arrays.toString(nums).replace("[", "").replace("]", "").replace(",", "").replace(" ", "");
    for (int i = numbers.length() - 1; i > 0; i--) {
      for (int j = i - 1; j >= 0; j--) {
        String temp = new StringBuilder(numbers.substring(j, i + 1)).reverse().toString();
        if (numbers.contains(temp)) {
          count = Math.max(count, i + 1 - j);
        }
      }
    }
    return nums.length == 1 ? 1 : count;
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
