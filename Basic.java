import java.util.Scanner;

class Basic {
    public static int sum(int a, int b) {
        return a + b;
    }

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;

        }
        return fact;
    }

    public static int binomialcoff(int n, int r) {
        return (factorial(n) / (factorial(n - r) * factorial(r)));

    }
    // prime with function 
    public static boolean primes(int n) {
        boolean isprime = true;
        if (n == 2) {
            return true;

        } else {

            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isprime = false;

                }
            }
        }
        return isprime;
    }
    // range in prime number
    public static void rangeinprime(int n) {
        for (int i = 2; i <= n; i++) {
            if (primes(i) == true) {
                System.out.println(i);

            }
        }
    }
    // bin to dec
    public static int binNum(int num) {
        int pow = 0;
        int dec = 0;
        while (num > 0) {
            int lastdigit = num % 10;
            dec = dec + (lastdigit * (int) Math.pow(2, pow));
            pow++;
            num = num / 10;
        }
        //System.out.println(dec);
        return dec;
    }

    public static void dectobin(int n) {
        int pow = 0;
        int bin = 0;
        while (n > 0) {
            int rem = n % 2;
            bin = bin + (rem * (int) Math.pow(10, pow));
            pow++;
            n = n / 2;
        }
        System.out.println(bin);
    }

    public static void main(String args[]) {
        int sum1 = sum(2, 3);
        System.out.println(sum1);
        System.out.println(factorial(5));
        System.out.println(binomialcoff(5, sum1));
        System.out.println(primes(3));
        System.out.println(primes(2));
        System.out.println(primes(4));
        System.out.println(primes(10));
        //rangeinprime(8);
        System.out.println(binNum(1010));
        dectobin(255);
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // boolean isprime = true;
        // if (n==2) {
        //     System.out.println("numver is prime");
        // } else {
        //     for (int i = 2; i <= n - 1; i++) {// Math.sqrt(n)
        //         if (n % i == 0) {
        //             isprime = false;

        //         }
        //     }
        //     if (isprime == true) {
        //         System.out.println("numver is prime");
        //     } else {
        //         System.out.println("not prime");
        //     }
        // }
        
        
    }
}