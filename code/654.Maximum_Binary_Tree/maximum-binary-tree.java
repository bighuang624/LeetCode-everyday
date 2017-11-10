// Source : https://leetcode.com/problems/maximum-binary-tree/
// Author : Kyon Huang
// Date   : 2017-11-10 

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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        
        if(nums == null)
            return null;
        return build(nums, 0, nums.length-1);
        
    }

    private TreeNode build(int[] nums, int start, int end) {
        if(start > end)
            return null;
        int maxVindex = start;
        for(int i = start; i <= end; i++) {
            if(nums[i] > nums[maxVindex]) {
                maxVindex = i;
            }
        }
        TreeNode root = new TreeNode(nums[maxVindex]);
        
        root.left = build(nums, start, maxVindex-1);
        root.right = build(nums, maxVindex+1, end);
        return root;
        
    }
    
}