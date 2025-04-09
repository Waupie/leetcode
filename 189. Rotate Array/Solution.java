/**
 * Author:      Maximilian Holm
 * Date:        09/04/2025
 * Description: This method checks if two strings are isomorphic. Two strings are isomorphic if
 *              characters in the first string can be replaced to get the second string, with a
 *              one-to-one and consistent mapping. It uses two hash maps to ensure that each character
 *              in 's' maps to exactly one character in 't', and vice versa.
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
