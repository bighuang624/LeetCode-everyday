// Source : https://leetcode.com/problems/optimal-division/
// Author : Kyon Huang
// Date   : 2017-12-17

class Solution {
    public String optimalDivision(int[] nums) {
        int len = nums.length;
        if(len == 1)
            return String.valueOf(nums[0]);
        else if(len == 2)
            return nums[0] + "/" + nums[1];
        else {
            StringBuffer str = new StringBuffer();
            for(int i = 0; i < len-1; i++) {
                if(i == 1)
                    str.append("(");
                str.append(nums[i]+"/");
            }
            str.append(nums[len-1] + ")");
            return str.toString();
        }
    }
}