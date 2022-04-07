/*
 * @lc app=leetcode.cn id=124 lang=java
 *
 * [124] 二叉树中的最大路径和
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
    int maxPath;
    public int maxPathSum(TreeNode root) {
        // mine
        // // 树 + 最长路径问题
        // // 先从任意一点P出发，找离它最远的点x，再从点x出发，找离它最远的点y，x到y的距离就是树的直径

        // Map<TreeNode, Integer> distance2Root = new HashMap<TreeNode, Integer>();
        // Map<TreeNode, TreeNode> parentNodes = new HashMap<TreeNode, TreeNode>();
        // // dfs
        // Stack<TreeNode> stack = new Stack<TreeNode>();
        // // 获得对 root 的最远 node 为 x
        // // 通过 distance2Root 和 parentNode 和  x 节点与 y 节点的距离公式
        // // 获得离 x 最远的 y
        // // 返回 x 和 y 之间的距离
        // distance2Root.put(root, root.val);
        // stack.push(root);
        // while (!stack.isEmpty()) {
        //     TreeNode current = stack.pop();
        //     if (current.left != null) {
        //         stack.push(current.left);
        //         parentNodes.put(current.left, current);
        //         distance2Root.put(current.left, current.left.val + distance2Root.get(current));
        //     }
        //     if (current.right != null) {
        //         stack.push(current.right);
        //         parentNodes.put(current.right, current);
        //         distance2Root.put(current.right, current.right.val + distance2Root.get(current));
        //     }
        // }
        // TreeNode node1 = root;
        // int maxDistance = Integer.MIN_VALUE;
        // for (Map.Entry<TreeNode, Integer> entry : distance2Root.entrySet()) {
        //     if (entry.getKey() != root && entry.getValue() > maxDistance) {
        //         maxDistance = entry.getValue();
        //         node1 = entry.getKey();
        //     }
        // }

        // int result = Integer.MIN_VALUE;
        // for (Map.Entry<TreeNode, Integer> entry : distance2Root.entrySet()) {
        //     result = Math.max(result, distanceBetweenNodes(distance2Root, parentNodes, node1, entry.getKey()));
        // }
        // return result;

        // Solution from Nick White
        maxPath = Integer.MIN_VALUE;
        pathSum(root);
        return maxPath;
    }

    public int pathSum(TreeNode node) {
        if (node == null) return 0;
        int left = Math.max(0, pathSum(node.left));
        int right = Math.max(0, pathSum(node.right));
        maxPath = Math.max(maxPath, left + right + node.val);
        // used for the (left + right + node.val)
        return Math.max(left, right) + node.val;
    }

    /**
     * x 节点与 y 节点的距离 = root2x + root2y - 2 * rootParent
     * @param {*} distance2Root 节点与 root 之间的距离
     * @param {*} parentNodes   节点树的逆向关系
     * @param {*} nodex
     * @param {*} nodey
     */
    // public int distanceBetweenNodes(Map<TreeNode, Integer> distance2Root, Map<TreeNode, TreeNode> parentNodes, TreeNode nodex, TreeNode nodey) {
    //     // do
    //     if (nodex == nodey) return nodex.val;
    //     Set<TreeNode> parentSet = new HashSet<TreeNode>();
    //     TreeNode current = nodex;
    //     while (parentNodes.get(current) != null) {
    //         current = parentNodes.get(current);
    //         parentSet.add(current);
    //     }
    //     int root2x = distance2Root.get(nodex);
    //     int root2y = distance2Root.get(nodey);
    //     int rootParent = 0;
    //     current = nodey;
    //     while (current != null) {
    //         if (parentSet.contains(current) || current == nodex) {
    //             if (parentNodes.get(current) != null) {
    //                 rootParent = distance2Root.get(parentNodes.get(current));
    //             }
    //             break;
    //         }
    //         current = parentNodes.get(current);
    //     }
    //     int result = root2x + root2y - 2 * rootParent - current.val;
    //     return Math.max(result, nodey.val);
    // }
}
// @lc code=end

