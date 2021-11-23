/*
 * @lc app=leetcode.cn id=121 lang=java
 *
 * [121] 买卖股票的最佳时机
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
        // 从 一个 串 中查找两个点（购入点、卖出点）
        // Solution From Nick White
        int minVal = Integer.MAX_VALUE;
        int maxProfi = 0;

        for (int i = 0 ; i < prices.length ; i++) {
            if (prices[i] < minVal) {
                minVal = prices[i];
            }else if (prices[i] - minVal > maxProfi) {
                maxProfi = prices[i] - minVal;
            }
        }
        return maxProfi;
    }
}
// @lc code=end

