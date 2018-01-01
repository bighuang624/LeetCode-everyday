// Source : https://leetcode.com/problems/binary-tree-level-order-traversal-ii/
// Author : Kyon Huang
// Date   : 2017-12-29

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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if(root != null) {
            Stack<List<Integer>> stack = new Stack<List<Integer>>();
            Queue<TreeNode> queue = new LinkedList<TreeNode>();
            queue.offer(root);
            pushIntoStack(stack, queue);
            while(!stack.isEmpty()) {
                List<Integer> alist = stack.pop();
                result.add(alist);
            }
        }
        return result;
    }
    
    private void pushIntoStack(Stack<List<Integer>> stack, Queue<TreeNode> queue) {
        while(queue.size() != 0) {
            ArrayList<Integer> list = new ArrayList<Integer>();
            int times = queue.size();
            while(times != 0) {
                TreeNode node = queue.poll();
                list.add(node.val);
                if(node.left != null) 
                    queue.offer(node.left);
                if(node.right != null) 
                    queue.offer(node.right);
                times--;
            }
            stack.push(list);
        }

    }
}