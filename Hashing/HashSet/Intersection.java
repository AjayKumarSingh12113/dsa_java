package Hashing.HashSet;

import java.util.HashSet;

public class Intersection {
    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hs = new HashSet<>();
        HashSet<Integer> re = new HashSet<>();
        for(int i=0; i<nums1.length; i++){
            hs.add(nums1[i]);
        }
        for(int i=0; i<nums2.length; i++){
            if(hs.contains(nums2[i])){
                re.add(nums2[i]);
            }
        }
        int arr[]= new int[re.size()];
        int i=0;
        for(int el : re){
            arr[i]=el;
            i++;
        }
        return arr; 
    }
    public static void main(String[] args) {
        
    }
}
