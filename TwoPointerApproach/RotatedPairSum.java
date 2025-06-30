package BitManupulation.TwoPointerApproach;
public class RotatedPairSum {
    public static boolean fundPair(int arr[], int target) {
        int breakingPoint = -1;
        int n = arr.length;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[i + 1]) {
                breakingPoint = i;
                
                break;

            }
        }
        int lp = breakingPoint + 1;
        int rp = breakingPoint;
        while (lp != rp) {

            if (arr[lp] + arr[rp] == target) {
                return true;
            } else if (arr[lp] + arr[rp] < target) {
                lp = (lp + 1) % n;

            } else {
                rp = (n + rp - 1) % n;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = { 11, 15, 6, 8, 9, 10 };// sorted or rotated hone chaiye
        System.out.println(fundPair(arr, 19));
    }
}
