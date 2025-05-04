package Stack;

import java.util.Stack;

public class ReverseString {
    public static String reverse(String str) {
        Stack<Character> s = new Stack<>();
        int i = 0;
        while (i < str.length()) {
            s.push(str.charAt(i));
            i++;
        }
        StringBuilder result = new StringBuilder("");
        while (!s.isEmpty()) {
            result.append(s.pop());

        }
        return result.toString();
    }


    public static void main(String[] args) {
        String str = "ajalsd";
        System.out.println(reverse(str));
    }
}
