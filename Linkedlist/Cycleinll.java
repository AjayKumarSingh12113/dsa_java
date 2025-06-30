public class Cycleinll {
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

    public static boolean isCycle() {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next; // +1
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public static void removeList() {
        if (head == null || head.next == null) {
            return;
        }
        // detect cycle
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
        if (cycle== false) {
            return ;
        }
        // prev
        slow = head;
        int s = 0;
        ListNode prev = null;
        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            s++;
            
            fast = fast.next;
        }
        // last node point to null
        prev.next = null;
        System.out.println(s);

    }
    public static void main(String[] args) {
        head = new ListNode(1);
        ListNode temp = new ListNode(2);
        head.next = temp;
        head.next.next = new ListNode(3);
        //head.next.next.next = new ListNode(3);
        
        head.next.next.next = temp;
        System.out.println(isCycle());
        removeList();
        System.out.println(isCycle());
    }
}
