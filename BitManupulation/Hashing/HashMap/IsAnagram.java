package BitManupulation.Hashing.HashMap;

import java.util.HashMap;

public class IsAnagram {

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0; i<s.length();i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
        }
        for(int i=0; i<t.length();i++){
            char ch = t.charAt(i);
            if(map.get(ch) != null ){
                if(map.get(ch)==1){
                    map.remove(ch);
                }else{
                    map.put(ch,map.get(ch)-1);
                }
            }else{
                return false;
            }
        }
        return map.isEmpty();
    }
    public static void main(String[] args) {
        
    }
}