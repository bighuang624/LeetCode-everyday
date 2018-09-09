// Source : https://leetcode.com/problems/middle-of-the-linked-list/
// Author : Kyon Huang
// Date   : 2018-09-09

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode quick = head, slow = head;
        while(quick != null && quick.next != null) {
            slow = slow.next;
            quick = quick.next.next;
        }
        return slow;
    }
}