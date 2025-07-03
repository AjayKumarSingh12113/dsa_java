package ArrayList;
import java.util.ArrayList;
import java.util.Collections;
public class Collections_basic {
    // maximum in array method-1
    public static int maximumList(ArrayList<Integer> list){
        int max = Integer.MIN_VALUE;
        for (int index = 0; index < list.size(); index++) {
            if (max<list.get(index)) {
                max=list.get(index);
            }
        }
        return max;
    }
    // method 2
    public static int maximumList2(ArrayList<Integer> list){
        int max =0;
        for (int index = 0; index < list.size(); index++) {
            max = Math.max(max,list.get(index));
        }
        return max;
    }
    //swap the arraylist
    public static void swap(int i, int j,ArrayList<Integer> list){
        int temp= list.get(i);
        list.set(i, list.get(j));
        list.set(j,  temp);
    }
    public static void listswap(ArrayList<Integer> list){
        int st =0,end=list.size()-1;
        while (st<=end) {
            swap(st, end, list);
            st++;
            end--;
        }
        System.out.println(list);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(4);

        System.out.println(list);
        System.out.println(list.get(2));

        list.set(1,3);

        System.out.println(list);

        System.out.println(list.contains(6));

        list.add(2,5);
        list.add(1,8);

        System.out.println(list);

        System.out.println(list.size());

        //reverse
        for(int i=list.size()-1; i>=0; i--){
            System.out.print(list.get(i)+" ");
        }

        //max
        System.out.println();
        System.out.println(maximumList(list));
        System.out.println(maximumList2(list));

        //swap the arraylist
        System.out.println(list);
        listswap(list);

        //sorting 
        Collections.sort(list);
        System.out.println(list);
        //sorting reverse
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
    

        


    }
}
