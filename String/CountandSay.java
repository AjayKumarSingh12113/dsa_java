package String;

public class CountandSay {
    public static String countAndSay(int n) {
        // base
        if (n == 1) {
            return "1";
        }
        String say = countAndSay(n - 1);
        // processing --find count and character
        String result = new String("");
        for (int i = 0; i < say.length(); i++) {
            char ch = say.charAt(i);
            
            int count = 1;
            // for count
            while (i < say.length() - 1 && say.charAt(i) == say.charAt(i + 1)) {
                count++;
                i++;
            }
            result += (count + "") + (String.valueOf(ch));

        }
        return result;

    }

    public static void main(String[] args) {

    }
}
