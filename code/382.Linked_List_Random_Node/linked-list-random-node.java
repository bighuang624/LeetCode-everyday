// Source : https://leetcode.com/problems/linked-list-random-node/
// Author : Kyon Huang
// Date   : 2017-12-01

// 第一思路，非最佳解法

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    
    private ListNode head;
    private ArrayList<Integer> list;

    /** @param head The linked list's head.
        Note that the head is guaranteed to be not null, so it contains at least one node. */
    public Solution(ListNode head) {
        this.head = head;
        this.list = new ArrayList<>();
        for(ListNode cur = head; cur != null; cur = cur.next) {
            list.add(cur.val);
        }
    }
    
    /** Returns a random node's value. */
    public int getRandom() {
        int num = (int) (Math.random() * list.size());
        return list.get(num);
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */