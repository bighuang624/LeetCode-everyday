// Source : https://leetcode.com/problems/rotate-list/
// Author : Kyon Huang
// Date   : 2018-02-25

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int n) {
        if (head == null || head.next == null) 
            return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode fast = dummy, slow = dummy;

        int len;
        for (len = 0; fast.next != null; i++)
            fast = fast.next;
    
        for (int j = 0; j < len-n%len; j++)
            slow = slow.next;
    
        fast.next = dummy.next;
        dummy.next = slow.next;
        slow.next = null;
    
        return dummy.next;
    }
}