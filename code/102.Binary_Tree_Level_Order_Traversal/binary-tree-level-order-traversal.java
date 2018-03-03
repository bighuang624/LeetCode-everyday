// Source : https://leetcode.com/problems/binary-tree-level-order-traversal/
// Author : Kyon Huang
// Date   : 2018-03-03

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        if(root != null)
            queue.offer(root);
        while(!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> list = new ArrayList<Integer>();
            for(; size > 0; size--) {
                TreeNode node = queue.poll();
                list.add(node.val);
                if(node.left != null)
                    queue.offer(node.left);
                if(node.right != null)
                    queue.offer(node.right);
            }
            result.add(list);
        }
        return result;
    }
}