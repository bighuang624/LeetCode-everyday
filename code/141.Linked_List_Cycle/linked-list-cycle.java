// Source : https://leetcode.com/problems/linked-list-cycle/
// Author : Kyon Huang
// Date   : 2017-12-16

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head != null) {
            ListNode walker = head;
            ListNode runner = head;
            while(runner.next != null && runner.next.next != null) {
                walker = walker.next;
                runner = runner.next.next;
                if(walker == runner)
                    return true;
            }
        }
        return false;
    }
}
