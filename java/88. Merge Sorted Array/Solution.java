/**
 * Author:      Maximilian Holm
 * Date:        27/03/2025
 * Description: This class contains a method to merge two sorted arrays.
 *              The elements of nums2 are appended to nums1 starting from index 'm',
 *              and the merged array is then sorted in non-decreasing order.
 */


class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < n; i++) nums1[m + i] = nums2[i];
        Arrays.sort(nums1);
    }
}