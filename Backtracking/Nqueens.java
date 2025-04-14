package Backtracking;

public class Nqueens {
    public static void printall(char board[][]) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean isSafe(char board[][], int row, int col) {
        // vertical up
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col]=='Q') {
                return false;
            }
        }
        // diagonal up left
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j]=='Q') {
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
    public static void nQueens(char board[][], int row) {
        // base
        if (row == board.length) {
            //System.out.println("-------out--------");
            //printall(board);
            count++;
            return;
        }

        // recursion 
        for (int j = 0; j < board.length; j++) {
            if (isSafe(board,row, j)) {
                board[row][j] = 'Q';
                nQueens(board, row + 1);
                board[row][j] = 'x';
            }
        }
    }

    static int count = 0;
    public static void main(String[] args) {
        int n = 1;
        char board[][] = new char[n][n];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = 'x';
            }
        }
        nQueens(board, 0);
        System.out.println("Total ways to : " +count);
    }
}
