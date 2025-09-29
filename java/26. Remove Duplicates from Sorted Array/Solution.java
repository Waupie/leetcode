/**
 * Author:      Maximilian Holm
 * Date:        27/03/2025
 * Description: This class contains a method to remove duplicates from a sorted array. 
 *              The method modifies the array in place, ensuring each unique element appears only once. 
 *              It returns the number of unique elements.
 */


class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        
        for (int num : nums) {
            if (k == 0 || num != nums[k - 1]) {
                nums[k] = num;
                k++;
            }
        }

        return k;
    }
}