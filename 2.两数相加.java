/*
 * @lc app=leetcode.cn id=2 lang=java
 *
 * [2] 两数相加
 */

// @lc code=start
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
        // //
        // ListNode rstList = new ListNode(0);
        // ListNode ln = rstList; 
        // ///////////////////////////////
        // 普通解法
        // int num1 = l1 == null ? 0 : l1.val;
        // int num2 = l2 == null ? 0 : l2.val;
        // boolean numAdd = false;
        // // first addition
        // ln.val = (num1 + num2 + (numAdd ? 1 : 0)) % 10;
        // numAdd = num1 + num2 >= 10;
        // l1 = l1 == null ? null : l1.next;
        // l2 = l2 == null ? null : l2.next;
        // num1 = l1 == null ? 0 : l1.val;
        // num2 = l2 == null ? 0 : l2.val;
        // // TODO 应该把链表的遍历逻辑分离出来
        // while (num1 != 0 || num2 != 0 || numAdd || l1 != null || l2 != null){
        //     // calulate
        //     ln.next = new ListNode(0);
        //     ln = ln.next;
        //     ln.val = (num1 + num2 + (numAdd ? 1 : 0)) % 10;
        //     numAdd = num1 + num2 + (numAdd ? 1 : 0) >= 10;
        //     // recusive condition
        //     l1 = l1 == null ? null : l1.next;
        //     l2 = l2 == null ? null : l2.next;
        //     num1 = l1 == null ? 0 : l1.val;
        //     num2 = l2 == null ? 0 : l2.val;
        // }
        // return rstList;

        // 1、处理链表遍历逻辑
        // 2、单个数位运算
        // 2.1、处理数字
        // 2.2、处理进位
        // /////////////////////////////////////
        // 尝试2：只有当类型的Collection需要暴露给外部接口时，才需要实现迭代模式
        // ListNode node = nextNode(l1, l2);
        // ListNode ln = new ListNode();
        // nodex.next = ln;
        // l1 = next(l1);
        // l2 = next(l2);
        // while (l1 != null || l2 != null){
        //     ln = nextNode(ln, l1, l2);
        //     l1 = next(l1);
        //     l2 = next(l2);
        // }

        // 官网解题
        // 1、查找迭代步骤
        // 2、通过构造头指针使得第一次迭代符合迭代公式
        // ///////////////////////////////
        ListNode headDump = new ListNode(0);
        ListNode current = headDump;
        int carry = 0;
        while (l1 != null || l2 != null){
            int num1 = l1 == null ? 0 : l1.val;
            int num2 = l2 == null ? 0 : l2.val;
            int sum = num1 + num2 + carry;
            carry = sum / 10;
            current.next = new ListNode(sum % 10);
            // recusive
            current = current.next;
            if (l1 != null)
                l1 = l1.next;
            if (l2 != null)
                l2 = l2.next;
        }
        // 处理尾数
        if (carry != 0)
            current.next = new ListNode(1);
        return headDump.next;
    }

    /**
     * 链表遍历
     * @param ln
     * @return -1: 没有下一个元素 n:下一个元素的值 
     */
    // public ListNode next( ListNode ln ) {
    //     if (ln == null || ln.next == null)
    //         return null;
    //     else
    //         return ln.next;
    // }

    /**
     * ??
     * @param ln
     * @return
     */
    // public int val( ListNode ln) {
    //     if (ln == null)
    //         return 0;
    //     else
    //         return ln.val;
    // }

    /**
     * ??
     * @param ln
     * @param l1
     * @param l2
     * @return
     */
    // public ListNode nextNode( ListNode ln, ListNode l1, ListNode l2) {
    //     int rst = (val(l1) + val(l2)) % 10;
    //     ln.next = new ListNode(rst);
    //     return ln.next;
    // }

}
// @lc code=end

