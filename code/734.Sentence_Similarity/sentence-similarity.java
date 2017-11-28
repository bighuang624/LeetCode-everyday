// Source : https://leetcode.com/problems/sentence-similarity/
// Author : Kyon Huang
// Date   : 2017-11-28

class Solution {
    public boolean areSentencesSimilar(String[] words1, String[] words2, String[][] pairs) {
        int len = words1.length;
        if(len != words2.length)
            return false;

        HashMap<String, HashSet> map = new HashMap();
        for(String[] pair : pairs) {
            if(!map.containsKey(pair[0]))
                map.put(pair[0], new HashSet());
            map.get(pair[0]).add(pair[1]);

            if(!map.containsKey(pair[1]))
                map.put(pair[1], new HashSet());
            map.get(pair[1]).add(pair[0]);
        }

        for(int i = 0; i < len; i++) {
            if(!words1[i].equals(words2[i]) && !(map.containsKey(words1[i]) && map.get(words1[i]).contains(words2[i])))
                return false;
        }
        return true;
        
    }
}