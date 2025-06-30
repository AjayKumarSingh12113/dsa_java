package Dp.knapsack;

public class Coinchange {
    public static int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int dp[][] = new int[n+1][amount+1];
        for(int i=0; i<dp.length; i++){
            dp[i][0]=1;
        }
        for (int idx = 1; idx <dp[0].length; idx++) {
            dp[0][idx]=0;
        }
        for(int i=1;i<n+1; i++){
            for(int j=1; j<amount+1; j++){
                if(coins[i-1]<=j){
                    dp[i][j]= dp[i-1][j] + dp[i][j-coins[i-1]];
                }else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[n][amount];
    }
    public static void main(String[] args) {
        //int coins[] = {2,5,3,6};
        int coins[] = {1,2,5};
        int sum =11;
        System.out.println(coinChange(coins, sum));
    }
}
