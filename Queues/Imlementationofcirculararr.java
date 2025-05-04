package Queues;

public class Imlementationofcirculararr {
    static class Queue {
        static int arr[];
        static int size;
        static int rear;
        static int front;

        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }
        
        //isEmpty TC-O(1)
        public boolean isEmpty() {
            return (rear == -1 && front == -1);
        }

        public boolean isFull() {
            return (rear + 1) % size == front;
        }

        // add TC-O(1)
        public void add(int data) {
            if (isFull()) {
                return;
            }
            if (front == -1) {
                front =0;// for first element
            }
            rear = (rear + 1)%size; // last circularly update
            arr[rear] = data;
        }

        // remove TC-O(1)
        public int remove() {
            if (isEmpty()) {
                return -1;
            }
            int result = arr[front];
            if (rear == front) {// for last element
                rear = front = -1;
            } else {
                front = (front + 1) % size;// front update
            }
            
            return result;
        }

        // peek TC-O(1)
        public int peek() {
            if (isEmpty()) {
                return -1;
            }
            return arr[front];
        }
    }

    public static void main(String[] args) {
        Queue a = new Queue(3);
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
