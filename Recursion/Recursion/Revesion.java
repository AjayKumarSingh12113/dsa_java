package Recursion;
public class Revesion {
    public static int sum(int n){
        if (n == 1) {
            return 1;
        }
        return n + sum(n-1);
    }

    public static int fibonacci(int n){
        if (n == 0 || n ==1 ) {
            return n;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }

    public static boolean issorted(int arr[], int i){
        if (i == arr.length-1) {
            return true;
        }
       if (arr[i] < arr[i+1]) {
         return issorted(arr, i+1);
       }else{
        return false;
       }
       
    }
    public static int first_occr(int arr[], int i, int k){
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == k) {
            return i;
        }
        return first_occr(arr, i+1, k);
    }
    public static int lastoccur(int arr[] , int i, int k){
        if (i == arr.length) {
            return -1;
        }
        int last = lastoccur(arr, i+1, k);
        if (last == -1 && arr[i]== k) {
            return i;
        }
        return last;
    }
    public static int powern(int x, int n){
        if (n == 0) {
            return 1;
        }
        return x * powern(x, n-1);
    }
    public static int optimisedPower(int a , int n){
        if (n == 0) {
            return 1;
        }
        int halfpow = optimisedPower(a, n/2);
        int halfpowersq = halfpow *halfpow ;
        if (n % 2 != 0 ) {
            halfpowersq = a * halfpowersq;
        }
        return halfpowersq;
    }

    public static void mergeSort(int arr[], int si, int ei){
        if (si >= ei) {
            return ;
        }

        int mid = si + (ei - si)/2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid+1, ei);
        merge(arr, si, mid , ei);
    }

    public static void merge(int arr[], int si, int mid , int ei){
        int temp[] = new int[ei-si+1];
        int i = si;
        int j = mid+1;
        int k = 0;

        while( i<= mid && j <= ei){
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];

            }else{
                temp[k++] = arr[j++];
            }
        }

        while (i <= mid) {
            temp[k++]=arr[i++];
        }

        while (j <= ei) {
            temp[k++]=arr[j++];
        }

        for (int k2 = 0, m =si ; k2 < temp.length; k2++ , m++) {
            arr[m] = temp[k2];
        }
    }
    public static void main(String[] args) {
        System.out.println(sum(5));
        System.out.println(fibonacci(5));
        int arr[] = {1,3,64,54,343,4,9,6,4};
        System.out.println(issorted(arr, 0));
        System.out.println(first_occr(arr, 0, 14));
        System.out.println(lastoccur(arr, 0, 4));
        System.out.println(powern(2, 10));
        System.out.println(optimisedPower(2, 10));
        mergeSort(arr, 0, arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
