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
  
    public String tree2str(TreeNode t) {
        StringBuilder sb = new StringBuilder("");
        getTree2str(t, sb);
        
        return sb.toString();
    }
    
    private void getTree2str(TreeNode t, StringBuilder sb) {
        if(t != null) {
            sb.append(t.val);
            if(t.left != null) {
                sb.append("(");
                getTree2str(t.left, sb);
                sb.append(")");
            }
            if(t.right != null) {
                if(t.left == null) {
                    sb.append("()");
                }
                sb.append("(");
                getTree2str(t.right, sb);
                sb.append(")");
            }
        }
    }
}