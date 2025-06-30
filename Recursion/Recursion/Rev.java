package Recursion;
public class Rev {
    public static void binaryString(int n , int lp , String str){
        if (n ==0) {
            System.out.println(str);
            return ;
        }
        if (lp == 0) {
            binaryString(n-1, 0, str+"0");
            binaryString(n-1, 1, str+"1");
        }else{
            binaryString(n-1, 0, str+"0");
        }
    }
    public static int  friendpairing(int n){
        if (n==1 || n==2) {
            return 1;
        }
        return friendpairing(n-1)+(friendpairing(n-2)*(n-1));
    }
    public static void removedup(String str,int i,StringBuilder s,boolean map[]){
        if (i == str.length()) {
            System.out.println(s);
            return;
        }
        int idx = str.charAt(i)-'a';
        if (map[idx] == true) {
            removedup(str,i+1, s,map);
        }else{
            map[idx] = true;
            removedup(str,i+1,s.append(str.charAt(i)),map);
        }
    }
    public static int tillingpbm(int n){
        if (n==0 || n==1) {
            return 1;
        }
        return tillingpbm(n-1)+tillingpbm(n-2);
    }
    public static int powern(int x, int n){
        if (n == 0) {
            return 1;
        }
        return x*powern(x, n-1);
    }
    public static int power_optimized(int x , int n){
        if (n ==0) {
            return 1;
        }
        int halfpw = power_optimized(x, n/2);
        int sqhalftpw = halfpw*halfpw;

        if (n %2 != 0) {
            return x*sqhalftpw;
        }
        return sqhalftpw;
    }
    public static int lastoccur(int arr[],int i , int key){
        if (i == arr.length) {
            return -1;
        }
        int lastposition = lastoccur(arr, i+1, key);
        if (lastposition == -1 && arr[i] == key ) {
            return i;
        }
        return lastposition;
    }
    public static int first_occr (int arr[],int i, int key){
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return first_occr(arr, i+1, key);
    }
    public static boolean arraysorted(int arr[] , int i){
        if(i == arr.length-1){
            return true;
        }
        if (arr[i]>arr[i+1]) {
            return false;
        }
        return arraysorted(arr, i+1);
    }
    public static int printsum(int n){
        if (n==0) {
            return 0;
        }
        return n+printsum(n-1);//12345
    }
    public static void printInc(int n){
        if (n==0) {
            return ;
        }
        printInc(n-1);
        System.out.print(n+" ");
    }
    public static int fibonacci(int n){
        if (n==0 || n==1) {
            return n;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }
    public static void main(String[] args) {
        binaryString(3, 0, "");
        System.out.println(friendpairing(3));;
        boolean map[] = new boolean[26];
        removedup("appnnacollege", 0, new StringBuilder(""),map);
        System.out.println(tillingpbm(3));
        System.out.println(powern(5, 3));
        System.out.println(power_optimized(5, 3));
        int arr[] = {3,4,3,3,64,23,6,3,6,4,3,46,78,4};
        System.out.println(lastoccur(arr, 0, 9));
        System.out.println(first_occr(arr, 0, 6));
        int array[] = {1,2,9,4,5,6};
        System.out.println(arraysorted(array, 0));
        System.out.println(printsum(5));
        printInc(10);
        System.out.println();
        System.out.println(fibonacci(6));
    }
    
}
