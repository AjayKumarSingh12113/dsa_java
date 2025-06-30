package Arrays2D;

public class RotateImage {
    public static void rotate(int[][] matrix) {
        int n = matrix.length;// traspose
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int k = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = k;
            }
        } // row reverse
        for (int i = 0; i < n; i++) {
            int tempArray[] = matrix[i];// [[1,2,3],[4,5,6],[7,8,9]]
            reverse(tempArray); // [1,2,3]
        }
        return;
    }

    public static void reverse(int arr[]) {
        int st = 0, end = arr.length - 1;
        while (st < end) {
            int k = arr[st];
            arr[st] = arr[end];
            arr[end] = k;
            st++;
            end--;
        }
    }
    public static void main(String[] args) {
        
    }
}
