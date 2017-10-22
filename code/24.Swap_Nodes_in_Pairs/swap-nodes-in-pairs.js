// Source : https://leetcode.com/problems/swap-nodes-in-pairs/
// Author : Kyon Huang
// Date   : 2017-10-22

/**
 * Definition for singly-linked list.
 * function ListNode(val) {
 *     this.val = val;
 *     this.next = null;
 * }
 */
/**
 * @param {ListNode} head
 * @return {ListNode}
 */
var swapPairs = function(head) {
    if(!head || !head.next)
        return head;
    var n = head.next;
    head.next = swapPairs(n.next);
    n.next = head;
    return n;
};