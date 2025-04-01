/**
 * Author:      Maximilian Holm
 * Date:        01/04/2025
 * Description: This class 'rotates' an array with k-amount of positions, if k is bigger than
 *              the array it jumps to the beginning of the array.
 */


class Solution {
    public void rotate(int[] nums, int k) {
        int[] temp = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int newPos = i + k + 1;
            if (newPos > nums.length) newPos -= nums.length;
            temp[newPos - 1] = nums[i];
        }
        for (int i = 0; i < nums.length; i++) nums[i] = temp[i];
    }
}
