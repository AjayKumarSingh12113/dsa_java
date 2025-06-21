package BitManupulation;

public class EvenOdd {
    public static void checkOddeven(int n){
        int bitmask =1;
        if ((n & bitmask) == 0) {
            System.out.println("even number");
        }else{
            System.out.println("odd number");
        }
    }
    public static void main(String[] args) {
        checkOddeven(2);
        checkOddeven(5);
        checkOddeven(99);
    }
}
