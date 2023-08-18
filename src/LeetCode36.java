import java.util.HashSet;
import java.util.Set;

public class LeetCode36 {
    public boolean isValidSudoku(char[][] board) {
        Set seen = new HashSet();
        for (int row = 0; row < 9; row++) {
            for (int column = 0; column < 9; column++) {
                if (board[row][column] != '.') {
                    String b = "(" + board[row][column] + ")";
                    if (!seen.add(b + row) || !seen.add(column + b) || !seen.add(row / 3 + b + column / 3))
                        return false;
                }
            }
        }
        return true;
    }
}
