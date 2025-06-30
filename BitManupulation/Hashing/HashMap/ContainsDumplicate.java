package BitManupulation.Hashing.HashMap;

import java.util.HashSet;

public class ContainsDumplicate {
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            // If the number is already in the set, it's a duplicate
            if (!set.add(num)) {
                return true; // Duplicate found
            }
            
        }
        return false; // No duplicates
    }
    public static void main(String[] args) {
        
    }
}
