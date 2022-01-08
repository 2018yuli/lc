/*
 * @lc app=leetcode.cn id=752 lang=java
 *
 * [752] 打开转盘锁
 */

// @lc code=start
class Solution {
    public int openLock(String[] deadends, String target) {
        // mine
        // TODO 如果把以 3 开头所有数字，和以 7 开头的所有数字全部锁死，则 5555 不可达
        // TODO 即为，此题只可以暴力解！！！
        // int result = 0;
        // if ("0000".equals(target)) return result;
        // String middleVal = "";
        // String sequence = "0123456789";
        // Set<String> deadSet = new HashSet<String>();
        // for (String dead : deadends) {
        //     deadSet.add(dead);
        // }
        // if (deadSet.contains("0000")) return -1;

        // char[] targetCharArr = target.toCharArray();
        // for (int j = 0 ; j < targetCharArr.length * 2 ; j++) {
        //     int i = j % targetCharArr.length;
        //     // 不为初始值（0）的数字优先
        //     if (j < targetCharArr.length && targetCharArr[i] == '0')
        //         continue;
        //     if (j >= targetCharArr.length && targetCharArr[i] != '0')
        //         continue;
            
        //     int index = sequence.indexOf(targetCharArr[i]);
        //     targetCharArr[i] = sequence.charAt((10 + index - 1) % 10);
        //     String lower = new String(targetCharArr);
        //     if (!deadSet.contains(lower)) {
        //         middleVal = lower;
        //         if (targetCharArr[i] < '5') break;
        //     }
        //     targetCharArr[i] = sequence.charAt((index + 1) % 10);
        //     String higher = new String(targetCharArr);
        //     if (!deadSet.contains(higher)) {
        //         middleVal = higher;
        //         if (targetCharArr[i] > '5' || targetCharArr[i] == '0') break;
        //     }
        //     targetCharArr[i] = sequence.charAt(index);
        // }
        // if ("".equals(middleVal))
        //     return -1;
        // char[] middleCharArr = middleVal.toCharArray();
        // for (char middleChar : middleCharArr) {
        //     result += Math.min(middleChar - '0', '9' - middleChar + 1);
        // }
        // return result + 1;

        // solution from Nick White
        // Graphic Solution 暴力开解
        HashSet<String> deadEnds = new HashSet<String>(Arrays.asList(deadends));

        HashSet<String> visited = new HashSet<String>();
        visited.add("0000");

        Queue<String> queue = new LinkedList<String>();
        queue.offer("0000");

        int level = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size > 0) {
                String lockPosition = queue.poll();
                if (deadEnds.contains(lockPosition)) {
                    size--;
                    continue;
                }

                if (lockPosition.equals(target)) {
                    return level;
                }

                StringBuilder sb = new StringBuilder(lockPosition);
                for (int i = 0 ; i < 4 ; i++) {
                    char currentPosition = sb.charAt(i);
                    String s1 = sb.substring(0, i) + (currentPosition == '9' ? 0 : currentPosition - '0' + 1) + sb.substring(i + 1);
                    String s2 = sb.substring(0, i) + (currentPosition == '0' ? 9 : currentPosition - '0' - 1) + sb.substring(i + 1);

                    if (!visited.contains(s1) && !deadEnds.contains(s1)) {
                        queue.offer(s1);
                        visited.add(s1);
                    }

                    if (!visited.contains(s2) && !deadEnds.contains(s2)) {
                        queue.offer(s2);
                        visited.add(s2);
                    }
                }
                size--;
            }
            level++;
        }
        return -1;
    }
}
// @lc code=end

