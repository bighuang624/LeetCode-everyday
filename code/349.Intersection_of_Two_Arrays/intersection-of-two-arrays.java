// Source : https://leetcode.com/problems/intersection-of-two-arrays/
// Author : Kyon Huang
// Date   : 2018-02-02

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<Integer>();
        HashSet<Integer> set2 = new HashSet<Integer>();
        for(int num : nums1)
            set1.add(num);
        for(int num : nums2)
            if(set1.contains(num))
                set2.add(num);
        int[] result = new int[set2.size()];
        int i = 0;
        for(int num : set2) 
            result[i++] = num;
        return result;
            
    }
}