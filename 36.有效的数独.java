/*
 * @lc app=leetcode.cn id=36 lang=java
 *
 * [36] 有效的数独
 */

// @lc code=start
class Solution {
    public boolean isValidSudoku(char[][] board) {
        // mine
        int len = 3;
        // 判断 9 个小方格
        // for (int rowStart = 0 ; rowStart < 8 ; rowStart += 2) {
        //     for (int colStart = 0 ; colStart < 8 ; colStart += 2) {
        //         int rowEnd = rowStart + len;
        //         int colEnd = colStart + len;
        //         Set<Character> set = new HashSet<Character>();
        //         for (int i = rowStart ; i < rowEnd ; i++) {
        //             for (int j = colStart ; j < colEnd ; j++) {
        //                 char c = board[i][j];
        //                 if (c == '.') continue;
        //                 if (set.contains(c)) {
        //                     return false;
        //                 } else {
        //                     set.add(c);
        //                 }
        //             }
        //         }
        //     }
        // }
        // // 判断每行
        // for (int i = 0 ; i < board.length ; i++) {
        //    Set<Character> set = new HashSet<Character>();
        //    for (int j = 0 ; j < board[i].length ; j++) {
        //         char c = board[i][j];
        //         if (c == '.') continue;
        //         if (set.contains(c)) {
        //             return false;
        //         } else {
        //             set.add(c);
        //         }
        //    }
        // }
        // // 判断每列
        // for (int i = 0 ; i < board.length ; i++) {
        //    Set<Character> set = new HashSet<Character>();
        //    for (int j = 0 ; j < board[i].length ; j++) {
        //         char c = board[j][i];
        //         if (c == '.') continue;
        //         if (set.contains(c)) {
        //             return false;
        //         } else {
        //             set.add(c);
        //         }
        //    }
        // }
        // return true;

        // Solution from Nick White
         Set<String> seen = new HashSet<String>();
        for (int i = 0 ; i < 9 ; i++) {
            for (int j = 0 ; j < 9 ; j++) {
                char currentVal = board[i][j];
                if (currentVal != '.') {
                    if (!seen.add(currentVal + " found in row " + i)
                        || !seen.add(currentVal + " found in col " + j)
                        || !seen.add(currentVal + " fount in sub box" + (i/3) + "-" + (j/3))) {
                            return false;
                        }
                }
            }
        }
        return true;
    }
}
// @lc code=end

