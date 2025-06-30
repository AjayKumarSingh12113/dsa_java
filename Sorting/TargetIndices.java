package Sorting;

import java.util.ArrayList;
import java.util.List;

public class TargetIndices {
    // input = [1,2,5,2,3],target = 2
    // output = [1,2]
    public static List<Integer> targetIndices(int[] nums, int target) {
        int num = 0;
        int tcount = 0;

        for (int ele : nums) {
            if (ele == target) {
                tcount++;
            } else if (ele < target) {
                num++;
            }
        }
        List<Integer> result = new ArrayList<>();
        while (tcount > 0) {
            result.add(num);
            num++;
            tcount--;
        }
        return result;

    }
    public static void main(String[] args) {
        
    }
}
