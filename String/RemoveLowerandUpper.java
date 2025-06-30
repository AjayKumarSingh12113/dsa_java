package String;

public class RemoveLowerandUpper {
    public static String makeGood(String s) {
        StringBuilder result = new StringBuilder("");
        for (int i = 0; i < s.length(); i++) {// jab 0-1 es time to result me idex hi nhi result 1 se ho 
            if ( result.length() > 0// result.length() > 0 ensures that there is at least one character in result
                                   // before performing this operation.
                    &&(result.charAt(result.length() - 1) - 32 == s.charAt(i) ||
                    result.charAt(result.length() - 1) + 32 == s.charAt(i))) {
                result.deleteCharAt(result.length() - 1);

            } else {
                result.append(s.charAt(i));
            }

        }
        return result.toString();
        
    }

    public static void main(String[] args) {
        String st = "leEeetcode";
        String st1=makeGood(st);
        for (int i = 0; i < st1.length(); i++) {
            System.out.print(st1.charAt(i)+" ");
        }
        
    }
}
