// Source : https://leetcode.com/problems/subdomain-visit-count/
// Author : Kyon Huang
// Date   : 2018-05-03

class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        List<String> result = new ArrayList<String>();
        Map<String, Integer> map = new HashMap<String, Integer>();
        for(String str : cpdomains) {
            String[] strs = str.split(" ");
            int count = Integer.parseInt(strs[0]);
            String domain = strs[1];
            map.put(domain, map.getOrDefault(domain, 0) + count);
            while(domain.indexOf(".") != -1) {
                domain = domain.substring(domain.indexOf(".")+1, domain.length());
                map.put(domain, map.getOrDefault(domain, 0) + count);
            }
        }
        for(String dom : map.keySet()) {
            String s = map.get(dom) + " " + dom;
            result.add(s);
        }
        return result;
    }
}