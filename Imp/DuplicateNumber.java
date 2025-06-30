package Imp;

public class DuplicateNumber {
    public static int findDuplicate(int[] nums) {
        // approach one-nested loop
        // ap -2 using hashmap
        // app -3
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            int el = nums[i];
            el = Math.abs(el);

            if (nums[el] > 0) {
                nums[el] = -nums[el];

            } else {
                ans = el;
                break;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Math.abs(nums[i]);
        }
        return ans;

    }
    public static void main(String[] args) {
        
    }
}
