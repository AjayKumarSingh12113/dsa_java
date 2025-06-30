package String;

public class ReverseWordInString {
    public static String reverseWords(String s) {
        String[] arr = s.split("\\s+");// {"the","sky","is","blue"}
        StringBuilder sd = new StringBuilder("");
        for (int i = arr.length - 1; i >= 0; i--) {
            sd.append(arr[i] + " ");// "blue _is _ sky _ the _"
        }
        String ans = sd.toString();
        return ans.trim();// remove leading space and trailing space

    }
    public static void main(String[] args) {
        
    }
}
