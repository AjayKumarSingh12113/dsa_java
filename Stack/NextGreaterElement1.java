package Stack;
import java.util.*;

public class NextGreaterElement1 {
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] nextGreaterForNums2 = nextgreter(nums2);
        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            result[i] = -1;
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    result[i] = nextGreaterForNums2[j];
                    break;
                }
            }
        }
        return result;

    }

    public static int[] nextgreter(int arr[]) {
        int[] NextGreat = new int[arr.length];
        Stack<Integer> s = new Stack<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();

            }
            if (s.isEmpty()) {
                NextGreat[i] = -1;

            } else {
                NextGreat[i] = arr[s.peek()];
            }
            s.push(i);
        }
        return NextGreat;

    }
    public static void main(String[] args) {
        
    }
}
