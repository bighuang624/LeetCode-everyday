// Source : https://leetcode.com/problems/odd-even-linked-list/
// Author : Kyon Huang
// Date   : 2018-02-04

class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head == null)
            return null;
        ListNode evenHead = head.next;
        ListNode odd = head;
        ListNode even = evenHead;
        while(even != null && odd != null) {
            odd.next = even.next;
            if(odd.next == null)
                break;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }
}