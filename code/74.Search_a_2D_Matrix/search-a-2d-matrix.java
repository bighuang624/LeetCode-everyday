// Source : https://leetcode.com/problems/search-a-2d-matrix/
// Author : Kyon Huang
// Date   : 2018-08-03

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 0 || matrix[0].length == 0)
            return false;
        int m = matrix.length, n = matrix[0].length;
        int low = 0, high = m * n - 1;
        while(low <= high) {
            int mid = (high - low) / 2 + low, curVal = matrix[mid / n][mid % n];
            if(curVal == target)
                return true;
            else if(curVal < target)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return false;
    }
}