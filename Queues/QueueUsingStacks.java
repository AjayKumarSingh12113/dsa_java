package Queues;

import java.util.Stack;

public class QueueUsingStacks {
    static class Queue {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        public boolean isEmpty() {
            return s1.isEmpty();
        }

        // add TC-O(n)
        public void add(int data) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
            s1.push(data);
            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }

        // remove
        public int remove() {
            if (isEmpty()) {
                return -1;
            }
            return s1.pop();
        }

        // peek
        public int peek() {
            if (isEmpty()) {
                return -1;
            }
            return s1.peek();
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
