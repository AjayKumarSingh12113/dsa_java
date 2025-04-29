package ArrayList;

public class Container_with_maxwater {
    //brute force
    public static int max_water(int height[]){
        int area =0;
        for (int i = 0; i < height.length-1; i++) {
            for (int j = i+1; j < height.length; j++) {
                int width = j-i;
                int heights = Math.min(height[i], height[j]);
                area = Math.max(area,width*heights);
            }
        }
        return area;
    }

    //brute force 
    public static int max_water2(int height[]){
        int st = 0, end = height.length-1;
        int maxw = 0;
        while(st <= end){
            int width = end - st;
            int ht = Math.min(height[st],height[end]);
            maxw= Math.max(maxw,width*ht);
            if(height[st]<height[end]){
                st++;
            }else{
                end--;
            }
        }
        return maxw;
    }

    public static void main(String[] args) {
        int height[] = {1,8,6,2,5,4,8,3,7};
        System.out.println(max_water(height));
        System.out.println(max_water2(height));
    }
}
