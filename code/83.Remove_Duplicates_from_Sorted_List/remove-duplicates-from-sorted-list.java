// Source : https://leetcode.com/problems/remove-duplicates-from-sorted-list/
// Author : Kyon Huang
// Date   : 2017-10-25

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode newHead = head;
        ListNode prev = head;
        int memory;
        if(head == null)
            return head;
        else
            memory = head.val;
        while(head.next != null) {
            head = head.next;
            if(head.val == memory) {
                prev.next = head.next;
            }
            else {
                memory = head.val;
                prev = prev.next;
            }
        }
        
        return newHead;
    }
}