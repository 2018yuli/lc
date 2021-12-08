/*
 * @lc app=leetcode.cn id=975 lang=java
 *
 * [975] 奇偶跳
 */

// @lc code=start
class Solution {
    public int oddEvenJumps(int[] arr) {
        // mine
        // int count = 0;
        // for (int startIndex = 0 ; startIndex < arr.length ; startIndex++) {
        //     //
        //     count += jump(startIndex, arr, 1);
        // }
        // return count;

        // Solution from Nick White
        int goodStartingIndexCount = 1;
        int n = arr.length;

        boolean[] higher = new boolean[n];
        boolean[] lower = new boolean[n];

        higher[n - 1] = true;
        lower[n - 1] = true;
        // <value,Index>
        TreeMap<Integer, Integer> treeMap = new TreeMap<Integer, Integer>();
        treeMap.put(arr[n-1], n-1);

        for (int i = n - 2 ; i >= 0 ; i--) {
            Map.Entry higherKeyValuePair = treeMap.ceilingEntry(arr[i]);
            Map.Entry lowerKeyValuePair = treeMap.floorEntry(arr[i]);

            if (higherKeyValuePair != null) {
                higher[i] = lower[(int)higherKeyValuePair.getValue()];
            }
            if (lowerKeyValuePair != null) {
                lower[i] = higher[(int)lowerKeyValuePair.getValue()];
            }
            if (higher[i]) goodStartingIndexCount++;
            treeMap.put(arr[i], i);
        }

        return goodStartingIndexCount;
    }

    // /**
    // * @param startIndex
    // * @param arr
    // * @param step
    // * @return 参数
    // */
    // private static int jump (int startIndex, int[] arr, int step) {
    // 	if (startIndex == arr.length - 1) return 1;
    // 	List<Integer> nextIndexes = nextSteps(startIndex, arr, step % 2 == 0);
    // 	if (nextIndexes.isEmpty()) return 0;
    // 	// int count = 0;
    // 	// for (int nextIndex : nextIndexes) {
    // 	// 	count += jump(nextIndex, arr, ++step);
    // 	// }
    // 	// return count > 0 ? 1 : 0;
    //     return jump(nextIndexes.get(0), arr, ++step);
    // }
    
    
    // /**
    // * @param startIndex
    // * @param arr
    // * @param isEven
    // * @return 参数
    // */
    // private static List<Integer> nextSteps(int startIndex, int[] arr, boolean isEven) {
    // 	List<Integer> resultIndex = new ArrayList<Integer>();
    // 	int minMaxNum;
    // 	if (isEven) minMaxNum = Integer.MIN_VALUE;
    // 	else minMaxNum = Integer.MAX_VALUE;
    // 	for (int i = startIndex + 1 ; i < arr.length ; i++) {
    // 		if (isEven) {
    // 			// 偶数步，小于 startIndex 的最大值
    // 			if (arr[i] <= arr[startIndex]) {
    // 				if (arr[i] > minMaxNum) {
    // 					minMaxNum = arr[i];
    // 					resultIndex.clear();
    //                     resultIndex.add(i);
    // 				}else if (arr[i] == minMaxNum) {
    // 					resultIndex.add(i);
    // 				}
    // 			}
    // 		}else {
    // 			// 奇数步，大于 startIndex 的最小值
    // 			if (arr[i] >= arr[startIndex]) {
    // 				if (arr[i] < minMaxNum) {
    // 					minMaxNum = arr[i];
    // 					resultIndex.clear();
    // 					resultIndex.add(i);
    // 				}else if (arr[i] == minMaxNum) {
    // 					resultIndex.add(i);
    // 				}
    // 			}
    // 		}
    // 	}
    // 	return resultIndex;
    // }
}
// @lc code=end

