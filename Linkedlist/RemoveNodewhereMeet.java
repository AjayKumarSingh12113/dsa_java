public class RemoveNodewhereMeet {
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
    public ListNode detectCycle(ListNode head) {

        if (head == null || head.next == null) {
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        boolean cycle = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                cycle = true;
                break;
            }
        }
        if (cycle == false) {
            return null;
        }
        // prev
        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        // last node point to null

        return slow;

    }
    public static void main(String[] args) {
        
    }
}
