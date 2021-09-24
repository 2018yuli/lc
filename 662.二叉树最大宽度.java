import java.util.HashMap;
import java.util.Map;

import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode.cn id=662 lang=java
 *
 * [662] 二叉树最大宽度
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
    // solution from Nick White
    int maxWidth = 0;
    Map<Integer, Integer> leftmostPosition = new HashMap<Integer, Integer>();
    public int widthOfBinaryTree(TreeNode root) {
        getWidth(root, 0, 0);
        return maxWidth;
    }

    private void getWidth(TreeNode root, int depth, int position) {
        if (root == null) return;
        // 树型的计数排序法，给最左边的节点赋值序号
        leftmostPosition.computeIfAbsent(depth, x -> position);
        maxWidth = Math.max(maxWidth, position - leftmostPosition.get(depth) + 1);
        getWidth(root.left, depth + 1, position * 2);
        getWidth(root.right, depth + 1, position * 2 + 1);
    }
}
// @lc code=end

