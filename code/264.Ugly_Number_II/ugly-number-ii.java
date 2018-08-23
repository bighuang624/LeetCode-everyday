// Source : https://leetcode.com/problems/ugly-number-ii/
// Author : Kyon Huang
// Date   : 2018-08-23

class Solution {
    public int nthUglyNumber(int n) {
        if(n <= 0)
            return 0;
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        int a = 0, b = 0, c = 0;
        while(list.size() < n) {
            int min = Math.min(list.get(a) * 2, Math.min(list.get(b) * 3, list.get(c) * 5));
            list.add(min);
            if(min == list.get(a) * 2)
                a++;
            if(min == list.get(b) * 3)
                b++;
            if(min == list.get(c) * 5)
                c++;
        }
        return list.get(n-1);
    }
}