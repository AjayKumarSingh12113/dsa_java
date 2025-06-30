package BitManupulation.BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;

public class Rev {
    static class Node{
        int data;
        Node left;
        Node right;


        public  Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class Info{
        int ht;
        int dia;

        public Info(int ht,int dia){
            this.ht = ht;
            this.dia = dia;
        }
    }

    public static Info diameter(Node root){
        if (root == null) {
            return new Info(0, 0);
        }
        Info leftdia = diameter(root.left);
        Info rightdia = diameter(root.right);
        int dia = Math.max((Math.max(leftdia.dia, rightdia.dia)),(leftdia.ht+rightdia.ht+1));
        int hts = Math.max(leftdia.ht, rightdia.ht)+1;
        return new Info(hts, dia);
    }

    static class BinaryTree{
        static int idx = -1;
        public static Node createNode(int nodes[]){
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = createNode(nodes);
            newNode.right = createNode(nodes);

            return newNode;

        }
        public static void preorder(Node root){
            if (root == null) {
                System.out.print(-1+" ");
                return ;
            }
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
            return ;
        }
        public static void postorder(Node root){
            if (root == null) {
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");
            return ;
        }

        public static void inorder(Node root){
            if (root == null) {
                return;
            }
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }

        public static void levelorderTraversal(Node root){
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while (!q.isEmpty()) {
                Node currNode = q.remove();
                if (currNode == null) {
                    System.out.println();
                    if (q.isEmpty()) {
                        break;
                    }else{
                        q.add(null);
                    }
                }else{
                    System.out.print(currNode.data+" ");
                    if (currNode.left != null) {
                        q.add(currNode.left);
                    }
                    if (currNode.right != null) {
                        q.add(currNode.right);
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        // int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        // BinaryTree tree = new BinaryTree();
        // Node root = tree.createNode(nodes);
        // System.out.println( root.data);
        // tree.preorder(root);System.out.println();
        // tree.postorder(root);System.out.println();
        // tree.inorder(root);System.out.println();
        // tree.levelorderTraversal(root);


        Node newtree = new Node(1);
        newtree.left = new Node(5);
        newtree.left.left = new Node(2);
        newtree.left.right = new Node(4);
        newtree.right = new Node(324);

        System.out.println(diameter(newtree).dia);
    }
}
