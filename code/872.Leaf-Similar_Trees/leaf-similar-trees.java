// Source : https://leetcode.com/problems/leaf-similar-trees/
// Author : Kyon Huang
// Date   : 2018-09-13

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
     public boolean leafSimilar(TreeNode root1, TreeNode root2) { 
         return traverse(root1).equals(traverse(root2));
     }
     String traverse(TreeNode root){
         if(root==null) return "";
         if(root.left==null && root.right==null) return root.val+"-";  
         return traverse(root.left)+traverse(root.right);
     }
}