public class AddtwoNumber {
    public static class ListNode {
        int val;
        ListNode next;

        public ListNode(int data) {
            this.val = data;
            this.next = null;
        }
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode addtwo = new ListNode(-1);
        ListNode temp = addtwo;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            int val1;
            if (l1 != null) {
                val1 = l1.val;
            } else {
                val1 = 0;
            }

            int val2 = (l2 != null) ? l2.val : 0;
            int sum = val1 + val2 + carry;
            carry = sum / 10;
            temp.next = new ListNode(sum % 10);
            if (l1 != null)
                l1 = l1.next;
            if (l2 != null)
                l2 = l2.next;
            temp = temp.next;

        }
        return addtwo.next;

    }
    public static void main(String[] args) {
        
    }
}
