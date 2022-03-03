/*
 * @lc app=leetcode.cn id=763 lang=java
 *
 * [763] 划分字母区间
 */

// @lc code=start
class Solution {
    public List<Integer> partitionLabels(String s) {
        // mine
        // Map<Character, Integer> chars = new HashMap<Character, Integer>();
        // Map<Integer, Integer> indexes = new HashMap<Integer, Integer>();
        // int len = s.length();
        // for (int i = 0 ; i < len ; i++) {
        //     char c = s.charAt(i);
        //     if (!chars.containsKey(c)) {
        //         chars.put(c, i);
        //     } else {
        //         indexes.put(chars.get(c), i);
        //     }
        // }

        // Queue<Integer[]> queue = new LinkedList<Integer[]>();
        // for (Integer key : indexes.keySet()) {
        //     queue.offer(new Integer[]{key, indexes.get(key)});
        // }
        // TreeMap<Integer, Integer> mergedIndexes = new TreeMap<Integer, Integer>();
        // // merges
        // while (!queue.isEmpty()) {
        //     Integer[] nums = queue.poll();
        //     boolean merged = false;
        //     for (Map.Entry<Integer, Integer> merge : mergedIndexes.entrySet()) {
        //         if (merge.getKey() > nums[1] || merge.getValue() < nums[0]) {
        //             continue;
        //         } else {
        //             queue.offer(new Integer[]{
        //                     Math.min(merge.getKey(), nums[0]),
        //                     Math.max(merge.getValue(), nums[1])
        //             });
        //             mergedIndexes.remove(merge.getKey());
        //             merged = true;
        //             break;
        //         }
        //     }
        //     if (!merged) {
        //         mergedIndexes.put(nums[0], nums[1]);
        //     }
        // }
        // List<Integer> result = new ArrayList<Integer>();
        // int lastMax = 0;
        // for (Map.Entry<Integer, Integer> merge : mergedIndexes.entrySet()) {
        //     if (merge.getKey() > lastMax) {
        //         for (int i = lastMax ; i < merge.getKey() ; i++) {
        //             result.add(1);
        //         }
        //     }
        //     lastMax = merge.getValue() + 1;
        //     result.add(merge.getValue() - merge.getKey() + 1);
        // }
        // if (lastMax <= len - 1) {
        //     for (int i = lastMax ; i < len ; i++) {
        //             result.add(1);
        //         }
        // }
        // return result;

        // Solution from Nick White
        if (s == null || s.length() == 0) return null;

        List<Integer> outputArr = new ArrayList();

        int[] lastIndices = new int[26];
        for (int i = 0 ; i < s.length() ; i++) {
            lastIndices[s.charAt(i) - 'a'] = i;
        }

        int start = 0;
        int end = 0;
        for (int i = 0 ; i < s.length() ; i++) {
            end = Math.max(end, lastIndices[s.charAt(i) - 'a']);
            if (i == end) {
                outputArr.add(end - start + 1);
                start = end + 1;
            }
        }

        return outputArr;
    }
}
// @lc code=end

