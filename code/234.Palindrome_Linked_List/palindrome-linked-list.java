// Source : https://leetcode.com/problems/palindrome-linked-list/
// Author : Kyon Huang
// Date   : 2018-06-22

class Solution {
    public boolean isPalindrome(ListNode head) {
        int length = 0;
        for(ListNode cur = head; cur != null; cur = cur.next)
            length++;
        if(length <= 1)
            return true;
        if(length == 2)
            return head.val == head.next.val;
        if(length == 3)
            return head.val == head.next.next.val;
        ListNode prev = head;
        ListNode cur = head.next;
        ListNode next = cur.next;
        for(int i = 1; i < length/2; i++) {
            cur.next = prev;
            prev = cur;
            cur = next;
            next = cur.next;
        }
        if(length % 2 == 1)
            cur = cur.next;
        while(cur != null) {
            if(cur.val != prev.val)
                return false;
            prev = prev.next;
            cur = cur.next;
        }
        return true;
    }
}