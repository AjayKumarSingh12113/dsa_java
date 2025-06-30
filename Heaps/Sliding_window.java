package BitManupulation.Heaps;

import java.util.PriorityQueue;

public class Sliding_window {
    static class Pair implements Comparable<Pair>{
        int val ;
        int idx ;

        public Pair(int val , int idx){
            this.val = val;
            this.idx = idx;
        }

        @Override
        public int compareTo(Pair p2){
            return p2.val - this.val;
        }

    }
    public static int[] maxSlidingWindow(int[] nums, int k) {
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        int result[] = new int[nums.length-k+1];

        for(int i=0; i<k; i++){
            pq.add(new Pair(nums[i],i));
        }
        result[0]=pq.peek().val;

        for(int i=k; i<nums.length; i++){
            while(pq.size() >0 && pq.peek().idx <= (i-k)){
                pq.remove();
            }
            pq.add(new Pair(nums[i],i));
            result[i-k+1] = pq.peek().val;
        }
        return result;
    }
    public static void main(String[] args) {
        int arr[] = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        int resultarray[] = maxSlidingWindow(arr, k);
        for (int i = 0; i < resultarray.length; i++) {
            System.out.print(resultarray[i]+" ");
        }
        System.out.println();
    }

}
