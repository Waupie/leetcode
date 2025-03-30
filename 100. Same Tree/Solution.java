/**
 * Author:      Maximilian Holm
 * Date:        30/03/2025
 * Description: This class contains a method to check if two binary trees are identical.
 *              Two trees are considered identical if they have the same structure
 *              and the nodes contain the same values.
 */


/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            // Both nodes are null, trees are identical so far.
            return true;
        }
        if (p == null || q == null) {
            // One of the nodes is null, the trees are not identical.
            return false;
        }
        if (p.val != q.val) {
            // Node values are different, the trees are not identical.
            return false;
        }
        // Recursively check the left and right subtrees.
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}