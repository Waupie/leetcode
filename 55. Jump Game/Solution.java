/**
 * Author:      [Your Name]
 * Date:        01/04/2025
 * Description: This class determines whether it's possible to reach the last index
 *              of an integer array, where each element represents the maximum number
 *              of steps that can be taken forward from that position. The solution 
 *              uses a greedy algorithm to track the farthest reachable index while
 *              iterating through the array. If the last index is reachable, it returns true.
 */


class Solution {
    public boolean canJump(int[] nums) {
        int farthest = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i > farthest) return false;
            farthest = Math.max(farthest, i + nums[i]);
            // If the farthest reachable index is beyond or at the last index, return true
            if (farthest >= nums.length - 1) return true;
        }
        return false; 
    }
}