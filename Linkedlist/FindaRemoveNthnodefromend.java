public class FindaRemoveNthnodefromend {
    public class ListNode {
        int date;
        ListNode next;

        public ListNode(int data) {
            this.date = data;
            this.next = null;
        }
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int s = 0;
        ListNode temp = head;
        while (temp != null) {
            temp = temp.next;
            s++;
        }

        // head hi nth ho gya to
        if (n == s) {
            head = head.next;
            return head;
        }

        // nth
        int i = 1;
        ListNode prev = head;
        while (i < (s - n)) {
            prev = prev.next;// prev tak pahuch gya
            i++;

        }
        prev.next = prev.next.next;
        return head;

    }
    public static void main(String[] args) {
        
    }
}
