import java.util.LinkedList;
import java.util.Queue;

import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode.cn id=958 lang=java
 *
 * [958] 二叉树的完全性检验
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
    public boolean isCompleteTree(TreeNode root) {
        // solution from Nick White
        boolean end = false;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        while(!queue.isEmpty()) {
            TreeNode currentNode = queue.poll();
            if (currentNode == null) {
                end = true;
            }else {
                if (end) return false;
                queue.offer(currentNode.left);
                queue.offer(currentNode.right);
            }
        }
        return true;
    }
}
// @lc code=end

