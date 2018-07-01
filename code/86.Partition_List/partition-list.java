// Source : https://leetcode.com/problems/partition-list/
// Author : Kyon Huang
// Date   : 2018-07-01

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode moreHead = new ListNode(0);
        ListNode lessHead = new ListNode(0);
        ListNode moreCur = moreHead;
        ListNode lessCur = lessHead;
        
        for(; head != null; head = head.next) {
            if(head.val < x) {
                lessCur.next = head;
                lessCur = head;
            }
            else {
                moreCur.next = head;
                moreCur = head;
            }
        }
        moreCur.next = null;   // Important!
        lessCur.next = moreHead.next;
        return lessHead.next;
    }
}