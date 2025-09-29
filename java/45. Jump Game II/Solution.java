/**
 * Author:      Maximilian Holm
 * Date:        01/04/2025
 * Description: This class provides a solution to the problem of finding the minimum number
 *              of jumps required to reach the last index of an integer array. Each element 
 *              in the array represents the maximum number of steps forward that can be taken 
 *              from that position. The solution employs a greedy algorithm, tracking the 
 *              farthest reachable index and the current jump range to determine the minimum 
 *              number of jumps.
 */


class Solution {
    public int jump(int[] nums) {
        int jumps = 0;
        int end = 0;
        int farthest = 0;
        
        for (int i = 0; i < nums.length - 1; i++) {
            farthest = Math.max(farthest, i + nums[i]);
            if (i == end) {
                jumps++;
                end = farthest;
            }
        }
        return jumps;
    }
}