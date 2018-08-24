// Source : https://leetcode.com/problems/word-search/
// Author : Kyon Huang
// Date   : 2018-08-24

class Solution {
    public boolean exist(char[][] board, String word) {
        for(int i = 0; i < board.length; i++) 
            for(int j = 0; j < board[0].length; j++) 
                if(board[i][j] == word.charAt(0) && DFShelper(board, word, i, j, 0))
                    return true;

        return false;
    }
    
    private boolean DFShelper(char[][] board, String word, int i, int j, int index) {
        index++;
        if(index == word.length())
            return true;
        board[i][j] = '.';
        boolean res = false;
        if(i < board.length-1 && board[i+1][j] == word.charAt(index))
            res = res || DFShelper(board, word, i+1, j, index);
        if(j < board[0].length-1 && board[i][j+1] == word.charAt(index))
            res = res || DFShelper(board, word, i, j+1, index);
        if(i > 0 && board[i-1][j] == word.charAt(index))
            res = res || DFShelper(board, word, i-1, j, index);
        if(j > 0 && board[i][j-1] == word.charAt(index))
            res = res || DFShelper(board, word, i, j-1, index);
        board[i][j] = word.charAt(index-1);
        return res;
    }
}