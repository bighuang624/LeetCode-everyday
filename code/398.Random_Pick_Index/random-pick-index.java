// Source : https://leetcode.com/problems/random-pick-index/
// Author : Kyon Huang
// Date   : 2018-04-21

class Solution {

    int[] nums;
    Random random;
    
    public Solution(int[] nums) {
        this.nums = nums;
        random = new Random();
    }
    
    public int pick(int target) {
        int result = -1;
        int n = 0;
        for(int i = 0; i < nums.length; i++) {
            if(target != nums[i])
                continue;
            if(random.nextInt(++n) == 0)
                result = i;
        }
        return result;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int param_1 = obj.pick(target);
 */