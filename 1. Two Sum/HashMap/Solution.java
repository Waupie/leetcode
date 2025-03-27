/**
 * Author:      Maximilian Holm
 * Date:        27/03/2025
 * Description: This class contains a method to find two indices in an array using a 
 *              HashMap such that the numbers at those indices add up to a target value.
 */


class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        return new int[0];
    }
}