package String;

public class IntegerToroman {
    public static String intToRoman(int num) {
        int val[] = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        String sys[] = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
        String st = new String("");
        for (int i = 0; i < 13; i++) {
            if (num == 0) {
                break;
            }
            int times = num / val[i];
            // to esko add kr do
            while (times-- > 0) {
                st += sys[i];

            }
            num = num % val[i];
        }
        return st;

    }
    public static void main(String[] args) {
        
    }
}
