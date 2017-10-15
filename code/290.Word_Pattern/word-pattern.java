// Source : https://leetcode.com/problems/word-pattern/
// Author : Kyon Huang
// Date   : 2017-10-15

class Solution {
    public boolean wordPattern(String pattern, String str) {
        char[] patternArr = pattern.toCharArray();
        String[] strArr = str.split(" ");
        if(patternArr.length != strArr.length)
            return false;
        
        Map map = new HashMap();
        for(int i = 0; i < patternArr.length; i++) {
            if(!map.containsKey(patternArr[i])) {
                if(map.containsValue(strArr[i]))
                    return false;
                else
                    map.put(patternArr[i], strArr[i]);
            }
            else 
                if(!map.get(patternArr[i]).equals(strArr[i]))
                    return false;
        }
        return true;
    }
}