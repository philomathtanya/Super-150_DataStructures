import java.util.*;
public class N_Queen_Hard{
	public static void N_Queen(boolean[][] board, int tq, int row) {
        if (tq == 0) {
//            Display(board);
            count++;
            return;
        }
        for (int col = 0; col < board.length; col++) {
            if (issafe(board, row, col) == true) {
                board[row][col] = true;
                N_Queen(board, tq - 1, row + 1);
                board[row][col] = false;
            }

        }

    }
	public static int count=0;
     public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        boolean[][] board = new boolean[n][n];
        N_Queen(board, n, 0);
        System.out.println(count);
        count=0;
    }
    public static boolean issafe(boolean[][] board, int row, int col) {

        int r = row;
        // vertical
        while (r >= 0) {
            if (board[r][col] == true) {
                return false;
            }
            r--;
        }

        // left Diagonal
        r = row;
        int c = col;
        while (r >= 0 && c >= 0) {
            if (board[r][c] == true) {
                return false;
            }
            c--;
            r--;
        }
        // left Diagonal
        r = row;
        c = col;
        while (r >= 0 && c < board.length) {
            if (board[r][c] == true) {
                return false;
            }
            c++;
            r--;
        }
        return true;
    }
}