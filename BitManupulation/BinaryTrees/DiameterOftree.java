package BitManupulation.BinaryTrees;

public class DiameterOftree {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int height(Node root) {
        if (root == null) {
            return 0;
        }
        int l = height(root.left);
        int r = height(root.right);
        return Math.max(l, r) + 1;
    }

    public static int diameter(Node root) {
        if (root == null) {
            return 0;
        }
        int leftdia = diameter(root.left);
        int leftht = height(root.left);
        int rightdia = diameter(root.right);
        int rightht = height(root.right);
        int withNodediameter = leftht + rightht + 1;
        return Math.max(Math.max(leftdia, rightdia), withNodediameter);

    }

    static class Info {
        int diam;
        int ht;

        public Info(int d, int ht) {
            this.diam = d;
            this.ht = ht;
        }
    }
    
    public static Info optimizedDiameter(Node root) {
        if (root == null) {
            return new Info(0, 0);
        }
        Info leftone = optimizedDiameter(root.left);
        Info rightone = optimizedDiameter(root.right);
        int dia = Math.max(Math.max(leftone.diam, rightone.diam), leftone.ht + rightone.ht + 1);
        int hta = Math.max(leftone.ht, rightone.ht) + 1;
        return new Info(dia, hta);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(21);
        root.left.left = new Node(3);
        root.left.left.right = new Node(5);
        root.right = new Node(4);
        root.right.left = new Node(7);
        root.right.left.right = new Node(8);
        System.out.println(diameter(root));
        System.out.println(optimizedDiameter(root).diam);

    }
}
