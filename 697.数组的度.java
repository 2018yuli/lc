/*
 * @lc app=leetcode.cn id=697 lang=java
 *
 * [697] 数组的度
 */

// @lc code=start
class Solution {
    public int findShortestSubArray(int[] nums) {
        // mine
        // Map<Integer, Integer> counter = new HashMap<Integer, Integer>();
        // Map<Integer, Integer> startIndex = new HashMap<Integer, Integer>();
        // Map<Integer, Integer> maxLen = new HashMap<Integer, Integer>();

        // for (int i = 0 ; i < nums.length ; i++) {
        //     Integer num = nums[i];
        //     counter.put(num, counter.getOrDefault(num, 0) + 1);
        //     if (startIndex.containsKey(num)) {
        //         maxLen.put(num, i - startIndex.get(num) + 1);
        //     }
        //     if (!startIndex.containsKey(num)) {
        //         startIndex.put(num, i);
        //     }
        // }

        // int maxVal = Integer.MIN_VALUE;
        // List<Integer> maxKeys = new ArrayList<Integer>();
        // for (Map.Entry<Integer, Integer> count : counter.entrySet()) {
        //     if (count.getValue() > 1 && count.getValue() > maxVal) {
        //         maxKeys.clear();
        //         maxKeys.add(count.getKey());
        //         maxVal = count.getValue();
        //     }
        //     else if (count.getValue() == maxVal) {
        //         maxKeys.add(count.getKey());
        //     }
        // }
        // counter.clear();
        // startIndex.clear();

        // int result = Integer.MAX_VALUE;
        // if (maxKeys.size() == 0) result = 1;
        // for (Integer maxKey : maxKeys) {
        //     result = Math.min(result, maxLen.getOrDefault(maxKey, 1));
        // }
        // return result;

        // Solution from Nick White
        HashMap<Integer, Integer> numCounts = new HashMap<Integer, Integer>();
        int degree = 0;
        
        HashMap<Integer, Integer> firstSeen = new HashMap<Integer, Integer>();
        int minLength = 0;

        for (int i = 0 ; i < nums.length ; i++) {
            Integer num = nums[i];
            firstSeen.putIfAbsent(num, i);

            numCounts.put(num, numCounts.getOrDefault(num, 0) + 1);
            if (numCounts.get(num) > degree) {
                degree = numCounts.get(num);
                minLength = i - firstSeen.get(num) + 1;
            } else if (numCounts.get(num) == degree) {
                minLength = Math.min(minLength, i - firstSeen.get(num) + 1);
            }
        }
        return minLength;

    }
}
// @lc code=end

