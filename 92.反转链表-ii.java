/*
 * @lc app=leetcode.cn id=92 lang=java
 *
 * [92] 反转链表 II
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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        // mine
        // if (head == null || head.next == null) return head;
        // int position = 1;
        // ListNode currentNode = head;
        // // 被 left right 切分成 3 份，第一份
        // ListNode l1Tail = head;
        // // 被 left right 切分成 3 份，被反转部分
        // ListNode l2Head = head;
        // ListNode l2Trail = null;
        // // 被 left right 切分成 3 份，第三份
        // ListNode l3Head = head;
        // while (position < left - 1) {
        //     position++;
        //     currentNode = currentNode.next;
        // }
        // l1Tail = currentNode;
        // while (position < left) {
        // 	position++;
        // 	currentNode = currentNode.next;
        // }
        // l2Head = currentNode;
        // while (position < right) {
        //     position++;
        //     currentNode = currentNode.next;
        // }
        // l2Trail = currentNode;
        // l3Head = currentNode.next;
        
        // l2Trail.next = null;
        // ListNode l2HeadReverse = reverse(l2Head);
        
        // if (l1Tail == l2Head)
        // 	head = l2HeadReverse;
        // else
        // 	l1Tail.next = l2HeadReverse;
        // l2Head.next = l3Head;
        // return head;

        // Solution from Nick White
        if (head == null) return null;

        ListNode prev = null;
        ListNode currentNode = head;

        while (left > 1) {
            prev = currentNode;
            currentNode = currentNode.next;
            left--;
            right--;
        }

        ListNode connection = prev;
        ListNode tail = currentNode;

        while (right > 0) {
            ListNode nextNode = currentNode.next;
            currentNode.next = prev;
            prev = currentNode;
            currentNode = nextNode;
            right--;
        }
        // 连接
        if (connection != null) {
            connection.next = prev;
        } else {
            head = prev;
        }
        tail.next = currentNode;
        return head;
    }

    // private ListNode reverse(ListNode head) {
    //     if (head == null || head.next == null) return head;
    //     ListNode currentNode = head;
    //     ListNode prev = null;
    //     while (currentNode != null) {
    //         ListNode next = currentNode.next;
    //         currentNode.next = prev;
    //         prev = currentNode;
    //         currentNode = next;
    //     }
    //     return prev;
    // }
}
// @lc code=end

