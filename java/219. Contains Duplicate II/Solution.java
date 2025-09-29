/**
 * Author:      Maximilian Holm  
 * Date:        2025-04-11
 * Description: This solution checks if there are any two duplicate elements in the array
 *              such that the indices of the duplicates are at most `k` apart.
 * 
 *              If such a pair exists, the method returns true.
 *              If the loop completes without finding a valid pair, it returns false.
 * 
 *              i = where we are currently
 *              j = (i - previousNum)
 *              
 */


class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int currentNum = nums[i];
            
            if (map.containsKey(currentNum)) {
                int previousNum = map.get(currentNum);
                if (Math.abs(i - previousNum) <= k) return true; 
            }

            map.put(currentNum, i);
        }
        return false;
    }
}