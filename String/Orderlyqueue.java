package String;

import java.util.Arrays;

public class Orderlyqueue {
    public static String orderlyQueue(String s, int k) {
        if (k > 1) {
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sortedString = new String(charArray);
            return sortedString;

        }
        String result = s;
        int n = s.length();
        for (int i = 0; i <= n - 1; i++) {
            String temp = s.substring(i) + s.substring(0, i);
            if (temp.compareTo(result) < 0) {
                result = temp;
            }
        }
        return result;

    }

    public static void main(String[] args) {

    }
}
