// Source : https://leetcode.com/problems/candy/
// Author : Kyon Huang
// Date   : 2017-12-29

class Solution {
    public int candy(int[] ratings) {
        int len = ratings.length;
        int[] result = new int[len];
        int sum = 0;
        result[0] = 1;
        
        for(int i = 1; i < len; i++)
            if(ratings[i] > ratings[i-1])
                result[i] = result[i-1] + 1;
            else
                result[i] = 1;
        
        for(int i = len-1; i > 0; i--)
            if(ratings[i] < ratings[i-1])
                result[i-1] = Math.max(result[i] + 1, result[i-1]);
        
        for(int s : result)
            sum += s;
        return sum;
    }
}