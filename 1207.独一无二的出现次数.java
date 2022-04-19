/*
 * @lc app=leetcode.cn id=1207 lang=java
 *
 * [1207] 独一无二的出现次数
 */

// @lc code=start
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        // mine
        // Map<Integer, Integer> counter = new HashMap<Integer, Integer>();
        // for (int num : arr) {
        //     counter.put(num, counter.getOrDefault(num, 0) + 1);
        // }
        // Set<Integer> set = new HashSet<Integer>();
        // for (int key : counter.keySet()) {
        //     int val = counter.get(key);
        //     if (set.contains(val)) {
        //         return false;
        //     }
        //     set.add(val);
        // }
        // return true;

        // Solution from Nick White
        Map<Integer, Integer> numOccurrences = new HashMap<Integer, Integer>();
        for (int num : arr) {
            numOccurrences.put(num, numOccurrences.getOrDefault(num, 0) + 1);
        }
        HashSet<Integer> uniqueVals = new HashSet(numOccurrences.values());
        return uniqueVals.size() == numOccurrences.size();
    }
}
// @lc code=end

