package Dp.lcs;

public class LongestCommonSubstring {
    public static int lc_substring(String st1 ,String st2){
        int n = st1.length();
        int m =st2.length();

        int dp[][] = new int[n+1][m+1];
        int ans = 0;
        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < m+1; j++) {
                if (st1.charAt(i-1)== st2.charAt(j-1)) {
                    dp[i][j] = dp[i-1][j-1]+1;
                    ans = Math.max(ans, dp[i][j]);
                }else{
                    dp[i][j]=0;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String st1 = "ABCDE";
        String st2 = "ABCdE";
        System.out.println(lc_substring(st1, st2));
    }
}
