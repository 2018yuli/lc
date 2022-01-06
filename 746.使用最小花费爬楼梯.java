/*
 * @lc app=leetcode.cn id=746 lang=java
 *
 * [746] 使用最小花费爬楼梯
 */

// @lc code=start
class Solution {
    public int minCostClimbingStairs(int[] cost) {
        // mine
        // int length = cost.length;
        // int[] minCost = new int[length];
        // minCost[length - 1] = cost[length - 1];
        // minCost[length - 2] = cost[length - 2];
        
        // for (int i = length - 3 ; i >= 0 ; i--) {
        //     minCost[i] = cost[i] + Math.min(minCost[i + 1], minCost[i + 2]);
        // }
        // return Math.min(minCost[0], minCost[1]);

        // Solution from Nick White
        // for (int i = 2 ; i < cost.length ; i++) {
        //     cost[i] += Math.min(cost[i - 1], cost[i - 2]);
        // }
        // return Math.min(cost[cost.length - 1], cost[cost.length - 2]);

        // Solution from Nick White
        int step1 = 0;
        int step2 = 0;
        for (int i = cost.length - 1 ; i >= 0 ; i--) {
            int currentStep = cost[i] + Math.min(step1, step2);
            step1 = step2;
            step2 = currentStep;
        }
        return Math.min(step1, step2);
    }
}
// @lc code=end

