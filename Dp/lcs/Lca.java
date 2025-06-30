package Dp.lcs;

public class Lca {
    public static int lca(String str1, String str2, int n, int m){
        if(n==0 || m==0){
            return 0;
        }
        if (str1.charAt(n-1)==str2.charAt(m-1)) {
            return lca(str1, str2, n-1, m-1)+1;
        }else{
            int ans1 = lca(str1, str2, n-1, m);
            int ans2 = lca(str1, str2, n, m-1);
            return Math.max(ans1, ans2);
        }
    }
    public static int lca2(String str1, String str2, int n, int m , int dp[][]){
        if(n==0 || m==0){
            return 0;
        }
        if (dp[n][m] != -1) {
            return dp[n][m];
        }
        if (str1.charAt(n-1)==str2.charAt(m-1)) {
            return dp[n][m]= lca(str1, str2, n-1, m-1)+1;
        }else{
            int ans1 = lca(str1, str2, n-1, m);
            int ans2 = lca(str1, str2, n, m-1);
            return dp[n][m]= Math.max(ans1, ans2);
        }
    }
    public static void main(String[] args) {
        String str1 = "abcdge";
        String str2 = "abedg";
        System.out.println(lca(str1, str2, str1.length(), str2.length()));
        int n = str1.length();
        int m = str2.length();
        int dp[][]= new int[n+1][m+1];

        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j] = -1;
            }
        }
        System.out.println(lca2(str1,str2,n,m,dp));
    }
}
