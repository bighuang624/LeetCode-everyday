// Source : https://leetcode.com/problems/linked-list-components/
// Author : Kyon Huang
// Date   : 2018-07-16

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    
    Set<Integer> set = new HashSet<Integer>();
    
    public int numComponents(ListNode head, int[] G) {
        int result = 0;
        for(int v : G)
            set.add(v);
        while(head != null) { 
            while(head != null && !set.contains(head.val))
                head = head.next;
            if(head != null && set.contains(head.val)) {
                while(head != null && set.contains(head.val))
                    head = head.next;
                result++;
            }
        }
        return result;
    }
}