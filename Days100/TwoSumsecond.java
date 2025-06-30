package Days100;

public class TwoSumsecond {
    public static int[] twoSum(int[] numbers, int target) {
        int ans[] = new int[2];

        int st = 0;
        int ed = numbers.length - 1;
        while (st < ed) {
            int sum = numbers[st] + numbers[ed];
            if (sum == target) {
                // ans.add(st+1);
                ans[0] = st + 1;
                ans[1] = ed + 1;

                return ans;
            }
            if (sum < target) {
                st++;
            } else {
                ed--;
            }
        }
        return ans;

    }

    public static void main(String[] args) {
    
        
    }
}
