

public class Llispalindrome {
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

    public static ListNode findmid(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static boolean ispalindrome() {
        if (head == null || head.next == null) {
            return true;
        }
        // find midListNode
        ListNode midListNode = findmid(head);
        // 2nd half reverse
        ListNode prev = null;
        ListNode curr = midListNode;
        ListNode next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        // check right or left
        ListNode right = prev;
        ListNode left = head;

        while (right != null) {
            if (right.date != left.date) {
                return false;
            }
            right = right.next;
            left = left.next;
        }
        return true;
    }
    
    public  void addlast(int data) {
        ListNode newListNode = new ListNode(data);
        if (head == null) {
            head = tail = newListNode;
            return;
        }
        tail.next = newListNode;
        tail = newListNode;
    }

    public static void main(String[] args) {
        Llispalindrome ll = new Llispalindrome();
        ll.addlast(1);
        ll.addlast(2);
        ll.addlast(1);
        //ll.addlast(10);
        System.out.println(ll.ispalindrome());

        
        
    }
}
