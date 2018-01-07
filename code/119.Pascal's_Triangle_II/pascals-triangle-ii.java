// Source : https://leetcode.com/problems/pascals-triangle-ii/
// Author : Kyon Huang
// Date   : 2018-01-07

// 非最佳方案

class Solution {
    public List<Integer> getRow(int rowIndex) {
        if(rowIndex < 0)
            return new ArrayList<Integer>();
        if(rowIndex == 0) {
            List<Integer> alist = new ArrayList<Integer>();
            alist.add(1);
            return alist;
        }
        List<Integer> pre = new ArrayList<Integer>();
        List<Integer> cur = new ArrayList<Integer>();
        pre.add(1);
        pre.add(1);
        for(int i = 2; i <= rowIndex; i++) {
            cur.add(1);
            for(int j = 0; j < i-1; j++) {
                cur.add(pre.get(j) + pre.get(j+1));
            }
            cur.add(1);
            pre = cur;
            cur = new ArrayList<Integer>();
        }
        return pre;
    }
}