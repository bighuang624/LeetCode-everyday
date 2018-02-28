// Source : https://leetcode.com/problems/permutations/
// Author : Kyon Huang
// Date   : 2018-02-28

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        LinkedList<List<Integer>> result = new LinkedList<List<Integer>>();
        result.add(new ArrayList<Integer>());
        for(int n : nums) {
            int size = result.size();
            for(; size > 0; size--) {
                List<Integer> list = result.pollFirst();
                for(int i = 0; i <= list.size(); i++) {
                    List<Integer> newList = new ArrayList<Integer>(list);
                    newList.add(i, n);
                    result.add(newList);
                }
            }
        }
        return result;
    }
}