package Hashing.HashSet;

import java.util.HashSet;

public class Iteration {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(1);
        hs.add(2);
        hs.add(5);
        hs.add(1);
        hs.add(2);
        hs.add(3);
        // iterator
        //Iterator it = hs.iterator();
        // while (it.hasNext()) {
        //     System.out.println(it.next());
        // }
        // foreach 
        for (Integer integer : hs) {
            System.out.println(integer);
        }
    }
}
