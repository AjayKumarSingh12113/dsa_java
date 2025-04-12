public class Findfistandlstoccurance {
    public static int[] searchRange1(int[] nums, int target) {
        int list[] = {-1,-1};
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                if (list[0] == -1) {
                    list[0] = i;

                }

                list[1] = i;
            } 
        }
        return list;

    }
    public static void main(String[] args) {
        int[] nums = { 5, 7, 7, 8, 8, 10 };
        int target = 8;
        int[] x =searchRange1(nums, target);
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i]);
        }

    }
}
