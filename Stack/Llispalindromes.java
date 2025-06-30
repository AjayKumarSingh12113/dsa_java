package BitManupulation.Stack;

import java.util.Stack;

public class Llispalindromes {
    static class ListNode{
        int val;
        ListNode next;
        public ListNode(int d){
            this.val = d;
            this.next = null;
        }
    }
    static ListNode head ;
    public static boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }
        Stack<Integer> s = new Stack<>();
        ListNode temp = head;
        while(temp != null){
            s.push(temp.val);
            temp = temp.next;
        }
        temp = head;
        while(temp != null){
            if(temp.val != s.pop()){
                return false;
            }
            temp = temp.next;
        }
        return true;
    }
    public static void main(String[] args) {
        
    }
}
