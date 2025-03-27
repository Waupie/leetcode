/**
 * Author:      Maximilian Holm
 * Date:        27/03/2025
 * Description: This class contains a method to find the majority element in an array. 
 *              The majority element is defined as the element that appears more than 
 *              nums.length / 2 times. The implementation uses the Boyer-Moore Voting 
 *              Algorithm for efficient O(n) time complexity and O(1) space complexity.
 */


class Solution {
    public int majorityElement(int[] nums) {
        int candidate = nums[0];
        int count = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        return candidate;
    }
}
