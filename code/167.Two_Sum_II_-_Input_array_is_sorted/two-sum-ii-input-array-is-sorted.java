// Source : https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
// Author : Kyon Huang
// Date   : 2017-10-28

// 第一思路，非最佳方案

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int index1 = 0;
        int index2 = 1;
        int len = numbers.length;
        while(index1 < len-1) {
            int expected = target - numbers[index1];
            int binarySearchResult = binarySearch(numbers, index1+1, len-1, expected);
            if(binarySearchResult != -1)
                return new int[]{index1+1, binarySearchResult+1};
            else
                index1++;
        }
        return new int[]{index1+1, index2+1};
    }
    
    private int binarySearch(int[] numbers, int start, int end, int expected) {
        
        int middle = (start + end) / 2;
        while(numbers[middle] != expected && start < end) {
            if(numbers[middle] > expected)
                end = middle-1;
            else
                start = middle+1;
            middle = (start + end) / 2;
        }
        
        if(numbers[middle] == expected)
            return middle;

        return -1;
    }
}
