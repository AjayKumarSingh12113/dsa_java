package BitManupulation.Queues;

public class ImlementationofArr {
    static class Queue {
        static int arr[];
        static int size;
        static int rear;

        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
        }

        public  boolean isEmpty() {
            return rear == -1;
        }

        // add
        public  void add(int data) {// initial position pe data add kr rhe hai 
            // full wale case ko consider krna padega 
            if (rear == size-1) {
                return;
            }
            rear = rear + 1; // rear initailly -1 pe hoga 
            arr[rear] = data;
        }

        // remove
        public  int remove() {
            if (isEmpty()) {
                return -1;
            }
            int front = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];

            }
            rear = rear - 1;
            return front;
        }

        // peek
        public  int peek() {
            // base on the concept of fifo arr[0] hi pehme niklega to top to ohi hoga na
            if (isEmpty()) {
                return -1;
            }
            return arr[0];
        }
    }
    public static void main(String[] args) {
        Queue a = new Queue(5);
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
