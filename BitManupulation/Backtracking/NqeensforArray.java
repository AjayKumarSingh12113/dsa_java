package BitManupulation.Backtracking;

import java.util.ArrayList;
import java.util.List;

public class NqeensforArray {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> solutions = new ArrayList<>();
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'x';
            }
        }
        nQueens(board, 0, solutions);
        return solutions;

    }

    public static void nQueens(char board[][], int row, List<List<String>> solutions) {
        // base
        if (row == board.length) {
            // System.out.println("-------out--------");
            // printall(board);
            solutions.add(constructSolution(board));
            return;
        }

        // recursion
        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                nQueens(board, row + 1, solutions);
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

    public static List<String> constructSolution(char[][] board) {
        List<String> solution = new ArrayList<>();
        for (char[] row : board) {
            solution.add(new String(row).replace('x', '.')); // Replace 'x' with '.' for the output format
        }
        return solution;
    }

    public static void main(String[] args) {

    }
}
