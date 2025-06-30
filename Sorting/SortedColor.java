package Sorting;

public class SortedColor {
    //Input: nums = [2,0,2,1,1,0]
     //Output: [0,0,1,1,2,2]
    //
    public static void sortColors(int[] nums) {
        // O(n)
        int l = 0, m = 0, h = nums.length - 1;
        while (m <= h) {
            if (nums[m] == 0) {
                swap(nums, l, m);
                l++;
                m++;
            } else if (nums[m] == 1) {
                m++;
            } else {
                swap(nums, h, m);
                h--;
            }

        }
    }

    public static void swap(int nums[], int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public static void main(String[] args) {
        
    }
}
