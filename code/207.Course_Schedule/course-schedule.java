// Source : https://leetcode.com/problems/course-schedule/
// Author : Kyon Huang
// Date   : 2018-08-15

class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        // 核心思想：不能成环
        ArrayList[] graph = new ArrayList[numCourses];
        for(int i = 0; i < numCourses; i++)
            graph[i] = new ArrayList<Integer>();
        boolean[] onstack = new boolean[numCourses];
        for(int[] pair : prerequisites) 
            graph[pair[1]].add(pair[0]);
        for(int key = 0; key < numCourses; key++)
            if(!DFShelper(graph, key, onstack))
                return false;
        return true;
    }
    
    private boolean DFShelper(ArrayList[] graph, int node, boolean[] onstack) {
        if(onstack[node])
            return false;
        else
            onstack[node] = true;
        for(int i = 0; i < graph[node].size(); i++)
            if(!DFShelper(graph, (int)graph[node].get(i), onstack))
                return false;
        onstack[node] = false;
        return true;
    }
}
