// Source : https://leetcode.com/problems/find-largest-value-in-each-tree-row/
// Author : Kyon Huang
// Date   : 2017-12-02

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
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root != null) {
            Queue<TreeNode> queue = new LinkedList<>();
            queue.offer(root);
            int size = 1;
            while(size != 0) {
                int max = Integer.MIN_VALUE;
                for(int i = 0; i < size; i++) {
                    TreeNode node = queue.poll();
                    max = Math.max(max, node.val);
                    if(node.left != null)
                        queue.offer(node.left);
                    if(node.right != null)
                        queue.offer(node.right);
                }
                size = queue.size();
                list.add(max);
            }
        }

        return list;
        
    }
}