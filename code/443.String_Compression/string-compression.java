// Source : https://leetcode.com/problems/string-compression/
// Author : Kyon Huang
// Date   : 2017-12-18

class Solution {
    public int compress(char[] chars) {
        char cur = chars[0];
        char ch = '\0';
        int times = 0;
        int i = 0;
        
        for(int j = 0; j < chars.length; j++) {
            ch = chars[j];
            if(ch == cur)
                times++;
            else {
                chars[i++] = cur;
                if(times > 1) {
                    char[] timesChars = String.valueOf(times).toCharArray();
                    for(int k = 0; k < timesChars.length; k++)
                        chars[i++] = timesChars[k];
                }
                cur = ch;
                times = 1;
            }
        }
        chars[i++] = cur;
        if(times > 1) {
            char[] timesChars = String.valueOf(times).toCharArray();
            for(int k = 0; k < timesChars.length; k++)
                chars[i++] = timesChars[k];
        }
        
        return i;

    }
}