package Greedy;

import java.util.*;

public class ActiviltySelection {
    public static int activiltyselection(int start[], int end[]) {
        int[][] intervals = new int[start.length][3];
        for (int i = 0; i < intervals.length; i++) {
            intervals[i][0] = i;
            intervals[i][1] = start[i];
            intervals[i][2] = end[i];
        }
        Arrays.sort(intervals, Comparator.comparingDouble(o -> o[2]));
        int maxAct = 0;
        ArrayList<Integer> a = new ArrayList<>();

        maxAct = 1;
        a.add(0);
        int lastEnd = intervals[0][2];
        for (int i = 1; i < end.length; i++) {
            if (intervals[i][1] >= lastEnd) {
                maxAct++;
                a.add(i);
                lastEnd = intervals[i][2];
            }
        }
        return maxAct;// for maximum 
        //return intervals.length - maxAct;// for minimum 

    }
    public static int activiltyselect(int start[], int[] end) {
        int maxAct = 0;
        ArrayList<Integer> a = new ArrayList<>();

        maxAct = 1;
        a.add(0);
        int lastEnd = end[0];
        for (int i = 1; i < end.length; i++) {
            if (start[i] >= lastEnd) {
                maxAct++;
                a.add(i);
                lastEnd = end[i];
            }
        }
        return maxAct;
    }
    public static void main(String[] args) {
        int start[] = { 1, 3, 0, 5, 8, 5 };
        int end[] = { 2, 4, 6, 7, 9, 9 };
        System.out.println(activiltyselect(start, end));
        int he[] = { 0, 1, 3, 5, 5, 8 };
        int ends[] = { 6, 2, 4, 7, 9, 9 };
        System.out.println(activiltyselection(he, ends));
    }
}
