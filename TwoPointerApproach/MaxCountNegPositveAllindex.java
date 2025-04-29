public class MaxCountNegPositveAllindex {
    // Input:nums=[-2,-1,-1,1,2,3]Output:3 Explanation:
    // There are 3
    // positive integers and 3
    // negative integers.
    // The maximum
    // count among
    // them is 3.
    public int maximumCount(int[] nums) {
        int lastnegative = negativeInd(nums) + 1;
        int firstPositive = nums.length - positiveInd(nums);
        return (Math.max(lastnegative, firstPositive));

    }

    public static int negativeInd(int[] nums) {
        int n = nums.length;
        int st = 0;
        int end = n - 1;

        int ans = -1;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (nums[mid] < 0) {
                ans = mid;
                st = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }

    public static int positiveInd(int[] nums) {
        int n = nums.length;
        int st = 0;
        int end = n - 1;

        int ans = n;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (nums[mid] > 0) {
                ans = mid;
                end = mid - 1;
            } else {
                st = mid + 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        
    }
}
