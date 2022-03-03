/*
 * @lc app=leetcode.cn id=763 lang=java
 *
 * [763] 划分字母区间
 */

// @lc code=start
class Solution {
    public List<Integer> partitionLabels(String s) {
        // mine
        Map<Character, Integer> chars = new HashMap<Character, Integer>();
        Queue<Integer[]> queue = new LinkedList<Integer[]>();
        int len = s.length();
        for (int i = 0 ; i < len ; i++) {
            char c = s.charAt(i);
            if (!chars.containsKey(c)) {
                chars.put(c, i);
            } else {
                queue.offer(new Integer[]{chars.get(c), i});
            }
        }

        List<Integer> result = new ArrayList<Integer>();
        Map<Integer, Integer> mergedIndexes = new HashMap<Integer, Integer>();
        // merges TODO
        while (!queue.isEmpty()) {
            for (Map.Entry<Integer, Integer> merge : mergedIndexes.entrySet()) {

            }
        }

    }
}
// @lc code=end

