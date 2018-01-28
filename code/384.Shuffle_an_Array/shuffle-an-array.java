// Source : https://leetcode.com/problems/shuffle-an-array/
// Author : Kyon Huang
// Date   : 2018-01-28

class Solution {

    int[] nums;
    Random random;
    
    public Solution(int[] nums) {
        this.nums = nums;
        this.random = new Random();
    }
    
    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return nums;
    }
    
    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        int[] shuf = nums.clone();
        for(int i = 1; i < nums.length; i++) {
            int x = random.nextInt(i+1);
            int temp = shuf[i];
            shuf[i] = shuf[x];
            shuf[x] = temp;
        }
        return shuf;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */