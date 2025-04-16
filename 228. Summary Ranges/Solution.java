/**
 * Author:      Maximilian Holm
 * Date:        2025-04-16
 * Description: This class provides a method to summarize ranges in a sorted integer array.
 *              Consecutive numbers are grouped into a range "start->end", while isolated numbers
 *              are represented as single elements. For example, the input [0,1,2,4,5,7] will produce
 *              the output ["0->2", "4->5", "7"].
 */

class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> numList = new ArrayList<>();
        int i = 0;
        while (i < nums.length) {
            int start = nums[i];
            // Move forward while consecutive numbers follow
            while (i + 1 < nums.length && nums[i + 1] == nums[i] + 1) { i++ };

            if (start != nums[i])
                numList.add(start + "->" + nums[i]);
            else
                numList.add(String.valueOf(start));
                
            i++;
        }
        return numList;
    }
}