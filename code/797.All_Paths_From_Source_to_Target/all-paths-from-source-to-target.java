// Source : https://leetcode.com/problems/all-paths-from-source-to-target/
// Author : Kyon Huang
// Date   : 2018-04-19

class Solution {
    private int N;
    private List<List<Integer>> result;
    
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        N = graph.length;
        result = new ArrayList<List<Integer>>();
        DFS(0, new ArrayList<Integer>(), graph);
        return result;
    }
    
    private void DFS(int point, List<Integer> list, int[][] graph) {
        List<Integer> newList = new ArrayList<Integer>();
        newList.addAll(list);
        newList.add(point);
        if(point == N-1)
            result.add(newList);
        else
            for(int num : graph[point])
                DFS(num, newList, graph);
    }
}