package BitManupulation.Stack;
import java.util.*;

public class ReverseArrString {
    public static void reverseString(char[] s) {
        Stack<Character> a = new Stack<>();
        int i = 0;
        while (i < s.length) {
            a.push(s[i]);
            i++;
        }
        i = 0;
        while (!a.isEmpty()) {
            s[i] = a.pop();
            i++;
        }

    }
    public static void main(String[] args) {
        
    }
}
