// Source : https://leetcode.com/problems/find-anagram-mappings/
// Author : Kyon Huang
// Date   : 2018-01-11

class Solution {
    public int[] anagramMappings(int[] A, int[] B) {
        Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();
        for(int i = 0; i < B.length; i++) {
            if(!map.containsKey(B[i]))
                map.put(B[i], new ArrayList<Integer>());
            map.get(B[i]).add(i);
        }
        int[] arr = new int[A.length];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = map.get(A[i]).get(0);
            map.get(A[i]).remove(0);
        }
        return arr;
    }
}