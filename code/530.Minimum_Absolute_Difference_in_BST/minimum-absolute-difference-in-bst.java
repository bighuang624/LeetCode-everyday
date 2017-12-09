// Source : https://leetcode.com/problems/minimum-absolute-difference-in-bst/
// Author : Kyon Huang
// Date   : 2017-12-09

// 第一思路，非最佳解法

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
    public int getMinimumDifference(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        traverse(root, list);
        int len = list.size();
        int[] nums = new int[len];
        int minDifference = Integer.MAX_VALUE;
        nums[0] = list.get(0);
        for(int i = 1; i < len; i++) {
            nums[i] = list.get(i);
            minDifference = Math.min(nums[i]-nums[i-1], minDifference);
        }
        return minDifference;
    }
    
    private void traverse(TreeNode root, ArrayList<Integer> list) {
        if(root != null) {
            traverse(root.left, list);
            list.add(root.val);
            traverse(root.right, list);
        }
    }
}