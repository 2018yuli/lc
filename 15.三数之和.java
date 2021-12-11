/*
 * @lc app=leetcode.cn id=15 lang=java
 *
 * [15] 三数之和
 */

// @lc code=start
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // mine
        // List<List<Integer>> result = new ArrayList<List<Integer>>();
        // if (nums.length < 3) return result;

        // Arrays.sort(nums);
        // Set<Integer> repeatSet = new HashSet<Integer>();
        // for (int i = 0 ; i < numsNew.length ; i++) {
        //     for (int j = i + 1 ; j < nums.length ; j++) {
        //         int target = -(nums[i] + nums[j]);
        //         for (int k = j + 1 ; k < nums.length ; k++) {
        //             if (nums[k] > target) break;
        //             if (nums[k] == target) {
        //                 String key = "" + nums[i] + nums[j] + nums[k];
        //                 if (!repeatSet.contains(key)) {
        //                     repeatSet.add(key);
        //                     List<Integer> pair = new ArrayList<Integer>();
        //                     pair.add(nums[i]);
        //                     pair.add(nums[j]);
        //                     pair.add(nums[k]);
        //                     result.add(pair);
        //                 }
        //                 break;
        //             }
        //         }
        //     }
        // }
        // return result;

        // Solution from Nick White
        Arrays.sort(nums);
        List<List<Integer>> outputArr = new ArrayList<List<Integer>>();

        for (int i = 0 ; i < nums.length - 2 ; i++) {
            if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
                int low = i + 1;
                int high = nums.length - 1;
                int sum = 0 - nums[i];

                while (low < high) {
                    if (nums[low] + nums[high] == sum) {
                        outputArr.add(Arrays.asList(nums[i], nums[low], nums[high]));
                        while (low < high && nums[low] == nums[low + 1]) low++;
                        while (low < high && nums[high] == nums[high - 1]) high--;
                        low++;
                        high--;
                    } else if (nums[low] + nums[high] > sum) {
                        high--;
                    } else if (nums[low] + nums[high] < sum) {
                        low++;
                    }
                }
            }
        }
        return outputArr;
    }
}
// @lc code=end

