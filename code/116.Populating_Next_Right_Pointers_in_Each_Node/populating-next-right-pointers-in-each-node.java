// Source : https://leetcode.com/problems/populating-next-right-pointers-in-each-node/
// Author : Kyon Huang
// Date   : 2018-03-04

/**
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void connect(TreeLinkNode root) {
        if(root == null)
            return;
        if(root.left != null) {
            root.left.next = root.right;
            for(TreeLinkNode node1 = root.left; node1.right != null; node1 = node1.right)
                node1.right.next = node1.next.left;
        }

        connect(root.left);
        connect(root.right);
    }
}