package Days100;

public class MaxProductArray {
    public static int maxProduct(int[] nums) {
        int max1 = -1;
        int smax = -1;

        for (int i = 0; i < nums.length; i++) {
            if (max1 < nums[i]) {
                smax = max1;
                max1 = nums[i];
            } else if (smax < nums[i]) {
                smax = nums[i];
            }

        }
        return ((max1 - 1) * (smax - 1));

    }
    public static void main(String[] args) {
        
    }
}
