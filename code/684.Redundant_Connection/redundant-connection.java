// Source : https://leetcode.com/problems/redundant-connection/
// Author : Kyon Huang
// Date   : 2018-04-23

class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        int[] parent = new int[edges.length+1];
        for (int i = 0; i < parent.length; i++) 
            parent[i] = i;
        
        for (int[] edge: edges){
            int f = edge[0], t = edge[1];
            if (find(parent, f) == find(parent, t))   // 说明此时已经成环，与环有关的边不会再出现
                return edge;
            else parent[find(parent, f)] = find(parent, t);
        }
        
        return new int[2];
    }
    
    private int find(int[] parent, int f) {
        if (f != parent[f])
          parent[f] = find(parent, parent[f]);  
        return parent[f];
    }
}