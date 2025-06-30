package String;

public class ConsecutiveCharacter {
    // Input:s="leetcode"Output:2 Explanation:
    // The substring"ee"
    // is of length 2
    // with the character'e'only.
    public static int maxPower(String s) {
        int count = 1;
        int max = 1;
        int st = 0;
        int c = 1;
        while (c < s.length()) {
            if (s.charAt(st) == s.charAt(c)) {
                count++;
            } else {
                max = Math.max(max, count);
                count = 1;
            }
            st++;
            c++;
        }
        max = Math.max(max, count);
        return max;

    }
    public static void main(String[] args) {
        
    }
}
