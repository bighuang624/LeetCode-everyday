// Source : https://leetcode.com/problems/remove-linked-list-elements/
// Author : Kyon Huang
// Date   : 2017-10-31

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode newHead = new ListNode(0);
        newHead.next = head;
        head = newHead;
        while(head != null && head.next != null) {
            while(head.next != null && head.next.val == val) {
                head.next = head.next.next;
            }
            head = head.next;
        }
        
        return newHead.next;
    }
}