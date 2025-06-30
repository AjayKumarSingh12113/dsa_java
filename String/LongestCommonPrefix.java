package String;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        String ans = strs[0];
        for(int i=1; i<strs.length;i++){
            ans = helper(ans,strs[i]);
        }
        return ans;
    }
    public static String helper(String s1, String s2){
        int n = Math.min(s1.length(),s2.length());
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n;i++){
            if(s1.charAt(i)==s2.charAt(i)){
                sb.append(s1.charAt(i));
            }else{
                break;
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        
    }
}
