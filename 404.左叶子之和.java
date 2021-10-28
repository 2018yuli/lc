/*
 * @lc app=leetcode.cn id=404 lang=java
 *
 * [404] 左叶子之和
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
    public int sumOfLeftLeaves(TreeNode root) {
        // Solution from Nick White
        if (root == null) return 0;
        int sumOfLeftLeave = 0;
        
        if (root.left != null) {
            if (root.left.left == null && root.left.right == null) {
                sumOfLeftLeave += root.left.val;
            } else {
                sumOfLeftLeave += sumOfLeftLeaves(root.left);
            }
        }

        if (root.right != null) {
            if (root.right.left != null || root.right.right != null) {
                sumOfLeftLeave += sumOfLeftLeaves(root.right);
            }
        }
        return sumOfLeftLeave;
    }
}
// @lc code=end

