// Source : https://leetcode.com/problems/n-ary-tree-level-order-traversal/
// Author : Kyon Huang
// Date   : 2018-09-16

/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(root == null)
            return res;
        Queue<Node> queue = new LinkedList<Node>();
        queue.offer(root);
        while(!queue.isEmpty()) {
            List<Integer> curList = new ArrayList<Integer>();
            int size = queue.size();
            for(int i = 0; i < size; i++) {
                Node curNode = queue.poll();
                curList.add(curNode.val);
                for(Node child : curNode.children)
                    queue.offer(child);
            }
            res.add(curList);
        }
        return res;
    }
}