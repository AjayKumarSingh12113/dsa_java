package Stack;

import java.util.Stack;

public class RemoveDuplicateLetters {
//     Input: s = "bcabc"
// Output: "abc"
// Example 2:

// Input: s = "cbacdcbc"
// Output: "acdb"
    public static String removeDuplicateLetters(String s) {
        int lastIndex[] = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int idx = (int) (ch - 'a');
            lastIndex[idx] = i;

        }
        boolean present[] = new boolean[26];
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int idx = (int) (ch - 'a');
            if (present[idx] == false) {
                while (!st.isEmpty() && st.peek() > ch && lastIndex[(int) st.peek() - 'a'] > i) {
                    present[(int) st.peek() - 'a'] = false;
                    st.pop();
                }
                st.push(ch);
                present[idx] = true;
            }
        }
        StringBuilder newOne = new StringBuilder("");
        while (!st.isEmpty()) {
            newOne.append(st.pop());
        }
        return newOne.reverse().toString();

    }

    public static void main(String[] args) {
        String s = "cbacdcbc";// "bcabc";
        String sto = removeDuplicateLetters(s);
        for (int i = 0; i < sto.length(); i++) {
            System.out.print(sto.charAt(i)+" ");
            
        }
        
    }
}
