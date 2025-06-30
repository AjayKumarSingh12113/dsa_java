package String;
public class Stringbuilder {
    public static String firstlatteruppercase(String math) {
        StringBuilder mt = new StringBuilder("");
        char ch = Character.toUpperCase(math.charAt(0));
        mt.append(ch);
        for (int i = 1; i < math.length(); i++) {
            if (math.charAt(i) == ' ' && i < math.length() - 1) {
                mt.append(math.charAt(i));
                i++;
                mt.append(Character.toUpperCase(math.charAt(i)));
            } else {
                mt.append(math.charAt(i));
            }
        }
        return mt.toString();
    }
    public static void main(String args[]) {
        // StringBuilder sc = new StringBuilder("ajay");
        // for (char i = 'a'; i < 'z'; i++) {
        //     sc.append(i);
        // }
        // System.out.println(sc);
        // System.out.println(sc.length());
        String math = "hi, i am ajay";
        System.out.print(firstlatteruppercase(math));
       
    }
}
