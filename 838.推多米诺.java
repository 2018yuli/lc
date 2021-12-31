/*
 * @lc app=leetcode.cn id=838 lang=java
 *
 * [838] 推多米诺
 */

// @lc code=start
class Solution {
    public String pushDominoes(String dominoes) {
        // mine
        // char[] dominoesArr = dominoes.toCharArray();
        // int lastIndex = 0;
        // for (int i = 0 ; i < dominoesArr.length ; i++) {
        //     if (dominoesArr[i] == 'R') {
        //         play(dominoesArr, lastIndex, i);
        //         lastIndex = i;
        //     }
        //     if (dominoesArr[i] == 'L') {
        //         play(dominoesArr, lastIndex, i);
        //         lastIndex = i;

        //     }
        // }
        // play(dominoesArr, lastIndex, dominoesArr.length - 1);
        // return new String(dominoesArr);

        // Solution from Nick White
        // maked a index named fources
        char[] dominoesArr = dominoes.toCharArray();
        int n = dominoesArr.length;
        int[] fources = new int[n];

        int force = 0;
        for (int i = 0 ; i < n ; i++) {
            if (dominoesArr[i] == 'R') {
                force = n;
            } else if (dominoesArr[i] == 'L') {
                force = 0;
            } else {
                force = Math.max(force - 1, 0);
            }
            fources[i] += force;
        }

        force = 0;
        for (int i = n - 1 ; i >= 0 ; i--) {
            if (dominoesArr[i] == 'L') {
                force = n;
            } else if (dominoesArr[i] == 'R') {
                force = 0;
            } else {
                force = Math.max(force - 1, 0);
            }
            fources[i] -= force;
        }

        StringBuilder result = new StringBuilder();
        for (Integer f : fources) {
            if (f > 0) result.append('R');
            else if (f < 0) result.append('L');
            else result.append('.');
        }
        
        return result.toString();
    }

    // private void play(char[] dominoesArr, int start, int end) {
    //     if (dominoesArr[start] != 'R' && dominoesArr[end] != 'L') return;
    //     while (start < end) {
    //     	boolean right = false;
    //     	boolean left = false;
    //         if (dominoesArr[start] == 'R') {
    //             if (start + 2 > dominoesArr.length - 1 || dominoesArr[start + 2] != 'L')
    //                 right = true;
    //             start++;
    //         }
    //         if (dominoesArr[end] == 'L') {
    //             if (end - 2 < 0 || dominoesArr[end - 2] != 'R')
    //             	left = true;
    //             end--;
    //         }
    //         if (right && dominoesArr[start] == '.') dominoesArr[start] = 'R';
    //         if (left && dominoesArr[end] == '.') dominoesArr[end] = 'L';
    //     }
    // }
}
// @lc code=end

