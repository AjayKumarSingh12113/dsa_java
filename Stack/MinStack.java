package Stack;

import java.util.*;

class MinStack {
    private Stack<Integer> st;
    private Stack<Integer> min;

    public MinStack() {
        st = new Stack<>();
        min = new Stack<>();

    }

    public void push(int val) {
        if (st.size() == 0 || min.peek() >= val) {
            min.push(val);
        }
        st.push(val);

    }

    public void pop() {
        int el1 = st.pop();
        if (el1 == min.peek()) {
            min.pop();
        }

    }

    public int top() {
        return st.peek();
    }

    public int getMin() {
        return min.peek();
    }
}