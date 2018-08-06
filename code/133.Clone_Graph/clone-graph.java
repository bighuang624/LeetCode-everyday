// Source : https://leetcode.com/problems/clone-graph/
// Author : Kyon Huang
// Date   : 2018-08-06

/**
 * Definition for undirected graph.
 * class UndirectedGraphNode {
 *     int label;
 *     List<UndirectedGraphNode> neighbors;
 *     UndirectedGraphNode(int x) { label = x; neighbors = new ArrayList<UndirectedGraphNode>(); }
 * };
 */
public class Solution {
    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        if(node == null)
            return null;
        HashMap<Integer, UndirectedGraphNode> map = new HashMap<>();
        DFSmakeNodes(map, node);
        DFSmakeConnection(map, node);
        return map.get(node.label);
    }
    
    private void DFSmakeNodes(HashMap<Integer, UndirectedGraphNode> map, UndirectedGraphNode node) {
        UndirectedGraphNode start = new UndirectedGraphNode(node.label);
        map.put(node.label, start);
        for(UndirectedGraphNode neighbor : node.neighbors) 
            if(!map.containsKey(neighbor.label))
                DFSmakeNodes(map, neighbor);
    }
    
    private void DFSmakeConnection(HashMap<Integer, UndirectedGraphNode> map, UndirectedGraphNode node) {
        UndirectedGraphNode start = map.get(node.label);
        if(start.neighbors.size() == 0) {
            for(UndirectedGraphNode neighbor : node.neighbors) {
                start.neighbors.add(map.get(neighbor.label));
                DFSmakeConnection(map, neighbor);
            }
        }
    }
}