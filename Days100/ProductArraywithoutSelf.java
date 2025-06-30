package Days100;

public class ProductArraywithoutSelf {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int right[] = new int[n];
        int pro = 1;
        for (int i = n - 1; i >= 0; i--) {
            pro = pro * nums[i];
            right[i] = pro;

        }
        // left and calculation
        int ans[] = new int[n];
        int left = 1;
        for (int i = 0; i < n - 1; i++) {
            int val = left * right[i + 1];
            ans[i] = val;

            left = left * nums[i];

        }
        // for the last index only left responsible
        ans[n - 1] = left;
        return ans;

    }

    public static void main(String[] args) {

    }
}
