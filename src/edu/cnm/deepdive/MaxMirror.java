package edu.cnm.deepdive;

public class MaxMirror {

  public static int maxMirror(int[] nums) {
    int count = 0;
    for (int i = nums.length - 1; i > 0; i--) {
      for (int j = i - 1; j >= 0; j--) {
        int[] temp = reverse(nums, j, i + 1);
        int index = 0;
        for (int num : nums) {
          if (index >= temp.length) {
            break;
          }
          if (temp[index] == num) {
            index++;
            count = Math.max(index, count);
          } else {
            index = 0;
          }
        }
      }
    }
    return nums.length == 1 ? 1 : count;
  }

  private static int[] reverse(int[] nums, int start, int stop) {
    int[] reversed = new int[stop - start];
    int count = 0;
    for (int i = stop - 1; i >= start; i--) {
      reversed[count++] = nums[i];
    }
    return reversed;
  }

}