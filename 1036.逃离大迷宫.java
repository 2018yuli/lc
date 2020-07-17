/*
 * @lc app=leetcode.cn id=1036 lang=java
 *
 * [1036] 逃离大迷宫
 */

// @lc code=start
class Solution {
    public boolean isEscapePossible(int[][] blocked, int[] source, int[] target) {
        boolean isPossible = false;
        // ///////////////////
        // 个人解题
        // 20200717
        // 1、如果source[0] > target[0] 或者 source[1] > target[1]
        //      则进行矩阵变换，使得source 在 target 的左下角
        // 2、剔除不在 source -> target 方阵内的 blocked
        // 3、计算砖块的联通性，保存联通的，计算方阵内是否有通路
        // 4、将方阵扩大一倍，计算是否有通路
        // 5、重复第 4 步，直到达到边界
        // ///////////////////
        
        // 图的联通性暂时超纲，先放着
        // 根据鸽笼原理，如果砖块小于棋盘，则一定有解
        if (blocked.length < target[0] - source[0]
            && blocked.length < target[1] - source[1]) {
                isPossible = true;
        }
        else {

        }

        return isPossible;
    }
}
// @lc code=end

