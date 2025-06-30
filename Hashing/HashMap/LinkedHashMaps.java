package Hashing.HashMap;

import java.util.LinkedHashMap;

public class LinkedHashMaps {
    
     public static void main(String[] args) {
        LinkedHashMap<String ,Integer> lm= new LinkedHashMap<>();
        lm.put("india",122);
        lm.put("china", 1231);
        lm.put("us", 68);
        System.out.println(lm);// jis order me put usi order me output
     }
        
}
