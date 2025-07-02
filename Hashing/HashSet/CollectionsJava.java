package Hashing.HashSet;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;


public class CollectionsJava {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(1);
        hs.add(2);
        hs.add(5);
        hs.add(1);
        hs.add(2);
        hs.add(3);
        System.out.println(hs);
        HashSet<String> hsm = new HashSet<>();// undorder
        hsm.add("india");
        hsm.add("china");
        hsm.add("us");
        System.out.println(hsm);

        LinkedHashSet<String > lm= new LinkedHashSet<>();//ordered
        lm.add("india");
        lm.add("china");
        lm.add("us");
        System.out.println(lm);// jis order me put usi order me output

        TreeSet<String > tm = new TreeSet<>();//sorted
        tm.add("india");
        tm.add("china");
        tm.add("us");
        System.out.println(tm);
        // System.out.println(hs);
        // hs.remove(1);
        // System.out.println(hs.contains(1));
        // System.out.println(hs.isEmpty());
        // System.out.println(hs.size());
        // hs.clear();
        // System.out.println(hs.isEmpty());
        // iterator
        //Iterator it = hs.iterator();
        // while (it.hasNext()) {
        //     System.out.println(it.next());
        // }
        // foreach 
        // for (Integer integer : hs) {
        //     System.out.println(integer);
        // }
    }
}
