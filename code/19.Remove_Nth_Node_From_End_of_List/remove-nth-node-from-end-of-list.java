// Source : https://leetcode.com/problems/remove-nth-node-from-end-of-list/
// Author : Kyon Huang
// Date   : 2017-10-23

// 第一思路，非最佳方案

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode i = head;
        int len = 0;
        while(i != null) {
            len++;
            i = i.next;
        }
        
        int num = len - n;
        if(num == 0)
            return head.next;
        ListNode j = head;
        while(--num > 0)
            j = j.next;
        ListNode k = j.next;
        if(k == null || k.next == null)
            j.next = null;
        else 
            j.next = k.next;
        return head;
    }
}