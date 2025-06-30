package Days100;

public class SortedSquare {
    public static int[] sortedSquares(int[] nums) {
        int ans[] = new int[nums.length];
        int start = 0;
        int end = nums.length - 1;
        int pt = ans.length - 1;// ans ke liye

        while (start <= end) {
            int ssq = nums[start] * nums[start];
            int esq = nums[end] * nums[end];

            if (ssq > esq) {
                ans[pt] = ssq;
                start++;
            } else {
                ans[pt] = esq;
                end--;
            }
            pt--;
        }
        return ans;

    }
    public static void main(String[] args) {
        
    }
}
