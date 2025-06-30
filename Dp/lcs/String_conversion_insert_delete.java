package Dp.lcs;

public class String_conversion_insert_delete {
    public static int lca(String st1, String st2){
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
    public static void stringcov(String st1,String st2){
        int n = st1.length();
        int m = st2.length();
        int lca1 =lca(st1,st2);
        System.out.println("deleted operation : " + (n-lca1));
        System.out.println("inserted operation : " + (m-lca1));
    }
    public static void main(String[] args) {
        String st1 = "abcdef";
        String st2 = "aceg";
        stringcov(st1,st2);
    }
}
