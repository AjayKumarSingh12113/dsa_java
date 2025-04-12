import java.util.Arrays;
public class RemoveDuplicates {
    public static void removedup(String str, int idx, StringBuilder newStr, boolean map[]) {
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }
        char currchar = str.charAt(idx);
        if (map[currchar - 'a'] == true) {
            removedup(str, idx + 1, newStr, map);

        } else {
            map[currchar - 'a'] = true;
            removedup(str, idx+1, newStr.append(currchar), map);
        }
    }

    public static String removeduplicate(String str) {
        StringBuilder newStr = new StringBuilder();
        boolean[] map = new boolean[26]; // To track characters (a-z)

        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);

            if (!map[currChar - 'a']) {
                map[currChar - 'a'] = true;
                newStr.append(currChar);
            }
        }
        //lexicographical order "abcd"
        char[] charArray = newStr.toString().toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }

    public static void main(String[] args) {
        
        removedup(new String("appnnacollege"), 0, new StringBuilder(""), new boolean[26]);
        String str = "appnnacollege";
        String str2 = removeduplicate(str);
        for (int i = 0; i < str2.length(); i++) {
            System.out.print(str2.charAt(i)+" ");
            
        }
        
    }
}
