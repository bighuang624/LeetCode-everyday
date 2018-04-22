// Source : https://leetcode.com/problems/find-the-duplicate-number/
// Author : Kyon Huang
// Date   : 2018-04-22

class Solution {
    public int findDuplicate(int[] nums) {
        int slow = 0, fast = 0;
        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        }while(slow != fast);
        slow = 0;
        while(slow != fast){
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
}