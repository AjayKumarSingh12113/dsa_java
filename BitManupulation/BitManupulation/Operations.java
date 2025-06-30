package BitManupulation.BitManupulation;

public class Operations {
    public static int getithbit(int n, int i){
        int bitmask = 1<<i;
        if ((n & bitmask) == 0) {
            return 0;
        }
        else {
             return 1;
        }
    }

    public static int setIthbit(int n, int i){
        int bitmask = 1<<i;
        return n | bitmask;
    }

    public static int clearithbit(int n,int i){
        int bitmask = ~(1<<i);
        return n & bitmask;
    }
    public static int updateIthbit(int n, int i, int val){
        n = clearithbit(n, i);
        int bitmask = val<<i;
        return n | bitmask;
    }
    public static int updateithbit2(int n,int i, int val){
        if (val == 0) {
            return clearithbit(n, i);
        }else{
            return setIthbit(n, i);
        }
    }

    public static int clearlastIbit(int n, int i){
        int bitmask = (~0)<<i;
        return n & bitmask;
    }

    public static int clearinRange(int n, int i,int j){
        int a = (~0)<<(j+1);
        int b = (i<<i )-1;
        int bitmask = a | b;
        return n & bitmask;
    }
    public static void main(String[] args) {
        System.out.println(getithbit(10, 3));
        System.out.println(setIthbit(10, 2));
        System.out.println(clearithbit(10, 1));
        System.out.println(updateIthbit(10, 2, 1));
        System.out.println(updateIthbit(10, 1, 0));
        System.out.println(updateithbit2(10, 1, 0));
        System.out.println(clearlastIbit(15, 2));
        System.out.println(clearinRange(10, 2, 4));
        
    }
}
