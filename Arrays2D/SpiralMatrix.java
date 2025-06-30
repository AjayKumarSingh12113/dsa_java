package Arrays2D;

public class SpiralMatrix {
    public static int[][] generateMatrix(int n) {
        int arr[][] = new int[n][n];
        int count = 1;
        int minrow = 0, maxrow = n - 1, mincol = 0, maxcol = n - 1;
        while (count <= n * n) {
            for (int c = mincol; c <= maxcol; c++) {
                arr[minrow][c] = count;
                count++;
            }
            for (int r = minrow + 1; r <= maxrow; r++) {
                arr[r][maxcol] = count;
                count++;
            }
            for (int c = maxcol - 1; c >= mincol; c--) {
                arr[maxrow][c] = count;
                count++;
            }
            for (int r = maxrow - 1; r >= minrow + 1; r--) {
                arr[r][mincol] = count;
                count++;
            }
            minrow++;
            maxrow--;
            mincol++;
            maxcol--;

        }
        return arr;
    }
    public static void main(String[] args) {
        
    }
}
