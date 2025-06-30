package Days100;

public class LargestNoatleastTwice {
    public static int dominantIndex(int[] nums) {
        int max1 = -1;
        int smax = -1;
        int index1 = 0;
        
        
        for (int i = 0; i < nums.length; i++) {
            if (max1 < nums[i]) {
                smax = max1;
                max1 = nums[i];
                index1 = i;

            } else if (smax < nums[i]) {
                smax = nums[i];
              
            }

        }
        if (max1>=2*smax) {
            return index1;
        } else {
            return -1;
        }
        

    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4};
        System.out.println(dominantIndex(nums));
        
    }
}
