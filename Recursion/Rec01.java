public class Rec01 {
    // deceasing way 
    public static void printD(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n + " ");
        printD(n - 1);
    }
    // Increasing way 1 to n
    public static void printInc(int n) {
        if (n == 0) {
            return;
        }
        printInc(n - 1);
        System.out.print(n + " ");

    }
     //factorial 
    public static int factorial(int n) {
        if (n==0) {
            return 1;
        }
        int fn = n * factorial(n - 1);
        return fn;
    }

    public static int sumOfn(int n) {
        if (n==1) {
            return 1;
        }
        int sum = n + sumOfn(n-1);
        return sum;
    }
    public static void main(String[] args) {
        printD(10);
        System.out.println();
        printInc(10);
        System.out.println(factorial(5));
        System.out.println();
        System.out.println(sumOfn(5));
    }
}
