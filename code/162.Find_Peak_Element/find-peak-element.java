// Source : https://leetcode.com/problems/find-peak-element/
// Author : Kyon Huang
// Date   : 2018-08-13

class Solution {
    public int findPeakElement(int[] num) {    
        return helper(num, 0, num.length-1);
    }

    public int helper(int[] num, int start, int end){
        if(start == end){
            return start;
        }
        else if(start+1 == end){
            if(num[start] > num[end]) 
                return start;
            return end;
        }
        else{
            int m = (end - start) / 2 + start;
            if(num[m] > num[m-1] && num[m] > num[m+1])
                return m;
            else if(num[m-1] > num[m] && num[m] > num[m+1])
                return helper(num, start, m-1);
            else
                return helper(num, m+1, end);

        }
    }
}
