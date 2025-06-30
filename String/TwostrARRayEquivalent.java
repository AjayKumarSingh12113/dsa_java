package String;

import java.util.Objects;

public class TwostrARRayEquivalent {
    // approach ist
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder st1 = new StringBuilder("");
        StringBuilder st2 = new StringBuilder("");
        for (int i = 0; i < word1.length; i++) {
            st1.append(word1[i]);
        }
        for (int i = 0; i < word2.length; i++) {
            st2.append(word2[i]);
        }
        return Objects.equals(st1.toString(), st2.toString());

    }
    public static void main(String[] args) {
        
    }
}
