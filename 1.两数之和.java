/*
 * @lc app=leetcode.cn id=1 lang=java
 *
 * [1] 两数之和
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        // for (int i = 0; i < nums.length; i++) {
        //     // 排除不合理的数
        //     if (nums[i] >= target){
        //         continue;
        //     }
        //     for (int j = i + 1; j < nums.length; j++) {
        //         if (nums[j] >= target){
        //             continue;
        //         }
        //         // 返回条件
        //         if (nums[i] + nums[j] == target){
        //             return new int[]{i, j};
        //         }
        //     }
        // }
        // return new int[]{-1, -1};

        // for (int i = 0; i < nums.length; i++) {
        //     // 排除不合理的数
        //     for (int j = i + 1; j < nums.length; j++) {
        //         // 返回条件
        //         if (nums[i] + nums[j] == target){
        //             return new int[]{i, j};
        //         }
        //     }
        // }
        // return new int[]{-1, -1};

        // 利用一个存储空间减少算法复杂度
        // Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        // for (int i = 0; i < nums.length; i++) {
        //     map.put(nums[i], i);
        // }
        // for (int i = 0; i < nums.length; i++) {
        //     // 利用取反的思想减少算法复杂度
        //     int complement = target - nums[i];
        //     if (map.containsKey(complement) && map.get(complement) != i) {
        //         return new int[] { i, map.get(complement) };
        //     }
        // }
        // throw new IllegalArgumentException("No two sum solution");

        // 计数算法+取余思想
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
// @lc code=end

