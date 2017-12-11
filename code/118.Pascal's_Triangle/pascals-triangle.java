// Source : https://leetcode.com/problems/pascals-triangle/
// Author : Kyon Huang
// Date   : 2017-12-11

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if(numRows >= 1) {
            List<Integer> list1 = new ArrayList<>();
            list1.add(1);
            result.add(list1);
        }
        if(numRows >= 2) {
            List<Integer> list2 = new ArrayList<>();
            list2.add(1);
            list2.add(1);
            result.add(list2);
        }
        if(numRows >= 3) {
            for(int i = 2; i < numRows; i++) {
                List<Integer> list = new ArrayList<>();
                list.add(1);
                List<Integer> preList = result.get(i-1);
                for(int j = 0; j < i-1; j++) {
                    list.add(preList.get(j) + preList.get(j+1));
                }
                list.add(1);
                result.add(list);
            }
        }
        
        return result;
    }
}