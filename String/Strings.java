package String;
public class Strings {
    public static boolean palindrome(String str) {
        int n = str.length();
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                return false;

            }

        }
        return true;
    }

    public static boolean ispalindrome(String s) {
       

        s = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        // for (int i = 0; i < s.length(); i++) {
        //     System.out.print(s.charAt(i));
        // }
        int st = 0;
        int end = s.length() - 1;
        while (st < end) {
            if (s.charAt(st) != s.charAt(end)) {
                return false;

            }
            st++;
            end--;

        }
        return true;
    }

    
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(ispalindrome(s));
      
    }
}
