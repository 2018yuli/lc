/*
 * @lc app=leetcode.cn id=1184 lang=java
 *
 * [1184] 公交站间的距离
 */

// @lc code=start
class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        // mine
        // int distanceClockwise = distances(distance, start, destination);;
        // int distanceAntiClockwise = distances(distance, 0, start) + distances(distance, destination, distance.length);
        // return Math.min(distanceClockwise, distanceAntiClockwise);

        // Solution From Nick White
        int clockwiseDistance = 0;
        int totalDistance = 0;

        for (int i = 0 ; i < distance.length ; i++) {
            if (start < destination && i >= start && i < destination)
                clockwiseDistance += distance[i];
            if (start > destination && (i >= start || i < destination)) {
                clockwiseDistance += distance[i];
            }
            totalDistance += distance[i];
        }
        return Math.min(clockwiseDistance, totalDistance - clockwiseDistance);
    }

    // private int distances(int[] distance, int start, int destination) {
    //     destination = destination - 1;
    //     if (destination == -1)
    //         return 0;
    //     if (start == destination)
    //         return distance[start];
    //     return (distance[start] + distance[destination]) * (destination - start + 1) / 2;
    // }
}
// @lc code=end

