// Source : https://leetcode.com/problems/sort-characters-by-frequency/
// Author : Kyon Huang
// Date   : 2018-01-03

public class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for(char ch : s.toCharArray()) {
            if(!map.containsKey(ch))
                map.put(ch, 1);
            else
                map.put(ch, map.get(ch)+1);
        }
        List<Character>[] list = new List[s.length()+1];
        for(Character ch : map.keySet()) {
            int times = map.get(ch);
            if(list[times] == null)
                list[times] = new ArrayList<Character>();
            list[times].add(ch);
        }
        StringBuilder sb = new StringBuilder();
        for(int i = s.length(); i >= 0; i--)
            if(list[i] != null)
                for(int j = 0; j < list[i].size(); j++)
                    for(int k = 0; k < i; k++)
                        sb.append(list[i].get(j));
        return sb.toString();
    }
}