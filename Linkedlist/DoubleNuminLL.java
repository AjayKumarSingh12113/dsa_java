public class DoubleNuminLL {
    static class ListNode{
        int val;
        ListNode next ;
        public ListNode(int de){
            this.val = de;
            this.next = null;
        }   
    }
    static ListNode head;
    public static ListNode doubListNode(ListNode head){
        ListNode newHead = reverse(head);
        ListNode dummy = new ListNode(-1);
        ListNode ans = dummy;
        int carry =0 ;
        while (newHead != null) {
            int sum = newHead.val +newHead.val+carry;
            int digit = sum%10;
            carry=sum/10;
            ListNode nw = new ListNode(digit);
            dummy.next = nw;
            dummy = dummy.next;
            newHead = newHead.next;
        }
        if (carry>0) {
            ListNode nw = new ListNode(carry);
            dummy.next = nw;
        }
        return reverse(ans.next);
    }
    public static ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        ListNode next;
        while (curr != null) {
            next = curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
}
