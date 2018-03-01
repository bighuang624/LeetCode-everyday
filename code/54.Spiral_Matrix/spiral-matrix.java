// Source : https://leetcode.com/problems/spiral-matrix/
// Author : Kyon Huang
// Date   : 2018-03-01

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<Integer>();
        if (matrix.length == 0)
            return res;
        
        int rowBegin = 0;
        int rowEnd = matrix.length-1;
        int colBegin = 0;
        int colEnd = matrix[0].length - 1;
        
        while (rowBegin <= rowEnd && colBegin <= colEnd)
            for (int j = colBegin; j <= colEnd; j++)
                res.add(matrix[rowBegin][j]);
            rowBegin++;
            for (int j = rowBegin; j <= rowEnd; j++) 
                res.add(matrix[j][colEnd]);
            colEnd--;
            if (rowBegin <= rowEnd) 
                for (int j = colEnd; j >= colBegin; j--) 
                    res.add(matrix[rowEnd][j]);
            rowEnd--;
            if (colBegin <= colEnd)
                for (int j = rowEnd; j >= rowBegin; j--)
                    res.add(matrix[j][colBegin]);
            colBegin++;
        }
        
        return res;
    }
}