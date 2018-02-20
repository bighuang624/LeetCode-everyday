// Source : https://leetcode.com/problems/partition-labels/
// Author : Kyon Huang
// Date   : 2018-02-19

class Solution {
    public List<Integer> partitionLabels(String S) {
        if(S == null || S.length() == 0)
            return null;
        int[] arr = new int[26];
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < S.length(); i++)
            arr[S.charAt(i) - 'a'] = i;
        int tail = 0;
        int head = 0;
        for(int i = 0; i < S.length(); i++) {
            tail = Math.max(tail, arr[S.charAt(i) - 'a']);
            if(tail == i) {
                list.add(tail - head + 1);
                head = tail + 1;
            }
        }
        return list;
    }
}