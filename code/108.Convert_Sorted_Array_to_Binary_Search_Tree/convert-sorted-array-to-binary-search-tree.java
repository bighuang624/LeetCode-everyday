// Source : https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/
// Author : Kyon Huang
// Date   : 2017-12-24

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length == 0) {
            return null;
        }
        TreeNode root = sortedArrayToBST(nums, 0, nums.length-1);
        return root;
    }
    
    public TreeNode sortedArrayToBST(int[] nums, int i, int j) {
        if(j < i)
            return null;
        else {
            int middle = i + (j - i) / 2;
            TreeNode root = new TreeNode(nums[middle]);
            root.left = sortedArrayToBST(nums, i, middle-1);
            root.right = sortedArrayToBST(nums, middle+1, j);
            return root;
        }
    }
}