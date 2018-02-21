// Source : https://leetcode.com/problems/split-linked-list-in-parts/
// Author : Kyon Huang
// Date   : 2018-02-21

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode[] splitListToParts(ListNode root, int k) {
        int len = 0;
        for(ListNode cal = root; cal != null; cal = cal.next)
            len++;
        ListNode[] result = new ListNode[k];
        int size = len/k;
        int largerPartNum = len - size * k;
        ListNode head = root;
        if(root != null) {
            for(int i = 0; i < k; i++) {
                result[i] = head;
                for(int j = size + (i < largerPartNum ? 1 : 0); j > 1; j--) 
                    head = head.next;
                if(head.next == null)
                    break;
                ListNode temp = head.next;
                head.next = null;
                head = temp;
            }
        }
        return result;
    }
}