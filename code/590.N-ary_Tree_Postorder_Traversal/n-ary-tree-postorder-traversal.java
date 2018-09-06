// Source : https://leetcode.com/problems/n-ary-tree-postorder-traversal/
// Author : Kyon Huang
// Date   : 2018-09-06

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
    List<Integer> res = new ArrayList<Integer>();
    public List<Integer> postorder(Node root) {
        if(root == null)
            return res;
        for(Node child : root.children)
            postorder(child);
        res.add(root.val);
        return res;
    }
}