// Source : https://leetcode.com/problems/delete-node-in-a-linked-list/
// Author : Kyon Huang
// Date   : 2017-12-26

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}