/*
 * @lc app=leetcode.cn id=198 lang=java
 *
 * [198] 打家劫舍
 */

// @lc code=start
class Solution {
    public int rob(int[] nums) {
        // mine
        // int evenSum = 0;
        // int oddSum = 0;
        // for (int i = 0 ; i < nums.length ; i++) {
        //     if (i % 2 == 0) evenSum += nums[i];
        //     else oddSum += nums[i];
        // }
        // return Math.max(evenSum, oddSum);

        // mine2
        // 问题类型：动态规划
        // [100, 1, 1, 100, 201, 100, 3, 1, 2, 100, 1, 20, 20, 1, 20, 10, 20, 1, 20]
        // [100, x, 1,  x , 201,  x , 3, 1, x, 100, x, 20, 20, 1, 20, 10, 20, 1, 20]
        // [100, 1, 1,  x , 201,  x , 3, 1, x, 100, x, 20, 20, 1, 20, 10, 20, 1, 20]
        // 相邻的两个未知冲突，相邻会移动 nums[x] > nums[x - 1] + nums[x + 1] 选 x
        // nums[x - 1] + nums[x + 1] > nums[x -2] + nums[x] + nums[x + 2]，剔除 x
        // 首选解决覆盖问题
        // for (int i = 0 ; i < nums.length ; i++) {
        //     int before = i == 0 ? 0 : nums[i - 1];
        //     int after = i == nums.length - 1 ? 0 : nums[i + 1];
        //     if (nums[i] > before + after) {
        //         if (i > 0) nums[i - 1] = -1;
        //         if (i < nums.length - 1) nums[i + 1] = -1;
        //     }
        // }
        // for (int i = 0 ; i < nums.length ; i++) {
        //     int _before = i <= 1 ? 0 : nums[i - 2];
        //     int before = i == 0 ? 0 : nums[i - 1];
        //     int after = i == nums.length - 1 ? 0 : nums[i + 1];
        //     int _after = i >= nums.length - 2 ? 0 : nums[i + 2];
        //     if (nums[i] + _before + _after < before + after) {
        //         nums[i] = -1;
        //     }
        // }
        // 然后使用贪心算法计算最大值
        //     int evenSum = 0;
        //     int oddSum = 0;
            
        //     for (int i = 0 ; i < nums.length ; i++) {
        //         if (nums[i] == -1) continue;
        //         evenSum += nums[i];
        //         i++;
        //         if (i < nums.length)
        //             oddSum += nums[i];
        //     }
        //     return Math.max(evenSum, oddSum);
        // }


        // 1. 首先我们可以把所有的可能组成一棵树
        //      在算法中，我们总是能把我们遇到的问题，解释成一颗这样或者那样的树
        //      这就是为什么我们呢需要迭代，因为问题本身可以使用 lg(n)x + mx 来表示
        // 2. 
        if (nums.length == 0) return 0;
        
        int dp[] = new int[nums.length + 1];
        dp[0] = 0;
        dp[1] = nums[0];

        for (int i = 1 ; i < nums.length ; i++) {
            dp[i + 1] = Math.max(dp[i], dp[i - 1] + nums[i]);
        }

        return dp[nums.length];
    }
}
// @lc code=end

