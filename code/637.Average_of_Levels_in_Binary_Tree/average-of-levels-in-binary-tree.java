// Source : https://leetcode.com/problems/average-of-levels-in-binary-tree/
// Author : Kyon Huang
// Date   : 2017-11-23

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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> list = new LinkedList<Double>();
        if(root != null) {
            Queue<TreeNode> queue = new LinkedList<TreeNode>();
            queue.add(root);
            while(!queue.isEmpty()) {
                int nums = queue.size();
                double sum = 0;
                for(int i = 0; i < nums; i++) {
                    TreeNode node = queue.poll();
                    if(node.left != null)
                        queue.add(node.left);
                    if(node.right != null)
                        queue.add(node.right);
                    sum += node.val;
                }
                list.add(sum / nums);
            }
        }
        
        return list;
    }
}