// Source : https://leetcode.com/problems/word-break/
// Author : Kyon Huang
// Date   : 2018-08-05

class Solution {

    public boolean wordBreak(String s, List<String> wordDict) {
        HashSet<String> set = new HashSet<String>();
        set.addAll(wordDict);
        
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;
        for(int i = 1; i <= s.length(); i++) {
            for(int j = i-1; j >= 0; j--) {
                dp[i] = dp[j] && set.contains(s.substring(j, i));
                if(dp[i])
                    break;
            }
        }
        return dp[s.length()];
    }
}