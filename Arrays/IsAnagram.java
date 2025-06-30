package Arrays;

public class IsAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int freq1[] = new int[26];
        int freq2[] = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int idx = (int) (ch - 'a');
            freq1[idx] = freq1[idx] + 1;
        }
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            int idx = (int) (ch - 'a');
            freq2[idx] = freq2[idx] + 1;
        }

        

        return java.util.Arrays.equals(freq1, freq2);

    }
    public static void main(String[] args) {
        
    }
}
