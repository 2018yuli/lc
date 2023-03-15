/*
 * @lc app=leetcode.cn id=713 lang=java
 *
 * [713] 乘积小于 K 的子数组
 */

// @lc code=start
class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        // mine
        // List<Integer[]> fragement = new ArrayList<>();
        // int currentMul = 1;
        // int startIndex = 0;
        // for (int i = 0 ; i < nums.length ; i++) {
        //     currentMul *= nums[i];
        //     if (currentMul > k && startIndex < i) {
        //         fragement.add(new Integer[]{startIndex, i});
        //         while (currentMul > k) {
        //             currentMul = currentMul / nums[startIndex++];
        //         }
        //     }
        // }
        // get all the subsets of the fragements

        // solution from Nich White
        int ret = 0;
        int result = 1;
        int startIndex = 0;
        int endIndex = 0;

        while (endIndex < nums.length) {

            result *= nums[endIndex];
            
            if (result < k) {
                ret += (endIndex - startIndex);
            } else {
                while (result > k) {
                    result = result / nums[startIndex++];
                }
            }
            endIndex++;
        }
        return ret;
        
    }
}
// @lc code=end

