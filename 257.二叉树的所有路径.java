/*
 * @lc app=leetcode.cn id=257 lang=java
 *
 * [257] 二叉树的所有路径
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
    public List<String> binaryTreePaths(TreeNode root) {
        // mine
        // List<String> result = new ArrayList<>();
        // travel(root, "", result);
        // return result;

        // mine2  BFS 遍历，太复杂
        // List<String> result = new ArrayList<>();
        // Queue<TreeNode> path = new LinkedList<>();
        // Stack<TreeNode> stack = new Stack<>();
        // stack.push(root);

        // while (!stack.isEmpty()) {
        //     // 判断是否另一个 level

        // }        
        // return result;

        // Solution from Nick White
        List<String> result = new ArrayList<>();
        if (root == null) return result;

        String currentPath = Integer.toString(root.val);
        if (root.left == null && root.right == null) {
            result.add(currentPath);
        }
        if (root.left != null) dfs(root.left, currentPath, result);
        if (root.right != null) dfs(root.right, currentPath, result);

        return result;
    
    }

    public void dfs(TreeNode node, String currentPath, List<String> result) {
        currentPath += ("->" + node.val);

        if (node.left == null && node.right == null) {
            result.add(currentPath);
        }
        if (node.left != null) dfs(node.left, currentPath, result);
        if (node.right != null) dfs(node.right, currentPath, result);
    }

    // public void travel(TreeNode node, String parent, List<String> result) {
    //     String path = ("".equals(parent) ? "" : (parent + "->")) + node.val;
    //     if (node.left != null) {
    //         travel(node.left, path, result);
    //     }
    //     if (node.right != null) {
    //         travel(node.right, path, result);
    //     }
    //     if (node.left == null && node.right == null) {
    //         result.add(path);
    //     }
    // }
}
// @lc code=end

