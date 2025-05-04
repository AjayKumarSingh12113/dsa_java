package Stack;

import java.util.Stack;

public class MaxAreaHistogram {
    public static int largestRectangleArea(int[] heights) {
        int maxArea = 0;
        int n = heights.length;
        Stack<Integer> m = new Stack<>();
        int ngr[] = new int[n];
        int ngl[] = new int[n];

        for (int i = heights.length - 1; i >= 0; i--) {
            while (!m.isEmpty() && heights[i] <= heights[m.peek()]) {
                m.pop();
            }
            if (m.isEmpty()) {
                ngr[i] = heights.length;
            } else {
                ngr[i] = m.peek();
            }
            m.push(i);
        }
        m = new Stack<>();
        for (int i = 0; i < heights.length; i++) {
            while (!m.isEmpty() && heights[i] <= heights[m.peek()]) {
                m.pop();
            }
            if (m.isEmpty()) {
                ngl[i] = -1;
            } else {
                ngl[i] = m.peek();
            }
            m.push(i);
        }
        for (int i = 0; i < heights.length; i++) {
            int height = heights[i];
            int width = (ngr[i] - ngl[i] - 1);//j-i-1
            int currarea = height * width;
            maxArea = Math.max(maxArea, currarea);
        }
        return maxArea;
        


    }

    public static int maxArea(int height[]) {
        int ngr[] = nextSmallerright(height);
        for (int i = 0; i < ngr.length; i++) {
            System.out.print(ngr[i]);
        }
        int ngl[] = nextSmallerleft(height);

        int max = 0;
        int area = 0;
        for (int i = 0; i < height.length; i++) {
            area = height[i] * (ngr[i] - ngl[i] - 1);
            max = Math.max(max, area);
        }
        
        return max;

    }

    public static int[] nextSmallerright(int height[]) {
        Stack<Integer> m = new Stack<>();
        int ngr[] = new int[height.length];
        for (int i = height.length - 1; i >= 0; i--) {
            int curr = height[i];
            while (!m.isEmpty() && curr <= height[m.peek()]) {
                m.pop();

            }
            if (m.isEmpty()) {
                ngr[i] = height.length;
            } else {
                ngr[i] = m.peek();
            }
            m.push(i);
        }
        return ngr;
    }

    public static int[] nextSmallerleft(int height[]) {
        Stack<Integer> m = new Stack<>();
        int ngl[] = new int[height.length];
        for (int i = 0; i < height.length;i++) {
            int curr = height[i];
            while (!m.isEmpty() && curr <= height[m.peek()]) {
                m.pop();

            }
            if (m.isEmpty()) {
                ngl[i] = -1;
            } else {
                ngl[i] = m.peek();
            }
            m.push(i);
        }
        return ngl;

    }
    public static void main(String[] args) {
        int height[] = { 2, 1, 5, 6, 2, 3 };
        System.out.println(maxArea(height));
        System.out.println(largestRectangleArea(height));
    }
    
}
