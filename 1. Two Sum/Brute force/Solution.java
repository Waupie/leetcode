/**
 * Author:      Maximilian Holm
 * Date:        27/03/2025
 * Description: This class contains a method to find two indices in an array 
 *              such that the numbers at those indices add up to a target value.
 */


class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j) {
                    if ((nums[i] + nums[j]) == target) {
                        arr[0] = i;
                        arr[1] = j;
                        return arr;
                    }
                }
            }
        }
        return arr;
    }
}