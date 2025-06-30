package Arrays;

public class PivotIndex {
//     Input:nums=[1,7,3,6,5,6]Output:3 Explanation:
// The pivot
//     index is 3.
//     Left sum = nums[0] + nums[1] + nums[2]=1+7+3=11
//     Right sum = nums[4] + nums[5]=5+6=11
    public static int pivotIndex(int[] nums) {
        int rsum = 0;
        for (int el : nums) {
            rsum += el;
        }
        int lsum = 0;
        for (int i = 0; i < nums.length; i++) {
            rsum -= nums[i];
            if (rsum == lsum) {
                return i;
            }
            lsum = lsum + nums[i];
        }
        return -1;

    }
    public static void main(String[] args) {
        
    }
}
