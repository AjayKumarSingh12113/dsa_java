package Greedy;

import java.util.Arrays;
import java.util.Comparator;

public class Rev {
    public static int fractionalk(int val[], int weight[],int w){
        int n = val.length;

        double ratio[][] = new double[n][2];
        for (int i = 0; i < ratio.length; i++) {
            ratio[i][0] = i;
            ratio[i][1]= val[i]/ (double)(weight[i]);
        }
        Arrays.sort(ratio,Comparator.comparingDouble(o -> o[1]));
        int capacity = w;
        int finalVal =0;
        for(int i =ratio.length-1; i>= 0 ; i--){
            int idx = (int)ratio[i][0];
            if (capacity >= weight[idx]) {
                finalVal += val[idx];
                capacity -= weight[idx];
            }else{
                finalVal += capacity * ratio[i][1];
                capacity = 0;
                break;
            }
        }
        return finalVal;
    }
    public static void main(String[] args) {
        int val[] = { 60, 100, 120 };
        int weight[] = { 10, 20, 30 };
        int w = 50;
        System.out.println(fractionalk(val, weight, w));
    }
}
