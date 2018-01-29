// Source : https://leetcode.com/problems/implement-magic-dictionary/
// Author : Kyon Huang
// Date   : 2018-01-29

class MagicDictionary {

    HashMap<Integer, ArrayList<String>> map;
    /** Initialize your data structure here. */
    public MagicDictionary() {
        map = new HashMap<Integer, ArrayList<String>>();
    }
    
    /** Build a dictionary through a list of words */
    public void buildDict(String[] dict) {
        for(String str : dict) {
            if(!map.containsKey(str.length())) 
                map.put(str.length(), new ArrayList<String>());
            map.get(str.length()).add(str);
        }
    }
    
    /** Returns if there is any word in the trie that equals to the given word after modifying exactly one character */
    public boolean search(String word) {
        if(map.containsKey(word.length())) {
            for(String str : map.get(word.length())) {
                int modified = 0;
                for(int i = 0; i < word.length(); i++) {
                    if(word.charAt(i) != str.charAt(i))
                        modified++;
                    if(modified > 1)
                        break;
                }
                if(modified == 1)
                    return true;
            }
        }
        return false;
    }
}

/**
 * Your MagicDictionary object will be instantiated and called as such:
 * MagicDictionary obj = new MagicDictionary();
 * obj.buildDict(dict);
 * boolean param_2 = obj.search(word);
 */