/*
 * @lc app=leetcode.cn id=83 lang=java
 *
 * [83] 删除排序链表中的重复元素
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
    public ListNode deleteDuplicates(ListNode head) {
        // mine
        // ListNode currentNode = head;
        
        // while (currentNode != null && currentNode.next != null) {
        //     if (currentNode.val == currentNode.next.val) {
        //         currentNode.next = currentNode.next.next;
        //     } else {
        //         currentNode = currentNode.next;
        //     }
        // }

        // return head;

        // Solution from Nick White
        ListNode currentNode = head;
        
        while (currentNode != null && currentNode.next != null) {
            if (currentNode.val == currentNode.next.val) {
                currentNode.next = currentNode.next.next;
            } else {
                currentNode = currentNode.next;
            }
        }

        return head;

    }
}
// @lc code=end

