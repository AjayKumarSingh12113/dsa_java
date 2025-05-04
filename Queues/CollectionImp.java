package Queues;

import java.util.ArrayDeque;
//import java.util.LinkedList;
import java.util.Queue;

public class CollectionImp {
    public static void main(String[] args) {
        //Queue<Integer> a = new LinkedList<>();
        Queue<Integer> a = new ArrayDeque<>();
        a.add(1);
        a.add(2);
        a.add(3);
        while (!a.isEmpty()) {
            System.out.println(a.peek());
            a.remove();
        }
        System.out.println(a.isEmpty());
    }
}
