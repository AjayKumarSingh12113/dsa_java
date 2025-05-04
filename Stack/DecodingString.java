package Stack;

import java.util.Stack;

public class DecodingString {
    public static String decodeString(String s) {
        Stack<Integer> numStack = new Stack<>();
        Stack<String> mainStack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= '0' && ch <= '9') {
                int num = 0;
                while (s.length() > 0 && s.charAt(i) > 0 && s.charAt(i) <= '9') {
                    num = num * 10 + s.charAt(i) - '0';// integer me convert 
                    i++;
                }
                i--;
                numStack.push(num);

            } else if (ch != ']') {
                mainStack.push(ch + "");
            } else {
                // jaise hi ] bracket mila 
                String str = "";
                while (!mainStack.peek().equals("[")) {
                    str = mainStack.pop() + str;//str concate kr ale ki traf
                }
                mainStack.pop(); // remove [ 
                int repitationNumber = numStack.pop();
                StringBuilder sb = new StringBuilder("");
                while (repitationNumber > 0) {
                    sb.append(str);
                    repitationNumber--;
                }
                mainStack.push(sb.toString());
            }
        }
        StringBuilder ans = new StringBuilder();

        while (!mainStack.isEmpty()) {
            ans.insert(0, mainStack.pop());
        }
        return ans.toString();
        
    }

    public static void main(String[] args) {
        String str = "2[av2[avb]]";
        String st = decodeString(str);
        for (int i = 0; i < st.length(); i++) {
            System.out.print(st.charAt(i)+" ");
        }
        
    }
}
