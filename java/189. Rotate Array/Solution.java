/**
 * Author:      Maximilian Holm
 * Date:        01/04/2025
 * Updated-Date:10/04/2025 - Updated the comment, as it was incorrect.
 * Description: This method rotates the elements of the input array 'nums' to the right by 'k' steps.
 *              It uses a temporary array to store the rotated result, calculates each element's new
 *              position based on the offset 'k', and then copies the result back to the original array.
 *              Note: The current implementation contains an off-by-one error when computing positions.
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
