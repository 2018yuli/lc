/*
 * @lc app=leetcode.cn id=1019 lang=java
 *
 * [1019] 链表中的下一个更大节点
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
    public int[] nextLargerNodes(ListNode head) {
        // mine
        // Stack<Integer> stack = new Stack<Integer>();
        // Stack<Integer> indexStack = new Stack<Integer>();

        // ListNode current = head;
        // int size = 1;
        // while (current.next != null) {
        //     size++;
        //     current = current.next;
        // }

        // int[] result = new int[size];
        // Arrays.fill(result, 0);

        // current = head;
        // int i = 0;
        // while (current != null) {
        //     while (!stack.isEmpty() && stack.peek() < current.val) {
        //         stack.pop();
        //         int index = indexStack.pop();
        //         result[index] = current.val;
        //     }
        //     stack.push(current.val);
        //     indexStack.push(i++);
        //     current = current.next;
        // }
        // return result;

        // Solution from Nick White
        // 不使用 ListNode + stack + index 而使用 ArrayList + stack 提升代码可读性
        ArrayList<Integer> nodeVals = new ArrayList<Integer>();

        ListNode currentNode = head;
        while (currentNode != null) {
            nodeVals.add(currentNode.val);
            currentNode = currentNode.next;
        }

        int[] outputArr = new int[nodeVals.size()];
        Stack<Integer> stack = new Stack<Integer>();
        for (int i = 0 ; i < outputArr.length ; i++) {
            while (!stack.isEmpty() && nodeVals.get(stack.peek()) < nodeVals.get(i)) {
                outputArr[stack.pop()] = nodeVals.get(i);
            }
            stack.push(i);
        }
        return outputArr;
    }
}
// @lc code=end

