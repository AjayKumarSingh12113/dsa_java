package BitManupulation.Stack;

//import java.util.ArrayList;
import java.util.Stack;

public class Rev_of_stack {
    // static class Stack {
    //     ArrayList<Integer> list = new ArrayList<>();
    //     public boolean isEmpty(){
    //         return list.size()==0;
    //     }

    //     public void push(int val){
    //         list.add(val);
    //     }

    //     public int pop(){
    //         if (list.size()==0) {
    //             return -1;
    //         }
    //         int top = list.get(list.size()-1);
    //         list.remove(list.size()-1);
    //         return top;
    //     }

    //     public int peek(){
    //         if (list.isEmpty()) {
    //             return -1;
    //         }
    //         return list.get(list.size()-1);
    //     }
    // }
    public static void addBottom(Stack<Integer> s , int data){
        if (s.isEmpty()) {
            s.add(data);
            return;
        }
        int top =s.pop();
        addBottom(s, data);
        s.push(top);
    }
    public static Stack<Integer> addBottomWithStack(Stack<Integer> s , int data){
        Stack<Integer> st = new Stack<>();
        while (!s.isEmpty()) {
            st.push(s.pop());
        }
        s.push(data);
        while (!st.isEmpty()) {
            s.push(st.pop());
        }
        return s;
    }
    public static void revStack(Stack<Integer> s ){
        if (s.isEmpty()) {
            return;
        }
        int top =s.pop();
        revStack(s);
        addBottom(s, top);
    }
    public static String reverseString(String str){
        Stack<Character> s = new Stack<>();
        int i =0;
        while (i<str.length()) {
            s.push(str.charAt(i));
            i++;
        }
        StringBuilder std = new StringBuilder("");
        while (!s.isEmpty()) {
            std.append(s.pop());
        }
        return std.toString();
    }
    public static void main(String[] args) {
        // Stack s = new Stack();
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        //addBottom(s,4);
        revStack(s);
        String t = reverseString("abs");
        for (int i = 0; i < t.length(); i++) {
            System.out.print(t.charAt(i)+" ");
        }

        // Stack<Integer> rs = addBottomWithStack(s, 4);
        // while (!rs.isEmpty()) {
        //     System.out.println(rs.peek());
        //     rs.pop();
        // }

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
    
}
