// Source : https://leetcode.com/problems/subsets/
// Author : Kyon Huang
// Date   : 2018-05-18

class Solution {
    
    ArrayList<List<Integer>> result = new ArrayList<List<Integer>>();
    
    public List<List<Integer>> subsets(int[] nums) {
        BFS(nums, 0, new ArrayList<Integer>());
        return result;
    }
    
    private void BFS(int[] nums, int i, ArrayList<Integer> list) {
        ArrayList<Integer> a = new ArrayList<Integer>(list);
        ArrayList<Integer> b = new ArrayList<Integer>(list);
        a.add(nums[i]);
        if(i == nums.length-1) {
            result.add(a);
            result.add(b);
        }
        else {
            BFS(nums, i+1, a);
            BFS(nums, i+1, b);
        }
    }
}