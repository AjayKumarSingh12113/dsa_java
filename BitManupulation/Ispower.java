package BitManupulation;

public class Ispower {
    public static boolean isPower(int n){
        return (n & (n-1)) == 0 ;
    }
    public static void main(String[] args) {
        System.out.println(isPower(7));
        System.out.println(isPower(32));
        System.out.println(isPower(24));
        System.out.println(isPower(16));
    }
}
