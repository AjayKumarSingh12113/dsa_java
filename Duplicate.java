public class Duplicate{
    public static String removeduplicate(String str){
        boolean freq[] = new boolean[26];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int idx = (int)ch-'a';
            if (freq[idx]==false) {
                sb.append(ch);
                freq[idx]=true;
            }
            
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "aabcddzmm";
        String str2 =removeduplicate(str);
        for (int i = 0; i < str2.length(); i++) {
            System.out.print(str2.charAt(i)+" ");
        }
        
    }
}