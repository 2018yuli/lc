/*
 * @lc app=leetcode.cn id=203 lang=java
 *
 * [203] 移除链表元素
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        // mine
        // ListNode prev = new ListNode();
        // ListNode newHead = prev;
        // prev.next = head;
        // ListNode current = head;
        // while (current != null) {
        //     if (current.val == val) {
        //         current = current.next;
        //         prev.next = current;
        //     } else {
        //         prev = current;
        //         current = current.next;
        //     }
        // }
        // return newHead.next;

        // Solution from Nick White
        while (head != null && head.val == val) {
            head = head.next;
        }

        ListNode currentNode = head;
        while (currentNode != null && currentNode.next != null) {
            if (currentNode.next.val  == val) {
                currentNode.next = currentNode.next.next;
            } else {
                currentNode = currentNode.next;
            }
        }
        return head;
    }
}
// @lc code=end

