// Source : https://leetcode.com/problems/score-after-flipping-matrix/
// Author : Kyon Huang
// Date   : 2018-07-08

class Solution {
    public int matrixScore(int[][] A) {
        int sum = 0;
        // 处理每一行开头，使其为 1
        for(int[] arr : A)
            if(arr[0] == 0)
                for(int i = 0; i < arr.length; i++)
                    arr[i] = 1 - arr[i];
        int height = A.length;
        int width = A[0].length;
        // 处理每一列，使每一列的 1 尽可能多
        for(int i = 0; i < width; i++) {
            int sumOf1 = 0;
            for(int j = 0; j < height; j++)
                if(A[j][i] == 1)
                    sumOf1++;
            if(sumOf1 < height - sumOf1)
                sumOf1 = height - sumOf1;
            sum += sumOf1 * Math.pow(2, width-1-i);
        }

        return sum;
    }
}