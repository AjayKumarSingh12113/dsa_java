package Arrays;
public class Rainwaterarea {
    public static int rainwater(int height[]) {
        int n = height.length;
        int width = 1;
        //left max boundary(auxilary arrray use)
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < leftMax.length; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);

        }

        // right max boundary
        int rightMax[] = new int[n];
        rightMax[n - 1] = height[n - 1];
        for (int i = n-2; i >=0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }
        // loop
        int trapwater = 0;
        for (int i = 0; i < height.length; i++) {
            // waterlevel=min(left max,right max)
            int waterlevel = Math.min(leftMax[i], rightMax[i]);
            // trapwater = waterlevel-height[i]
            trapwater += (waterlevel - height[i]) * width;
        }
        return trapwater;
        
        
    }
    public static void main(String[] args) {
        //int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        int height[] = { 4, 2, 0, 3, 2, 5 };
        System.out.println(rainwater(height));

    }
}
