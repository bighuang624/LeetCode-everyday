// Source : https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/
// Author : Kyon Huang
// Date   : 2018-03-03

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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        DFS(root, result, 0);
        return result;
    }
    
    private void DFS(TreeNode root, List<List<Integer>> result, int depth) {
        if(root != null) {
            if(result.size() <= depth)
                result.add(new ArrayList<Integer>());
            List<Integer> list = result.get(depth);
            if(depth % 2 != 0)
                list.add(0, root.val);
            else
                list.add(list.size(), root.val);
            
            DFS(root.left, result, depth+1);
            DFS(root.right, result, depth+1);
        }
    }
}