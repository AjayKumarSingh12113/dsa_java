package Recursion;
public class Fibonacci {
    public static int fibnacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int fin = fibnacci(n - 1) + fibnacci(n - 2);
        return fin;
    }

    public static boolean issorted(int arr[], int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return issorted(arr, i + 1);
    }

    public static int firstOcc(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return firstOcc(arr, key, i + 1);

    }

    public static int lastOcc(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        int isFound = lastOcc(arr, key, i + 1); 
        if (isFound == -1 && arr[i] == key) {// yeh last index se piche ak hi bar chalega isfound true ralega fr 
            // uska false kabi true hoga hi nhi 
            return i;
        }
        return isFound;

    }
    
    
    public static void main(String[] args) {
        // System.out.println(fibnacci(2));
        // System.out.println(fibnacci(3));
        // System.out.println(fibnacci(4));
        int arr[] = { 1, 5, 3, 4,0,423,44,2,656,777,9,5,2 };
        System.out.println(issorted(arr, 0));
        System.out.println(firstOcc(arr, 2, 0));
        System.out.println(lastOcc(arr, 5, 0));

        
        
    }
}
