package Heaps;

import java.util.PriorityQueue;

public class minCost_nropes {
    public static int minCost(int[] arr) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0; i<arr.length; i++){
            pq.add(arr[i]);
        }
        int mincost =0;
        while(pq.size() > 1){
            int fmin = pq.remove();
            int smin = pq.remove();
            mincost += fmin+smin;
            
            pq.add(fmin + smin);
        }
        return mincost;
        
    }
    public static void main(String[] args) {
        int arr[] = {2,3,3,4,6};
        System.out.println(minCost(arr));
    }
}
