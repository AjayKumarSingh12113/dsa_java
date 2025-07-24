
public class MergSort {
    public static class ListNode {
        int data;
        ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static ListNode midfun(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static ListNode merge(ListNode head1, ListNode head2) {
        ListNode mergell = new ListNode(-1);
        ListNode temp = mergell;
        while (head1 != null && head2 != null) {
            if (head1.data < head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;

            }
        }
        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return mergell.next;
    }

    public static ListNode mergesort(ListNode head) {
        //base
        if (head == null || head.next == null) {
            return head;
        }
        // find mid
        ListNode midNode = midfun(head);
        // sorting
        ListNode rightside = midNode.next;
        midNode.next = null;
        ListNode leftside = head;

        ListNode headleft = mergesort(leftside);
        ListNode headright = mergesort(rightside);
        // merge
        return merge(headleft, headright);
    }
    
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(4);
        head.next = new ListNode(2);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(3);

        System.out.println("Original List:");
        printList(head);

        // Sorting the linked list
        head = mergesort(head);

        System.out.println("Sorted List:");
        printList(head);
        
    }
    
}
