public class Reversell {
    public class ListNode {
        int date;
        ListNode next;

        public ListNode(int data) {
            this.date = data;
            this.next = null;
        }
    }

    public static ListNode head;
    public static ListNode tail;
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev; 
    }

    public static void main(String[] args) {
        Reversell ll = new Reversell();
        
        
    }
}
