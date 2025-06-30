package BitManupulation.Stack;

import java.util.Stack;

public class NextGreater {
   
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
        int arr[] = { 6, 8, 0, 1, 3 };
        int arr2[] = nextgreter(arr);
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
        
    }
}
