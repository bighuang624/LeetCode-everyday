// Source : https://leetcode.com/problems/maximum-width-of-binary-tree/
// Author : Kyon Huang
// Date   : 2018-05-21

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
    public int widthOfBinaryTree(TreeNode root) {
        if(root == null)
            return 0;
        int result = 1;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        Queue<Integer> numberQueue = new LinkedList<Integer>();
        queue.offer(root);
        numberQueue.offer(0);
        while(!queue.isEmpty()) {
            int size = queue.size();
            int left = -1;
            int right = -1;
            for(int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                int curVal = numberQueue.poll();
                if(node.left != null) {
                    if(left == -1)
                        left = 2*curVal+1;
                    right = 2*curVal+1;
                    queue.offer(node.left);
                    numberQueue.offer(2*curVal+1);
                }
                if(node.right != null) {
                    if(left == -1)
                        left = 2*curVal+2;
                    right = 2*curVal+2;
                    queue.offer(node.right);
                    numberQueue.offer(2*curVal+2);
                }
            }
            result = Math.max(result, right-left+1);
        }
        return result;
    }
}