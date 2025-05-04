package Stack;

import java.util.ArrayList;

public class StackB {
    static class Stack {
        static ArrayList<Integer> list = new ArrayList<>();
        // isempty()
        public  boolean isEmpty() {
            return list.size() == 0;
        }
        // add()
        public  void add(int data) {
            list.add(data);
        }
        // remove
        public  int pop() {
            if (isEmpty()) {
                return -1;
            }
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
            
        }
        // peek
        public  int peek() {
            if (isEmpty()) {
                return -1;
            }
            return list.get(list.size() - 1);

        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.add(1);
        s.add(2);
        s.add(3);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
        
    }
}
