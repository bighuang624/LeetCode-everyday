// Source : https://leetcode.com/problems/intersection-of-two-linked-lists/
// Author : Kyon Huang
// Date   : 2018-06-12

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null)
            return null;
        ListNode A = headA, B = headB;
        int Alen = 1, Blen = 1;
        for(; A.next != null; A = A.next)
            Alen++;
        for(; B.next != null; B = B.next)
            Blen++;
        if(A != B)
            return null;
        if(Alen > Blen) 
            for(int i = 0; i < Alen - Blen; i++)
                headA = headA.next;
        else
            for(int i = 0; i < Blen - Alen; i++)
                headB = headB.next;
        for(;headA != null; headA = headA.next, headB = headB.next) 
            if(headA == headB)
                return headA;
        
        return null;
    }
}