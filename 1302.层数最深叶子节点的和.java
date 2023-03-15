/*
 * @lc app=leetcode.cn id=1302 lang=java
 *
 * [1302] 层数最深叶子节点的和
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    public int deepestLeavesSum(TreeNode root) {

        // mine
        // int sum = 0;

        // boolean userStack1 = true;
        // Stack<TreeNode> stack = new Stack<TreeNode>();
        // Stack<TreeNode> stack2 = new Stack<TreeNode>();

        // stack.push(root);

        // while(!stack.isEmpty() || !stack2.isEmpty()) {

        //     if (userStack1) {
        //         TreeNode node = stack.pop();
                
        //         if (node.left != null) {
        //             stack2.push(node.left);
        //         }
        //         if (node.right != null) {
        //             stack2.push(node.right);
        //         }
        //         if (stack.isEmpty() && !stack2.isEmpty()) {
        //             sum = 0;
        //             userStack1 = false;
        //         } else {
        //             sum += node.val;
        //         }
        //     } else {
        //         TreeNode node = stack2.pop();
        //         if (node.left != null) {
        //             stack.push(node.left);
        //         }
        //         if (node.right != null) {
        //             stack.push(node.right);
        //         }
        //         if (stack2.isEmpty() && !stack.isEmpty()) {
        //             sum = 0;
        //             userStack1 = true;
        //         } else {
        //             sum += node.val;
        //         }
        //     }
            
        // }
        // return sum;

        // my optimize

        // solution from Nick White
    }

}
// @lc code=end

