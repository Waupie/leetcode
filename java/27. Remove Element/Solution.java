/**
 * Author:      Maximilian Holm
 * Date:        27/03/2025
 * Description: This class contains a method to remove all occurrences of a specific value (val) from an array. 
 *              The method modifies the array in place, retaining only the elements that are not equal to the given value. 
 *              It returns the number of elements left in the array after removal.
 */

class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        for (int num : nums) {
            if (num != val) {
                nums[k] = num;
                k++;
            }
        }
        return k;
    }
}