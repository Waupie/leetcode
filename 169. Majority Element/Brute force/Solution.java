/**
 * Author:      Maximilian Holm
 * Date:        27/03/2025
 * Description: This method finds the majority element in an array by iterating 
 *              through each element and counting its occurrences. The majority 
 *              element is defined as the element that appears more than 
 *              nums.length / 2 times. The method returns the majority element.
 */


class Solution {
    public int majorityElement(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
                if (count > nums.length/2) {
                    return nums[i];
                }
                
            }
        }
        return 0;
    }
}