/*
 * @lc app=leetcode.cn id=775 lang=java
 *
 * [775] 全局倒置与局部倒置
 */

// @lc code=start
class Solution {
    public boolean isIdealPermutation(int[] nums) {
        // mine
        // 1 10 100 50 200 60
        // if (nums.length <= 2) return true;
        // int maxPre = Integer.MIN_VALUE;

        // for (int i = 1 ; i < nums.length - 1 ; i++) {
        //     maxPre = Math.max(maxPre, nums[i - 1]);
        //     if (maxPre > nums[i + 1]) {
        //         return false;
        //     }
        // }

        // return true;

        // Solution from Nick White
        int max = -1;
        for (int i = 0 ; i < nums.length - 2; i++) {
            max = Math.max(nums[i], max);
            if (max > nums[i + 2]) return false;
        }
        return true;
        
    }
}
// @lc code=end

