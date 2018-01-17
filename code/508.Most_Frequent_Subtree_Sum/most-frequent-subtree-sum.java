// Source : https://leetcode.com/problems/most-frequent-subtree-sum/
// Author : Kyon Huang
// Date   : 2018-01-17

class Solution {
    Map<Integer, Integer> map;
    
    public int[] findFrequentTreeSum(TreeNode root) {
        if(root == null)
            return new int[0];
        map = new HashMap<Integer, Integer>();
        int maxTimes = 0;
        getSubTreeSum(root);
        List<Integer> list = new ArrayList<Integer>();
        for (Iterator iter = map.entrySet().iterator(); iter.hasNext();) {
            Map.Entry entry = (Map.Entry) iter.next();
            int key = (int)entry.getKey();
            int times = (int)entry.getValue();
            if(times > maxTimes) {
                list = new ArrayList<Integer>();
                maxTimes = times;
                list.add(key);
            }
            else if(times == maxTimes)
                list.add(key);
        }
        int[] result = new int[list.size()];
        for(int i = 0; i < list.size(); i++)
            result[i] = list.get(i);
        return result;
    }
    
    private int getSubTreeSum(TreeNode root) {
        int sum = root.val;
        if(root.left != null)
            sum += getSubTreeSum(root.left);
        if(root.right != null)
            sum += getSubTreeSum(root.right);
        map.put(sum, map.getOrDefault(sum, 0)+1);
        return sum;
    }
}
