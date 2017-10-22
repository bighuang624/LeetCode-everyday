// Source : https://leetcode.com/problems/swap-nodes-in-pairs/
// Author : Kyon Huang
// Date   : 2017-10-22

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
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode i = head;
        ListNode j = head.next;
        ListNode newHead = head;
        ListNode k = head;
        if(head.next != null)
            newHead = head.next;
        while(i != null && j != null) {
            i.next = j.next;
            j.next = i;
            if(i.next != null) {
                i = i.next;
                if(i.next != null)
                    j = i.next;
                else
                    j = null;
                if(j != null) {
                    k.next = j;
                    k = i;
                }
            } 
            else
                i = null;
            
        }
        
        return newHead;
    }
}