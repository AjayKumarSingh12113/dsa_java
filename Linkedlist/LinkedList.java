public class LinkedList {
    public static class Node {
        int data;
        Node next;

        public  Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;
     
    public static void addfirst(int data) {
        Node newnode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }

    public static void addlast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public static void printall() {
        Node prev = head;
        while (prev != null) {
            System.out.print(prev.data + " ");
            prev = prev.next;
        }
        System.out.println();

    }

    public static void addmiddle(int idx, int data) {
        if (idx == 0) {
            addfirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node prev = head;
        int i = 0;
        while (i < idx - 1) {// prev tak jane ke lye
            prev = prev.next;
            i++;

        }
        
        newNode.next = prev.next;
        prev.next = newNode;
    }

    public static int removefirst() {
        if (size == 0) {
            return -1;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;

    }

    public static int removelast() {
        if (size == 0) {
            return -1;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        Node prev = head;

        int i = 0;
        while (i < size - 2) {
            prev = prev.next;
            i++;

        }
        int val = tail.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    public static int search(int key) {
        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
            
        }
        return -1;
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        // ll.addfirst(2);
        // ll.addlast(3);
        // ll.addfirst(1);
        // ll.addlast(4);
        // ll.removefirst();
        // System.out.println(ll.removelast());
        //ll.addmiddle(0, 5);
        //System.out.println(ll.size);;
        ll.addfirst(3);
        ll.addfirst(2);
        ll.addfirst(1);
        ll.addlast(4);
        ll.addlast(5);
        System.out.println(search(4));
        printall();
        
    }
}
