// Source : https://leetcode.com/problems/add-two-numbers/
// Author : Kyon Huang
// Date   : 2017-10-19

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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        int v = l1.val + l2.val;
        ListNode startNode;
        if(v % 10 != v) {
            v = v % 10;
            startNode = new ListNode(v);
            getNextNode(l1, l2, startNode, true);
        }
        else {
            startNode = new ListNode(v);
            getNextNode(l1, l2, startNode, false);
        }
        
        return startNode;
    }
    
    private void getNextNode(ListNode l1, ListNode l2, ListNode prev, boolean addOne) {
        if(l1.next != null && l2.next != null) {
            l1 = l1.next;
            l2 = l2.next;
            
            int v = l1.val + l2.val + (addOne ? 1 : 0);
            if(v % 10 != v) {
                v = v % 10;
                ListNode node = new ListNode(v);
                prev.next = node;
                getNextNode(l1, l2, node, true);
            }
            else {
                ListNode node = new ListNode(v);
                prev.next = node;
                getNextNode(l1, l2, node, false);
            }
        }
        else if(l1.next == null && l2.next != null) {
            prev.next = l2.next;
            if(addOne) {
                prev = prev.next;
                while(++prev.val >= 10) {
                    prev.val %= 10;
                    if(prev.next != null)
                        prev = prev.next;
                    else {
                        prev.next = new ListNode(0);
                        prev = prev.next;
                    } 
                }
            }
        }
        else if(l2.next == null && l1.next != null) {
            prev.next = l1.next;
            if(addOne) {
                prev = prev.next;
                while(++prev.val >= 10) {
                    prev.val %= 10;
                    if(prev.next != null)
                        prev = prev.next;
                    else {
                        prev.next = new ListNode(0);
                        prev = prev.next;
                    } 
                }
            }
        }
        else if(l2.next == null && l1.next == null && addOne) {
            prev.next = new ListNode(1);
        }
        
    }
}