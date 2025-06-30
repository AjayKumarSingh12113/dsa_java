package Days100;

class MissingNumber {
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int totalsum = (n * (n + 1)) / 2;
        int sumofarray = 0;
        for (int i = 0; i <= nums.length - 1; i++) {
            sumofarray += nums[i];
        }
        return (totalsum - sumofarray);

    }

    public static void main(String[] args) {
        int nums[] = { 0, 2, 3 };
        System.out.println(missingNumber(nums));

    }
}