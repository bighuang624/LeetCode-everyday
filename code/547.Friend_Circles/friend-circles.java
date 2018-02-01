// Source : https://leetcode.com/problems/friend-circles/
// Author : Kyon Huang
// Date   : 2018-02-01

class Solution {
    public int findCircleNum(int[][] M) {
        boolean[] visited = new boolean[M.length];
        int cirnum = 0;
        for(int i = 0; i < M.length; i++)
            if(!visited[i]) {
                DFS(M, visited, i);
                cirnum++;
            }
        return cirnum;
    }
    
    private void DFS(int[][] M, boolean[] visited, int k) {
        for(int j = 0; j < M.length; j++)
            if(M[k][j] == 1 && !visited[j]) {
                visited[j] = true;
                DFS(M, visited, j);
            }
    }
}