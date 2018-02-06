// Source : https://leetcode.com/problems/relative-ranks/
// Author : Kyon Huang
// Date   : 2018-02-06

class Solution {
    public String[] findRelativeRanks(int[] nums) {
        int[] arr = nums.clone();
        Arrays.sort(arr);
        String[] result = new String[nums.length];
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++)
            map.put(arr[i], nums.length-i);
        for(int i = 0; i < nums.length; i++) {
            int ranking = map.get(nums[i]);
            if(ranking == 1)
                result[i] = "Gold Medal";
            else if(ranking == 2)
                result[i] = "Silver Medal";
            else if(ranking == 3)
                result[i] = "Bronze Medal";
            else
                result[i] = ""+ranking;
        }
        return result;
    }
}