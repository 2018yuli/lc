/*
 * @lc app=leetcode.cn id=713 lang=java
 *
 * [713] 乘积小于 K 的子数组
 */

// @lc code=start
class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        // mine
        List<Integer[]> fragement = new ArrayList<>();
        int currentMul = 1;
        int startIndex = 0;
        for (int i = 0 ; i < nums.length ; i++) {
            currentMul *= nums[i];
            if (currentMul > k && startIndex < i) {
                fragement.add(new Integer[]{startIndex, i});
                while (currentMul > k) {
                    currentMul = currentMul / nums[startIndex++];
                }
            }
        }
        // get all the subsets of the fragements
        
    }
}
// @lc code=end

