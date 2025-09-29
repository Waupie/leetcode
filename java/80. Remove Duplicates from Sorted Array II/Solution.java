/**
 * Author:      Maximilian Holm
 * Date:        27/03/2025
 * Description: This class contains a method to remove duplicates from a sorted array in-place 
 *              such that each unique element appears at most twice. 
 *              The method returns the length of the modified array.
 */


class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 0;

        for (int num : nums) { 
            if (k < 2 || num != nums[k - 2]) {
                nums[k] = num; 
                k++; 
            }
        }
        return k;
    }
}