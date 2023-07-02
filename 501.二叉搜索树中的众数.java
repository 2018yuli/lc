/*
 * @lc app=leetcode.cn id=501 lang=java
 *
 * [501] 二叉搜索树中的众数
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
    public int[] findMode(TreeNode root) {
        // mine
        // List<Integer> result = new ArrayList<>();
        // Map<Integer, Integer> counts = new HashMap<>();
        // // BFS
        // Stack<TreeNode> stack = new Stack<>();
        // stack.push(root);
        // while (!stack.isEmpty()) {
        //     TreeNode node = stack.pop();
        //     int count = counts.getOrDefault(node.val, 0);
        //     counts.put(node.val, ++count);
        //     if (node.left != null) stack.push(node.left);
        //     if (node.right != null) stack.push(node.right);
        // }
        // // get the most large element.
        // int maxNum = -1;
        // for (Integer key : counts.keySet()) {
        //     int cnt = counts.get(key);
        //     if (cnt > maxNum) {
        //         result.clear();
        //         result.add(key);
        //         maxNum = cnt;
        //     }
        //     else if (cnt == maxNum) {
        //         result.add(key);
        //     }
        // }
        // int[] ret = new int[result.size()];
        // for (int i = 0 ; i < ret.length ; i++) {
        //     ret[i] = result.get(i);
        // }
        // return ret;

        // mine2
        // Find the mode in a single pass
        // Use Morris Inorder Traversal

        List<Integer> result = new ArrayList<>();
        List<TreeNode> morris = new LinkedList<>();
        TreeNode current = root;
        TreeNode predecessor = null;
        
        // Morris 算法
        while (current != null) {

            // current节点不为空，且有左孩子，于是找到节 current 左子树中的最右侧节点
            if (current.left == null) {
                morris.add(current);
                current = current.right;
            } else {
                predecessor = current.left;
                while (predecessor.right != null && predecessor.right != current) {
                    predecessor = predecessor.right;
                }
                // Current节点移动到左孩子节点，并删除父节点的左指针，使其指向为null
                predecessor.right = current;
                TreeNode nextLeft = current.left;
                current.left = null;
                current = nextLeft;
                morris.add(current);
            }
        }
        // 遍历
        int currentVal = -1;
        int currentCount = 0;
        int maxCount = 0;

        for (TreeNode curr : morris) {
            
            if (currentVal == curr.val) {
                currentCount++;
            } else {
                currentVal = curr.val;
                currentCount = 1;
            }

            if (currentCount == maxCount) {
                result.add(currentVal);
            }
            if (currentCount > maxCount) {
                maxCount = currentCount;
                result.clear();
                result.add(currentVal);
            }
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
// @lc code=end

