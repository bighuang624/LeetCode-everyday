// Source : https://leetcode.com/problems/n-ary-tree-preorder-traversal/
// Author : Kyon Huang
// Date   : 2018-09-11

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
    public List<Integer> preorder(Node root) {
        List<Integer> res = new ArrayList<Integer>();
        if(root == null)
            return res;
        Stack<Node> stack = new Stack<Node>();
        stack.push(root);
        while(!stack.isEmpty()) {
            Node cur = stack.pop();
            res.add(cur.val);
            for(int i = cur.children.size()-1; i >= 0; i--)
                stack.push(cur.children.get(i));
        }
        return res;
    }
}