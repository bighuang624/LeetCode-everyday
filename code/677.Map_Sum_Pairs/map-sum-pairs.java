// Source : https://leetcode.com/problems/map-sum-pairs/
// Author : Kyon Huang
// Date   : 2017-12-28

class MapSum {

    private HashMap<String, Integer> map;
    /** Initialize your data structure here. */
    public MapSum() {
        map = new HashMap<String, Integer>();
    }
    
    public void insert(String key, int val) {
        map.put(key, val);
    }
    
    public int sum(String prefix) {
        int sum = 0;
        Set set = map.keySet();
  
        for(Iterator iter = set.iterator(); iter.hasNext();){
            String key = (String)iter.next();
            if(key.indexOf(prefix) == 0)
                sum += map.get(key);
        }
        return sum;
    }
}

/**
 * Your MapSum object will be instantiated and called as such:
 * MapSum obj = new MapSum();
 * obj.insert(key,val);
 * int param_2 = obj.sum(prefix);
 */