/*
 * @lc app=leetcode.cn id=559 lang=java
 *
 * [559] N 叉树的最大深度
 */

// @lc code=start
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public int maxDepth(Node root) {
        
        // mine
        // if (root == null) return 0;
        // return maxDepth(root, 0);

        // solution from Nick White
        if (root == null) return 0;
        Queue<Node> queue = new LinkedList<Node>();
        queue.offer(root);

        int depth = 0;

        while (!queue.isEmpty()) {

            int size = queue.size();
            for (int i = 0 ; i < size ; i++) {
                Node currentNode = queue.poll();
                for (Node child: currentNode.children) {
                    queue.offer(child);
                }
            }
            depth++;
        }
        return depth++;
    }

    // private int maxDepth(Node root, int depth) {
       
    //    depth = depth + 1;
    //    int maxDepth = depth;
    //     for (Node child : root.children) {
    //         depth = Math.max(depth, maxDepth(child, maxDepth));
    //     }
    //     return depth;
    // }

}
// @lc code=end

