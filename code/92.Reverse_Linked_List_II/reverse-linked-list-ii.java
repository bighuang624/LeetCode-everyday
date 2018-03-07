// Source : https://leetcode.com/problems/reverse-linked-list-ii/
// Author : Kyon Huang
// Date   : 2018-03-07

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(head == null || m == n)
            return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;
        
        for(int i = 0; i < m-1; i++)
            pre = pre.next;
        ListNode start = pre.next;
        ListNode then = start.next;
        
        for(int i = 0; i < n-m; i++) {
            start.next = then.next;
            then.next = pre.next;
            pre.next = then;
            then = start.next;
        }
        
        return dummy.next;
    }
}