package Queues;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
    static class Stack {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        public boolean isEmpty() {
            return q1.isEmpty() && q2.isEmpty();
        }

        // push
        public void push(int data) {
            if (!q1.isEmpty()) {
                q1.add(data);
            } else {
                q2.add(data);
            }
        }
        
        // pop
        public int pop() {
            if (isEmpty()) {
                return -1;
            }
            int top = -1;
            if (!q1.isEmpty()) {
                while (!q1.isEmpty()) {
                    top = q1.remove();
                    if (q1.isEmpty()) {
                        break;
                    }
                    q2.add(top);
                    
                }
            }
            else {
                while (!q2.isEmpty()) {
                    top = q2.remove();
                    if (q2.isEmpty()) {
                        break;
                    }
                    q1.add(top);

                }
            }
            return top;
        }
        public int peek() {
            if (isEmpty()) {
                return -1;
            }
            int top = -1;
            if (!q1.isEmpty()) {
                while (!q1.isEmpty()) {
                    top = q1.remove();
                    q2.add(top);
                    
                }
            }
            else {
                while (!q2.isEmpty()) {
                    top = q2.remove();
                    q1.add(top);

                }
            }
            return top;
        }
            
        
        
    }
    public static void main(String[] args) {
        Stack a = new Stack();
        a.push(1);
        a.push(2);
        a.push(3);
        while (!a.isEmpty()) {
            System.out.println(a.peek());
            a.pop();
        }
    }
}
