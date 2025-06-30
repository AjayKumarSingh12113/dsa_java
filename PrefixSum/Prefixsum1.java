package PrefixSum;

public class Prefixsum1 {
    public static int[] prefixsumwitharray(int arr[]){
        int pref[] = new int[arr.length];
        pref[0]=arr[0];
        for (int i = 1; i < arr.length; i++) {
            pref[i]=pref[i-1]+arr[i];
        }
        return pref;
    }
    public static void prefixsumwithoutNewArray(int arr[]){
        for (int i = 1; i < arr.length; i++) {
            //arr[i]=arr[i-1]+arr[i];
            arr[i] += arr[i-1];
        }
    
    }
    public static int findtotalsum(int arr[]){
        int sum =0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
    public static boolean equalSumpartition(int arr[]){
        int totalsum = findtotalsum(arr);
        int prefixsum =0;
        for (int i = 0; i < arr.length; i++) {
            prefixsum += arr[i];
            int sufficsum = totalsum-prefixsum;
            if (sufficsum == prefixsum) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int result[] = prefixsumwitharray(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+" ");
        }
        prefixsumwithoutNewArray(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println(equalSumpartition(arr));
    }
}
