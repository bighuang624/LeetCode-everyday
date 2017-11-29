// Source : https://leetcode.com/problems/set-mismatch/
// Author : Kyon Huang
// Date   : 2017-11-29

class Solution {
    public int[] findErrorNums(int[] nums) {
        int len = nums.length;
        int[] arr = new int[len+1];
        for(int num : nums) 
            arr[num]++;
        int[] result = new int[2];
        for(int i = 1; i <= len; i++) {
            if(arr[i] == 0)
                result[1] = i;
            if(arr[i] == 2)
                result[0] = i;
            if(result[1] != 0 && result[0] != 0)
                break;
        }
        return result;
    }
}