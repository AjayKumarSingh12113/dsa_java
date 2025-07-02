package Heaps;

import java.util.ArrayList;

public class HeapImplementation {
    static class Heap {
        ArrayList<Integer> list = new ArrayList<>();
        public  void add(int val){
            list.add(val);

            int child = list.size()-1;
            int par = (child-1)/2;

            while(list.get(child)<list.get(par)){
                int temp = list.get(child);
                list.set(child, list.get(par));
                list.set(par, temp);

                child= par;
                par = (child-1)/2;
            }

        }

        public  int peek(){
            return list.get(0);
        }

        public  void heapify(int i){
            int left = 2*i+1;
            int right = 2*i+2;
            int minidx = i;

            if (left < list.size() && list.get(minidx) > list.get(left)) {
                minidx = left;
            }
            if (right < list.size() && list.get(minidx) > list.get(right)) {
                minidx = right;
            }

            if (minidx != i) {
                int temp = list.get(i);
                list.set(i, list.get(minidx));
                list.set(minidx, temp);

                heapify(minidx);
            }
        }
        public  int remove(){
            int data = list.get(0);

            int temp = data;
            list.set(0, list.get(list.size()-1));
            list.set(list.size()-1, temp);

            list.remove(list.size()-1);
            heapify(0);
            return data;
        }

        public boolean isEmpty(){
            return list.size() == 0;
        }
        
    }
    public static void main(String[] args) {
        Heap h = new Heap();
        h.add(3);
        h.add(4);
        h.add(1);
        h.add(5);

        while (!h.isEmpty()) {
            System.out.println(h.peek());
            h.remove();
        }
    }
    
}
