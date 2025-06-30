package Hashing;

import java.util.ArrayList;
import java.util.HashMap;

public class MinIdxSumoftwoList {
    public static String[] findRestaurant(String[] list1, String[] list2) {
        ArrayList<String> list = new ArrayList<>();
        HashMap<String,Integer> map = new HashMap<>();
        for(int i=0; i<list1.length;i++){
            map.put(list1[i],i);
        }
        int min = Integer.MAX_VALUE;
        for(int i=0; i<list2.length;i++){
            if(map.containsKey(list2[i])){
                // update min
                if(min> i+map.get(list2[i])){
                    min = i+map.get(list2[i]);
                    list = new ArrayList<>();
                    list.add(list2[i]);
                }else if(min == i+map.get(list2[i])){
                    list.add(list2[i]);
                }
            }
        }
        String ans[]= new String[list.size()];
        for(int i=0; i<list.size();i++){
            ans[i]=list.get(i);
        }
        return ans;
    }
    public static void main(String[] args) {
        
    }
}
