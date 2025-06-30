package Dp.lcs;

public class LcaTabulation {
    public static int lcaTab(String st1, String st2){
        int n = st1.length();
        int m = st2.length();

        int dp[][] = new int[n+1][m+1];

        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if (st1.charAt(i-1)==st2.charAt(j-1)) {
                    dp[i][j]=dp[i-1][j-1]+1;
                }else{
                    int ans1 = dp[i-1][j];
                    int ans2 = dp[i][j-1];
                    dp[i][j] = Math.max(ans1, ans2);
                }
            }
        }
        return dp[n][m];
    }
    public static void main(String[] args) {
        String str1 = "abcde";
        String str2 = "ace";
        System.out.println(lcaTab(str1, str2));
    }
}
