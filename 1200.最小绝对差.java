/*
 * @lc app=leetcode.cn id=1200 lang=java
 *
 * [1200] 最小绝对差
 */

// @lc code=start
class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        // mine
        // if (arr.length == 0) return new ArrayList<List<Integer>>();
        // Arrays.sort(arr);
        // int minAbs = Integer.MAX_VALUE;
        // int prev = arr[0];
        // List<List<Integer>> result = new ArrayList<List<Integer>>();
        // for (int i = 1 ; i < arr.length ; i++) {
        //     int current = arr[i];
        //     if (current - prev < minAbs) {
        //         minAbs = current - prev;
        //         result.clear();
        //     }
        //     if (current - prev <= minAbs) {
        //         List<Integer> item = new ArrayList<Integer>();
        //         item.add(prev);
        //         item.add(current);
        //         result.add(item);
        //     }
        //      prev = current;
        // }
        // return result;

        // Solution from Nick White
        Arrays.sort(arr);

        List<List<Integer>> result = new ArrayList<List<Integer>>();

        int minDiff = Integer.MAX_VALUE;
        for (int i = 1 ; i < arr.length ; i++) {
            minDiff = Math.min(arr[i] - arr[i - 1], minDiff);
        }

        for (int i = 1 ; i < arr.length ; i++) {
            if (arr[i] - arr[i - 1] == minDiff) {
                List<Integer> pair = new ArrayList<Integer>();
                pair.add(arr[i - 1]);
                pair.add(arr[i]);
                result.add(pair);
            }
        }
        return result;
    }
}
// @lc code=end

