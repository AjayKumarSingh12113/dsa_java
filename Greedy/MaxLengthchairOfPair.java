package Greedy;

import java.util.Arrays;
import java.util.Comparator;

public class MaxLengthchairOfPair {
    public static int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));
        int chainlen = 1;
        int chainEnd = pairs[0][1];
        for (int i = 1; i < pairs.length; i++) {
            if (pairs[i][0] > chainEnd) {
                chainlen++;
                chainEnd = pairs[i][1];
            }
        }
        return chainlen;
        
    }

    public static void main(String[] args) {
        int arr[][] = { { 5, 24 }, { 39, 60 }, { 5, 28 }, { 27, 40 }, { 50, 90 } };
        System.out.println(findLongestChain(arr));
        
    }
}
