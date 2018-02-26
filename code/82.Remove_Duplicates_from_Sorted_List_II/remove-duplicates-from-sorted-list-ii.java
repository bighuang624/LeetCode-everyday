// Source : https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/
// Author : Kyon Huang
// Date   : 2018-02-26

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
        ListNode newHead = new ListNode(0);
        newHead.next = head;
        ListNode pre = newHead;
        while(pre.next != null) {
            ListNode cur = pre.next;
            int curValue = cur.val;
            boolean changed = false;
            while(cur.next != null && cur.next.val == curValue)
                cur = cur.next;
            if(pre.next == cur) {
                pre = cur;
                cur = cur.next;
            } else
                pre.next = cur.next;
        }
        return newHead.next;
    }
}