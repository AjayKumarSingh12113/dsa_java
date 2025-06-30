package BitManupulation.Stack;
import java.util.*;

public class Maximal_Recangle {
    public static int maximalRectangle(char[][] matrix) {
        int heights[] = new int[matrix[0].length];
        int largestarea = 0;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j< matrix[0].length; j++){
                int val = matrix[i][j]-'0';
                if(val == 0){
                    heights[j]=0;
                }else{
                    heights[j] += val;
                }
            }
            int rowsarea = largestRectangleArea(heights);
            largestarea = Math.max(rowsarea,largestarea);
        }
        return largestarea;
    }
    public static int largestRectangleArea(int[] heights) {
        int maxArea = 0;
        int n = heights.length;
        Stack<Integer> s = new Stack<>();
        int nsr[] = new int[n];
        int nsl[] = new int[n];

        //ngr
        for(int i= n-1; i>=0; i--){
            int curr = heights[i];
            while(!s.isEmpty() && curr <= heights[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i]=n;
            }else{
                nsr[i]=s.peek();
            }
            s.push(i);
        }

        //nsl
        s = new Stack<>();
        for(int i=0; i<n; i++){
            int curr = heights[i];
            while(!s.isEmpty() && curr <= heights[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i]=-1;
            }else{
                nsl[i]=s.peek();
            }
            s.push(i);
        }

        for(int i=0; i<n; i++){
            maxArea = Math.max(maxArea,heights[i]*(nsr[i]-nsl[i]-1));
        }
        return maxArea;
        
    }
    public static void main(String[] args) {
        char matrix[][] = {
            {'1','0','1','0','0'},
            {'1','0','1','1','1'},
            {'1','1','1','1','1'},
            {'1','0','0','1','0'}
        };
        System.out.println(maximalRectangle(matrix));;
    }
}
