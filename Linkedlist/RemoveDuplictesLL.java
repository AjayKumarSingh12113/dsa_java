//import Linkedlist.Llispalindrome.ListNode;


public class RemoveDuplictesLL {
    static class ListNode{
        int val;
        ListNode next;
        public ListNode(int d){
            this.val = d;
            this.next = null;
        }
    }
    static ListNode head ;
    // Approach - space-c ---O(n)
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode dummy = new ListNode(head.val);
        ListNode ans = dummy;
        ListNode temp = head.next;
        while(temp != null){
            if(temp.val != dummy.val ){
                ListNode newOne = new ListNode(temp.val);
                dummy.next = newOne;
                dummy = dummy.next;
            }
            temp = temp.next;
        }
        return ans;
    }
    // Approach 1 modified space-c O(1)
    public ListNode deleteDuplicateSecond(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode dummy = new ListNode(head.val);
        ListNode ans = dummy;
        ListNode temp = head.next;
        while(temp != null){
            if(temp.val != dummy.val ){
                //ListNode newOne = new ListNode(temp.val);
                dummy.next = temp;
                dummy = dummy.next;
            }
            temp = temp.next;
        }
        dummy.next = null;
        return ans;
    }
    public static void main(String[] args) {
        
    }
}
