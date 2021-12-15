/*
 * @lc app=leetcode.cn id=143 lang=java
 *
 * [143] 重排链表
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
    public void reorderList(ListNode head) {
        // mine
        // ListNode result = head;
        // ListNode slow = head;
        // ListNode fast = head;
        // Stack<ListNode> stack = new Stack<ListNode>();
        
        // while (fast.next != null && fast.next.next != null) {
        //     slow = slow.next;
        //     fast = fast.next.next;
        // }
        // while (slow.next != null) {
        // 	slow = slow.next;
        //     stack.push(slow);
        // }
        // //
        // ListNode next = head.next;
        // while (!stack.isEmpty()) {
        // 	result.next = stack.pop();
        // 	result = result.next;
        // 	if (next != result) {
        // 		result.next = next;
        // 		next = next.next;
        // 		result = result.next;
        // 	}
        // }
        // result.next = null;

        // Solution From Nick White
        if (head == null || head.next == null) return;
        // head of first half
        ListNode l1 = head;
        // head of second half
        ListNode slow = head;

        // tail of second half
        ListNode fast = head;
        // tail of first half
        ListNode prev = null;

        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        
        prev.next = null;

        ListNode l2 = reverse(slow);

        merge(l1, l2);
    }

    private ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode currentNode = head;

        while (currentNode != null) {
            ListNode nextNode = currentNode.next;
            currentNode.next = prev;
            prev = currentNode;
            currentNode = nextNode;
        }
        return prev;
    }

    private void merge(ListNode l1, ListNode l2) {
        while (l1 != null) {
            ListNode l1Next = l1.next;
            ListNode l2Next = l2.next;

            l1.next = l2;
            if (l1Next == null) break;
            l2.next = l1Next;

            l1 = l1Next;
            l2 = l2Next;
        }
    }
}
// @lc code=end

