// Source : https://leetcode.com/problems/perfect-squares/
// Author : Kyon Huang
// Date   : 2018-05-15

// 非最佳解法

class Solution {
    public int numSquares(int n) {
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 1; i * i <= n; i++)
            list.add(i * i);
        int[] results = new int[n+1];
        results[0] = 0;
        for(int i = 1; i <= n; i++) {
            int result = i;    // 最差的情况是 i 个 1 相加
            for(int num : list) {
                if(num > i)
                    break;
                result = Math.min(result, results[i - num] + 1);
            }
            results[i] = result;
        }
        return results[n];
    }
}