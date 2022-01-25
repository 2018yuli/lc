/*
 * @lc app=leetcode.cn id=160 lang=java
 *
 * [160] 相交链表
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // mine
        // int lengthA = 0;
        // int lengthB = 0;
        // ListNode currentNode = headA;
        // while (currentNode != null) {
        //     lengthA++;
        //     currentNode = currentNode.next;
        // }
        // currentNode = headB;
        //  while (currentNode != null) {
        //     lengthB++;
        //     currentNode = currentNode.next;
        // }
        // // 对齐链表
        // int steps = Math.abs(lengthA - lengthB);
        // if (lengthA > lengthB) {
        //     while (steps > 0) {
        //         headA = headA.next;
        //         steps--;
        //     }
        // } else {
        //     while (steps > 0) {
        //         headB = headB.next;
        //         steps--;
        //     }
        // }
        // // 查找相交的起始节点
        // ListNode result = null;
        // while (headA != null) {
        //     if (headA.val == headB.val && result == null) {
        //         result = headA;
        //     }
        //     if (headA.val != headB.val) {
        //         result = null;
        //     }

        //     headA = headA.next;
        //     headB = headB.next;
        // }
        // return result;

        // Solution from Nick White
        if (headA == null || headB == null) return null;

        ListNode aPointer = headA;
        ListNode bPointer = headB;

        while (aPointer != bPointer) {
            
            if (aPointer == null) {
                aPointer = headB;
            } else {
                aPointer = aPointer.next;
            }

            if (bPointer == null) {
                bPointer = headA;
            } else {
                bPointer = bPointer.next;
            }
            
        }

        return aPointer;
    }
}
// @lc code=end

