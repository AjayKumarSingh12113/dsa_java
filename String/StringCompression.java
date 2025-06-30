package String;

public class StringCompression {
    public static int compress(char[] chars) {
        int n = chars.length;
        int i = 0;
        int index = 0;
        while (i < n) {
            char curr_char = chars[i];
            int count = 0;
            while (i < n && chars[i] == curr_char) {// aaa tak aa gya 
                count++;
                i++;
            }
            // ab gme original array me dalna hoga 
            chars[index] = curr_char;
            index++;
            if (count > 1) {
                String charone = count + "";
                for (int j = 0; j < charone.length(); j++) {
                    chars[index] = charone.charAt(j);
                    index++;

                }
            }
        }
        return index;
        
    }

    public static void main(String[] args) {
        char ch[] = { 'a','a', 'b','b', 'c','c','c' }; 
        System.out.println(compress(ch));
        
    }
}
