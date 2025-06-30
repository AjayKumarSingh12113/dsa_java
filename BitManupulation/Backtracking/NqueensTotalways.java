package BitManupulation.Backtracking;

import java.util.Scanner;

public class NqueensTotalways {
    public static int totalNQueens(int n) {
        // int count =0;we know in java primitive value work in only one {}
        // it does not reflect theirs value with other function , so use here non
        // primitive its
        // reflect in all functions and we do change in original fuctions
        int[] count = new int[1];//
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'x';
            }
        }
        nQueens(board, 0, count);
        return count[0];

    }

    public static void nQueens(char board[][], int row, int count[]) {
        // base
        if (row == board.length) {
            // System.out.println("-------out--------");
            // printall(board);
            count[0]++;
            return;
        }

        // recursion
        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                nQueens(board, row + 1, count);
                board[row][j] = 'x';
            }
        }
    }

    public static boolean isSafe(char board[][], int row, int col) {
        // vertical up
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }
        // diagonal up left
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        // diagonal up right
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n =sc.nextInt();
        System.out.println(totalNQueens(n));
    }

}
