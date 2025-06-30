package Recursion;
public class Powerxn {
    public static int powers(int x, int n) {//O(n)
        if (n == 0) {
            return 1;
        }
        int pofn = powers(x, n - 1);
        int px = x * pofn;
        return px;
    }

    public static int optimizedPower(int x, int n) {//log(n)
        if (n == 0) {
            return 1;
        }
        // halfpowered = optimizedPower(x, n / 2)*optimizedPower(x, n / 2);
        int halfPower= optimizedPower(x, n / 2);
        int halfPowerSq = halfPower * halfPower;
        if (n % 2 != 0) {//odd
            halfPowerSq = x * halfPowerSq;
        }
        return halfPowerSq;
    }

    public static void main(String[] args) {
        System.out.println(powers(2, 5));
       System.out.println(optimizedPower(2, 5));
        
    }
}
