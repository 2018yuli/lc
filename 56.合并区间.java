/*
 * @lc app=leetcode.cn id=56 lang=java
 *
 * [56] 合并区间
 */

// @lc code=start
class Solution {
    public int[][] merge(int[][] intervals) {
        // mine
        // int n = intervals.length;
        // // bubbo sort
        // for (int i = 0 ; i < n ; i++) {
        //     for (int j = i ; j < n ; j++) {
        //         if (intervals[i][0] > intervals[j][0]) {
        //             int[] temp = intervals[i];
        //             intervals[i] = intervals[j];
        //             intervals[j] = temp;
        //         }
        //     }
        // }
        // List<int[]> resultList = new ArrayList<int[]>();
        // int[] prev = intervals[0];
        // for (int i = 1 ; i < n ; i++) {
        //     if (prev[1] >= intervals[i][0]) {
        //         prev = new int[]{Math.min(prev[0], intervals[i][0])
        //             , Math.max(prev[1], intervals[i][1])};
        //     } else {
        //         resultList.add(prev);
        //         prev = intervals[i];
        //     }
        // }
        // resultList.add(prev);
        // int[][] result = new int[resultList.size()][2];
        // for (int i = 0 ; i < resultList.size() ; i++) {
        //     result[i] = resultList.get(i);
        // }
        // return result;

        // Solution from Nick White
        if (intervals.length <= 1) {
            return intervals;
        }

        Arrays.sort(intervals, (arr1, arr2) -> Integer.compare(arr1[0], arr2[0]));

        List<int[]> outputArr = new ArrayList<int[]>();
        int[] currentInterval = intervals[0];
        outputArr.add(currentInterval);

        for (int[] interval : intervals) {
            int currentBegin = currentInterval[0];
            int currentEnd = currentInterval[1];
            int nextBegin = interval[0];
            int nextEnd = interval[1];
            if (currentEnd >= nextBegin) {
                currentInterval[1] = Math.max(currentEnd, nextEnd);
            } else {
                currentInterval = interval;
                outputArr.add(currentInterval);
            }
        }

        return outputArr.toArray(new int[outputArr.size()][]);

    }
}
// @lc code=end

