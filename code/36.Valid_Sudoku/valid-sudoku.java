// Source : https://leetcode.com/problems/valid-sudoku/
// Author : Kyon Huang
// Date   : 2018-10-09

class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i = 0; i < 9; i++) {
            HashSet<Character> rows = new HashSet<Character>();
            HashSet<Character> columns = new HashSet<Character>();
            HashSet<Character> cube = new HashSet<Character>();
            
            for(int j = 0; j < 9; j++) {
                if(board[i][j] != '.' && !rows.add(board[i][j]))
                    return false;
                if(board[j][i] != '.' && !columns.add(board[j][i]))
                    return false;
                
                int Row = 3 * (i / 3);
                int Column = 3 * (i % 3);
                if(board[Row + j/3][Column + j%3] != '.' && !cube.add(board[Row + j/3][Column + j%3]))
                    return false;
            }
            
        }
        return true;
    }
}