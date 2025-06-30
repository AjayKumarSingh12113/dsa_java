package BitManupulation.Heaps;

import java.util.ArrayList;

public class Rev {
    static class Heap {
        ArrayList<Integer> al = new ArrayList<>();

        public void add(int data) {
            al.add(data);
            int child = al.size() - 1;
            int parent = (child - 1) / 2;

            while (al.get(child) < al.get(parent)) {
                // swap
                int temp = al.get(parent);
                al.set(parent, al.get(child));
                al.set(child, temp);

                child = parent;
                parent = (child - 1) / 2;
            }
        }

        public  int peek() {
            return al.get(0);
        }

        public void heapify(int i){
            int left = 2*i+1;
            int right = 2*i+2; 
            int minidx = i;

            if (left < al.size() && al.get(left)< al.get(minidx) ) {
                minidx = left;
            }

            if (right < al.size() && al.get(right )< al.get(minidx)) {
                minidx = right;
            }

            if (minidx != i) {
                int temp = al.get(i);
                al.set(i, al.get(minidx));
                al.set(minidx, temp);

                heapify(minidx);
            }
        }


        public int remove(){
            int first = al.get(0);

            //swap 
            int temp = first;
            al.set(0, al.get(al.size()-1));
            al.set(al.size()-1, temp);

            //delete last
            al.remove(al.size()-1);

            heapify(0);
            
            return first;
        }

        public boolean isEmpty(){
            return al.size() ==0;
        }
    }

    public static void main(String[] args) {
        Heap pq = new Heap();
        pq.add(2);
        pq.add(1);
        pq.add(5);
        pq.add(3);

        while (!pq.isEmpty()) {
            System.out.println(pq.peek());
            pq.remove();
        }
        
    }
}
