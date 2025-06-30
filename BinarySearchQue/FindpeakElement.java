package BinarySearchQue;

public class FindpeakElement {
    public static int findPeakElement(int[] nums) {
        // O(logn) - binary search
        int n = nums.length;
        if (n == 1) {
            return 0;
        } else if (nums[0] > nums[1]) {
            return 0;
        } else if (nums[n - 1] > nums[n - 2]) {
            return n - 1;
        } else {
            int st = 1;
            int end = n - 2;

            while (st <= end) {
                int mid = st + (end - st) / 2;
                if (nums[mid] > nums[mid + 1] && nums[mid] > nums[mid - 1]) {
                    return mid;
                } else if (nums[mid] < nums[mid + 1]) {
                    st = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
            return -1;
        }

    }
    public static void main(String[] args) {
        
    }
}
