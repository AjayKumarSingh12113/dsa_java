package Dp.knapsack;

public class ZeroOneKnapsack {
    //Recursive ways
    public static int knapSack(int val[] , int wt[], int W, int n){
        if (W == 0 || n == 0) {
            return 0;
        }
        // valid
        if (wt[n-1] <= W) {
            // include
            int profitl = val[n-1] + knapSack(val, wt, W-wt[n-1], n-1);
            // exclude
            int profit2 = knapSack(val, wt, W, n-1);
            return Math.max(profitl, profit2);
        }else{
            return knapSack(val, wt, W, n-1);
        }
    }
    // Dp ways
    
    public static void main(String[] args) {
        int val[] ={15,14,10,45,30};
        int wt[] ={2,5,1,3,4};
        int W =7;
        System.out.println(knapSack(val, wt, W, val.length));
        
    }
}
