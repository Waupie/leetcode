/**
 * Author:      Maximilian Holm
 * Date:        27/03/2025
 * Description: This method finds the majority element in an array using a HashMap to 
 *              count the occurrences of each number. The majority element is defined 
 *              as the element that appears more than nums.length / 2 times. It returns 
 *              the majority element.
 */


class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int majorityCount = nums.length / 2;

        for (int num : nums) {
           
            map.put(num, map.getOrDefault(num, 0) + 1);

            
            if (map.get(num) > majorityCount) {
                return num;
            }
        }

        // Return value is just a placeholder, since a majority element is
        // guaranteed in the tests
        return 0; /
    }
}
