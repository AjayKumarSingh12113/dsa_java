public class Zigzag {
    public static class ListNode {
        int data;
        ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static ListNode head;

    public static void reorderList(ListNode head) {
        if (head == null || head.next == null ) {
            return;
        }
        //find mid
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode mid = slow;
        // reverse half

        ListNode prev = null;
        ListNode curr = mid.next;
        mid.next = null;
        ListNode next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // alternating merge
        ListNode rh = prev;
        ListNode lh = head;
        ListNode nextl, nextr;
        while (lh != null && rh != null) {
            nextl = lh.next;
            lh.next = rh;
            nextr = rh.next;
            rh.next = nextl;

            // update
            rh = nextr;
            lh = nextl;
        }

    }
    
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        printList(head);
        reorderList(head);
        printList(head);
        
    }
}
