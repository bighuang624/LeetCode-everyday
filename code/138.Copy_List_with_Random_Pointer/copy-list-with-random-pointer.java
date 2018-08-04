// Source : https://leetcode.com/problems/copy-list-with-random-pointer/
// Author : Kyon Huang
// Date   : 2018-08-04

public class Solution {
    public RandomListNode copyRandomList(RandomListNode head) {
        if(head == null)
            return null;
        Map<RandomListNode, RandomListNode> nodeMap = new HashMap<RandomListNode, RandomListNode>();
        for(RandomListNode cur = head; cur != null; cur = cur.next) 
            nodeMap.put(cur, new RandomListNode(cur.label));
        for(RandomListNode cur = head; cur != null; cur = cur.next) {
            nodeMap.get(cur).next = nodeMap.get(cur.next);
            nodeMap.get(cur).random = nodeMap.get(cur.random);
        }           
        return nodeMap.get(head);
    }
}