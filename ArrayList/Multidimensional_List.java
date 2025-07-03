package ArrayList;

import java.util.ArrayList;

public class Multidimensional_List {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1); list.add(2); list.add(5);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(35);
        list2.add(23);
        list2.add(42);
        list2.add(6);
        mainlist.add(list);mainlist.add(list2);

        //option 1
        // for (ArrayList item : mainlist) {
        //     for (int i = 0; i < item.size(); i++) {
        //         System.out.print(item.get(i)+" ");
        //     }
        //     System.out.println();
        // }
        //option 2
        for (int i = 0; i < mainlist.size(); i++) {
            for (int j = 0; j < mainlist.get(i).size() ; j++) {
                System.out.print(mainlist.get(i).get(j) + " ");
            }
            System.out.println();
        }

        //option 3
        for (int i = 0; i < mainlist.size(); i++) {
            ArrayList<Integer> curr = mainlist.get(i);
            for (int j = 0; j < curr.size(); j++) {
                System.out.print(curr.get(j)+" ");
            }
            System.out.println();
        }
        

    }
}
