// Source : https://leetcode.com/problems/binary-tree-paths/
// Author : Kyon Huang
// Date   : 2017-11-13

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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>(); 
        if(root != null) {
            String str = String.valueOf(root.val);
            addPath(root, str, list, str.length()+2);
        }
        return list;
    }
    
    private void addPath(TreeNode root, String str, List<String> list, int start) {
        
        str += "->" + String.valueOf(root.val);

        if(root.left == null && root.right == null) {
            list.add(str.substring(start));
        }
        if(root.right != null) {
            addPath(root.right, str, list, start);
        }
        if(root.left != null){
            addPath(root.left, str, list, start);
        }
            
            
    }
}