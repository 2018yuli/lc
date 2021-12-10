/*
 * @lc app=leetcode.cn id=904 lang=java
 *
 * [904] 水果成篮
 */

// @lc code=start
class Solution {
    public int totalFruit(int[] fruits) {
        // mine
        // int maxTotal = Integer.MIN_VALUE;
        // Set<Integer> busket = null;
        // int start = 0;
        // while (start < fruits.length) {
        //     busket = new HashSet<Integer>();
        //     for (int i = start ; i < fruits.length ; i++) {
        //         busket.add(fruits[i]);
        //         if (busket.size() > 2) {
        //             maxTotal = Math.max(i - start, maxTotal);
        //             break;
        //         } else if (i == fruits.length - 1) {
        //             maxTotal = Math.max(i - start + 1, maxTotal);
        //             break;
        //         }
        //     }
        //     start++;
        // }
        // return maxTotal;

        // mine2
        // int maxTotal = Integer.MIN_VALUE;
		// LinkedList<Integer> busket = new LinkedList<Integer>();
		// Set<Integer> buskets = new HashSet<Integer>();
		
        // int endPoint = 0;
        // while (endPoint < fruits.length) {
        // 	buskets.add(fruits[endPoint]);
        // 	if (buskets.size() > 2) {
        // 		int left = busket.peekLast();
        //     	// 清空 busket 到只剩最后一种水果
        //     	int size = busket.size();
        //     	for (int i = size - 2 ; i >= 0 ; i--) {
        //     		if (busket.get(i) != left) {
        //     			for (int j = 0 ; j <= i ; j++) {
        //     				busket.remove(0);
        //     			}
        //     			break;
        //     		}
        //     	}
        //     }
        // 	busket.add(fruits[endPoint++]);
        // 	buskets.clear();
        // 	buskets.addAll(busket);
        // 	maxTotal = Math.max(maxTotal, busket.size());
        // }
        
        // return maxTotal;

        // Solution from Nick White
        // Using sliding window method
        int lastFruid = -1;
        int secondLastFruid = 0;
        
        int lastFruidCount = 0;
        int currentMax = 0;
        int max = 0;

        for (Integer fruit : fruits) {
            
            if (fruit == lastFruid || fruit == secondLastFruid) {
                currentMax += 1;
            } else {
                currentMax = lastFruidCount + 1;
            }

            if (fruit == lastFruid) {
                lastFruidCount += 1;
            }else {
                lastFruidCount = 1;
            }

            if (fruit != lastFruid) {
                secondLastFruid = lastFruid;
                lastFruid = fruit;
            }

            max = Math.max(currentMax, max);
        }
        return max;
    }
}
// @lc code=end

