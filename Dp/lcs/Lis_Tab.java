package Dp.lcs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

public class Lis_Tab {
    public static int lcs(int arr1[],int arr2[]){
        int n = arr1.length;
        int m = arr2.length;
        int dp[][] = new int[n+1][m+1];
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if (arr1[i-1] == arr2[j-1]) {
                    dp[i][j]= dp[i-1][j-1]+1;
                }else{
                    int ans1 = dp[i-1][j];
                    int ans2 = dp[i][j-1];
                    dp[i][j] = Math.max(ans1, ans2);
                }
            }
        }
        return dp[n][m];
    }
    public static int lis(int arr1[]){
        HashSet<Integer> set = new HashSet<>();// no requirement of sorting in ascending
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }
        int arr2[] = new int[set.size()];
        int i=0;
        for (int ele : set) {
            arr2[i]=ele;
            i++;
        }

        return lcs(arr1,arr2);
    }
    public static int lis2(int arr1[]){
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }
        int arr2[] = new int[set.size()];
        int i=0;
        for (int ele : set) {
            arr2[i]=ele;
            i++;
        }
        Arrays.sort(arr2);

        return lcs(arr1,arr2);
    }
    public static void main(String[] args) {
        int arr1[] = {50,3,10,7,40,80};
        System.out.println(lis(arr1));
        System.out.println(lis2(arr1));
    }
}
