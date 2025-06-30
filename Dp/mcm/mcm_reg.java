package Dp.mcm;

import java.util.Arrays;

public class mcm_reg {
    public static int mcmreg(int arr[],int i, int j){
        if (i == j) {
            return 0;
        }
        int ans = Integer.MAX_VALUE;
        for (int k = i; k <= j-1; k++) {
            int cost1 = mcmreg(arr, i, k);//arr[i-1]+arr[k]
            int cost2 = mcmreg(arr, k+1, j);
            int cost3 = arr[i-1]* arr[k]*arr[j];
            int finalcost = cost1+cost2+cost3;
            ans = Math.min(ans, finalcost);
        }
        return ans;
    }
    public static int mcm_Meo(int arr[],int i, int j, int dp[][]){
        if (i == j) {
            return 0;
        }
        if (dp[i][j] != -1) {
            return dp[i][j];
        }
        int ans = Integer.MAX_VALUE;
        for (int k = i; k <= j-1; k++) {
            int cost1 = mcm_Meo(arr, i, k,dp);//arr[i-1]+arr[k]
            int cost2 = mcm_Meo(arr, k+1, j,dp);
            int cost3 = arr[i-1]* arr[k]*arr[j];
            int finalcost = cost1+cost2+cost3;
            ans = Math.min(ans, finalcost);
        }
        return dp[i][j]=ans;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,3};
        
        System.out.println(mcmreg(arr, 1, arr.length-1));
        int n = arr.length;
        int dp[][] = new int[n][n];
        for (int i = 0; i < dp.length; i++) {
            Arrays.fill(dp[i], -1);
        }
        System.out.println(mcm_Meo(arr, 1, n-1, dp));
    }
}
