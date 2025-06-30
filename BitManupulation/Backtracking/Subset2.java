package BitManupulation.Backtracking;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.*;;

public class Subset2 {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);
        helper(nums,0,new ArrayList<>(),set);
        return new ArrayList<>(set); 
    }
    public static void helper(int nums[],int i,List<Integer> list,Set<List<Integer>> result){
        if(i == nums.length){
            result.add(new ArrayList<>(list));
            return;
        }

        list.add(nums[i]);
        helper(nums,i+1,list,result);
        list.remove(list.size()-1);
        helper(nums,i+1,list,result);
    }
    public static void main(String[] args) {
        
    }
}
