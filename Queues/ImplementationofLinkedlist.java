package Queues;

public class ImplementationofLinkedlist {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    static class Queue {
        static Node head = null;
        static Node tail = null;

        public boolean isEmpty() {
            return head == null && tail == null;
        }

        // add
        public void add(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;// add last
        }

        // remove
        public int remove() {
            if (isEmpty()) {
                return -1;
            }
            int result = head.data;
            if (tail == head) {
                head = tail = null;
            } else {
                head = head.next;// remove first
            }
            return result;

        }

        // peek
        public int peek() {
            if (isEmpty()) {
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String[] args) {
        Queue a = new Queue();
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
