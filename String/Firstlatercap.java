package String;
public class Firstlatercap {
    public static String capitalizeTitles(String title) {
        StringBuilder sc = new StringBuilder(""); 
        for (int i = 0; i < title.length(); i++) {
            sc.append(Character.toLowerCase(title.charAt(i)));
        }
        StringBuilder mt = new StringBuilder("");
        char ch = Character.toUpperCase(sc.charAt(0));
        mt.append(ch);
        for (int i = 1; i < sc.length(); i++) {
            
            if (sc.charAt(i) == ' ' && i < sc.length() - 1) {
                
                mt.append(sc.charAt(i));
                i++;
                mt.append(Character.toUpperCase(sc.charAt(i)));
            } else {
                mt.append(sc.charAt(i));
            }
        }
        return mt.toString();
        
    }
    public static void main(String[] args) {
        String title = "First leTTeR of EACH Word";
        System.out.println(capitalizeTitles(title));
    }
}
