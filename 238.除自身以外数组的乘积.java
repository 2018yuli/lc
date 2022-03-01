/*
 * @lc app=leetcode.cn id=238 lang=java
 *
 * [238] 除自身以外数组的乘积
 */

// @lc code=start
class Solution {
    public int[] productExceptSelf(int[] nums) {
        // mine
        // int[] result = new int[nums.length];
        // Arrays.fill(result, 1);
        // int i = 0;
        // int j = nums.length - 1;
        // while (i < nums.length) {
        //     for (int k = i ; k < j ; k++) {
        //         result[j % nums.length] *= nums[k % nums.length];
        //     }
        //     i++;
        //     j++;
        // }
        // return result;

        // Solution from Nick White
        // int n = nums.length;
        // int[] leftProducts = new int[n];
        // int[] rightProducts = new int[n];

        // int[] outputArr = new int[n];

        // leftProducts[0] = 1;
        // rightProducts[n - 1] = 1;

        // for (int i = 1 ; i < n ; i++) {
        //     leftProducts[i] = nums[i - 1] * leftProducts[i - 1];
        // }
        // for (int i = n - 2 ; i >= 0 ; i--) {
        //     rightProducts[i] = nums[i + 1] * rightProducts[i + 1];
        // }
        // for (int i = 0 ; i < n ; i++) {
        //     outputArr[i] = leftProducts[i] * rightProducts [i];
        // }
        // return outputArr;

         // Solution from Nick White 2
        int n = nums.length;
        int[] outputArr = new int[n];

        outputArr[0] = 1;

        for (int i = 1 ; i < n ; i++) {
            outputArr[i] = nums[i - 1] * outputArr[i - 1];
        }
        int products = 1;
        for (int i = n - 1 ; i >= 0 ; i--) {
            outputArr[i] = outputArr[i] * products;
            products = nums[i] * products;
        }
       
        return outputArr;
    }
}
// @lc code=end

