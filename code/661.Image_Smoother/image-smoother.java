// Source : https://leetcode.com/problems/image-smoother/
// Author : Kyon Huang
// Date   : 2018-09-17

class Solution {
    public int[][] imageSmoother(int[][] M) {
        int[][] result = new int[M.length][M[0].length];
        
        for(int i = 0; i < M.length; i++)
            for(int j = 0; j < M[0].length; j++) {
                int n = 1;
                result[i][j] += M[i][j];
                if(i != 0) {
                    result[i][j] += M[i-1][j];
                    n++;
                } 
                if(j != 0) {
                    result[i][j] += M[i][j-1];
                    n++;
                }
                if(i != M.length-1) {
                    result[i][j] += M[i+1][j];
                    n++;
                }
                if(j != M[0].length-1) {
                    result[i][j] += M[i][j+1];
                    n++;
                }
                if(i != 0 && j != 0) {
                    result[i][j] += M[i-1][j-1];
                    n++;
                }
                if(i != 0 && j != M[0].length-1) {
                    result[i][j] += M[i-1][j+1];
                    n++;
                }
                if(i != M.length-1 && j != 0) {
                    result[i][j] += M[i+1][j-1];
                    n++;
                }
                if(i != M.length-1 && j != M[0].length-1) {
                    result[i][j] += M[i+1][j+1];
                    n++;
                }
                result[i][j] /= n;
            }
        return result;
    }
}