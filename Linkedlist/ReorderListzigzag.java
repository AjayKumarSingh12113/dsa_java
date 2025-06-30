public class ReorderListzigzag {
    public static class ListNode {
        int data;
        ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static ListNode head;
    public static ListNode tail;
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }
        // find mid
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
    public static void main(String[] args) {
        
    }
}
