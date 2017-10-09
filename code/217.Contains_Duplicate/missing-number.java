// Source : https://leetcode.com/problems/contains-duplicate/
// Author : Kyon Huang
// Date   : 2017-10-08

class Solution {
    public boolean containsDuplicate(int[] nums) {

        final Set<Integer> distinct = new HashSet<Integer>();
        for(int num : nums) {
            if(distinct.contains(num)) {
                return true;
            }
            distinct.add(num);
        }
        return false;
    }
}