package BitManupulation.Hashing.HashMap;

import java.util.HashMap;
import java.util.Set;

public class MajorityElement {
    public static int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<nums.length;i++){
            // if(map.containsKey(nums[i])){
            //     map.put(nums[i],map.get(nums[i])+1);
            // }else{
            //     map.put(nums[i],1);
            // }
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
        Set<Integer> set = map.keySet();
        for(Integer key:set){
            if(map.get(key)>nums.length/2){
                return key;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        
    }
}
