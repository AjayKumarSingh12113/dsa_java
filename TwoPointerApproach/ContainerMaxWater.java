package BitManupulation.TwoPointerApproach;
public class ContainerMaxWater {
     public static int maxArea(int[] height) {
        // 2pointer approach 
        int maxarea = 0;
        int lp= 0;
        int rp=height.length-1;


        while(lp<rp){
            int ht = Math.min(height[lp],height[rp]);
            int wd = rp-lp;
            int currarea = ht*wd;
            maxarea = Math.max(maxarea, currarea);
            if(height[lp]<height[rp]){
                lp++;
            }else{
                rp--;
            }
        }
        return maxarea;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        System.out.println(maxArea(arr));
        
    }
    
}
