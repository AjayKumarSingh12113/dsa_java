package Backtracking;

public class Permutation {
    public static Boolean findone(String str, String str2) {
        String mt = new String("");
        findpermutation(str, mt);
        for (int i = 0; i < str.length(); i++) {
            if (mt.charAt(i) == str2.charAt(i)) {
                return true;
            }
        }
        return false;
    }
    public static void findpermutation(String str, String ans) {
        // base 
        if (str.length()==0) {
            System.out.println(ans);
            return;
        }
        // recussive
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            //orginal me ith ko hatane ke we use substring
            String mtstring = str.substring(0, i) + str.substring(i + 1);
            findpermutation(mtstring, ans+curr);
        }
    }

     
    public static void main(String[] args) {
        String str = "abc";
        findpermutation(str, new String(""));
        //findone("eidbaooo", "ab");
    }
}
