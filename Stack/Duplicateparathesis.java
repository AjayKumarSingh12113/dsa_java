package Stack;

import java.util.Stack;

public class Duplicateparathesis {
    public static boolean isDuplicate(String str) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // closing
            if (ch == ')') {
                int count = 0;
                while (st.peek() != '(') {
                    st.pop();
                    count++;
                }
                if (count <= 0) {
                    return true;
                } else {
                    st.pop();
                }
            } else {
                st.push(ch);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        
    }
}
