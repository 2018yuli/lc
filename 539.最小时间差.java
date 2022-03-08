/*
 * @lc app=leetcode.cn id=539 lang=java
 *
 * [539] 最小时间差
 */

// @lc code=start
class Solution {
    public int findMinDifference(List<String> timePoints) {
        // mine
        // int[] times = new int[timePoints.size()];
        // for (int i = 0 ; i < timePoints.size() ; i++) {
        //     String[] timeArr = timePoints.get(i).split(":");
        //     times[i] = Integer.parseInt(timeArr[0]) * 60 + Integer.parseInt(timeArr[1]);
        // }
        // //
        // int minDifference = Integer.MAX_VALUE;
        // for (int i = 0 ; i < times.length ; i++) {
        //     for (int j = i + 1 ; j < times.length ; j++) {
        //         minDifference = Math.min(minDifference, timeDifference(times[i], times[j]));
        //     }
        // }
        // return minDifference;

        // Solution from Nick White
        // Bucket
        boolean[] timeSeen = new boolean[24 * 60];  // 1440
        for (String time : timePoints) {
            String[] timeSplit = time.split(":");
            int hour = Integer.parseInt(timeSplit[0]);
            int minute = Integer.parseInt(timeSplit[1]);
            if (timeSeen[hour * 60 + minute]) return 0;
            timeSeen[hour * 60 + minute] = true;
        }

        Integer firstTimeSeen = null;
        Integer prevTimeSeen = null;
        Integer minimumDifference = Integer.MAX_VALUE;
        for (int i = 0 ; i < timeSeen.length ; i++) {
            if (timeSeen[i]) {
                if (firstTimeSeen == null) {
                    firstTimeSeen = i;
                    prevTimeSeen = i;
                } else {
                    minimumDifference = Math.min(minimumDifference,
                        Math.min(i - prevTimeSeen, 1440 - i + prevTimeSeen));
                    prevTimeSeen = i;
                }
            }
        }
        minimumDifference = Math.min(minimumDifference,
                        Math.min(prevTimeSeen - firstTimeSeen, 1440 - prevTimeSeen + firstTimeSeen));
        return minimumDifference;
    }


    // private int timeDifference(int minute1, int minute2) {
    //     if (minute1 > minute2)
    //         return Math.min(minute1 - minute2, minute2 + 24 * 60 - minute1);
    //     else
    //         return Math.min(minute2 - minute1, minute1 + 24 * 60 - minute2);
    // }
}
// @lc code=end

