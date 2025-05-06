package BinaryTrees;

import java.util.ArrayList;

public class LowestCommonAncestor {
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int d){
            this.data = d;
            this.left = null;
            this.right = null;
        }
    }
    public static boolean getpath(Node root, int n , ArrayList<Node> path){
        // base case
        if (root == null) {
            return false;
        }
        path.add(root);
        if (root.data == n) {
            return true;
        }
        boolean foundleft = getpath(root.left, n, path);
        boolean foundright = getpath(root.right, n, path);
        if (foundleft || foundright) {
            return true;
        }//else
        path.remove(path.size()-1);// last index
        return false;

    }
    public static Node lca(Node root, int n1 , int n2){
        ArrayList<Node> list1 = new ArrayList<>();
        ArrayList<Node> list2 = new ArrayList<>();

        getpath(root,n1 , list1);
        getpath(root,n2, list2);

        int i=0;
        for(; i<list1.size() && i<list2.size();i++){
            if (list1.get(i) != list2.get(i)) {
                break;
            }
        }
        Node lca = list1.get(i);
        return lca;


    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(3);
        root.right= new Node(5);
        root.left.left = new Node(8);
        root.left.right = new Node(3);
        root.right.right= new Node(2);
        int n1 = 8 , n2 = 6;
        System.out.println(lca(root, n1, n2).data);
    }

}