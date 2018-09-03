// Source : https://leetcode.com/problems/two-sum-iv-input-is-a-bst/
// Author : Kyon Huang
// Date   : 2018-09-03

class Solution {
    public boolean findTarget(TreeNode root, int k) {
        if(root == null)
            return false;
        HashSet<Integer> set = new HashSet<Integer>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        while(!queue.isEmpty()) {
            int size = queue.size();
            for(int i = 0; i < size; i++) {
                TreeNode cur = queue.poll();
                if(set.contains(k - cur.val))
                    return true;
                set.add(cur.val);
                if(cur.left != null)
                    queue.offer(cur.left);
                if(cur.right != null)
                    queue.offer(cur.right);
            }
        }
        return false;
    }
}