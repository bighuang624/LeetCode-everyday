// Source : https://leetcode.com/problems/reverse-linked-list/
// Author : Kyon Huang
// Date   : 2017-12-26

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null)
            return null;
        if(head.next == null)
            return head;
        ListNode first = head;
        ListNode second = head.next;
        head.next = null;
        while(second.next != null) {
            ListNode temp = second.next;
            second.next = first;
            first = second;
            second = temp;
        }
        second.next = first;
        return second;
    }
}