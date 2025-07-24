package Greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumAbsDifference {
    public static List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> a = new ArrayList<>();
        Arrays.sort(arr);
        int max =Integer.MAX_VALUE;
        for(int i=1; i<arr.length;i++){
            int diff = Math.abs(arr[i]-arr[i-1]);
            if(max>diff){
                max=diff;
                a.clear();
            }
            if(max == diff){
                a.add(Arrays.asList(arr[i-1],arr[i]));
            }
        }
        return a;
        
    }

    public static void main(String[] args) {
        
    }
}