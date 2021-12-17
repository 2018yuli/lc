/*
 * @lc app=leetcode.cn id=19 lang=java
 *
 * [19] 删除链表的倒数第 N 个结点
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // mine
        // if (head == null || n == 0) return head;
        // ListNode slow = head;
        // ListNode fast = head;
        // while (fast != null && n > 0) {
        //     fast = fast.next;
        //     n--;
        // }
        // while (fast != null && fast.next != null) {
        //     fast = fast.next;
        //     slow = slow.next;
        // }
        // if (fast != null)
        //     slow.next = slow.next.next;
        // else
        //     return head.next;
        // return head;

        // Solution from Nick White
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;

        ListNode slow = dummyHead;
        ListNode fast = dummyHead;

        for (int i = 0 ; i < n + 1 ; i++) {
            fast = fast.next;
        }

        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;

        return dummyHead.next;
    }
}
// @lc code=end

