package BitManupulation.BinaryTrees;

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
        Node lca = list1.get(i-1);
        return lca;


    }
    public static boolean getpaths(Node root, int n, ArrayList<Integer> path){
        if (root == null) {
            return false;
        }
        path.add(root.data);

        if (root.data == n) {
            return true;
        }

        boolean leftfound = getpaths(root.left, n, path);
        boolean rightfound = getpaths(root.right,n,path);

        if (leftfound || rightfound) {
            return true;
        }
        path.remove(path.size()-1);
        return false;
    }
    public static int lcarev(Node root, int n1, int n2){
        ArrayList<Integer> path1 = new ArrayList<>();
        ArrayList<Integer> path2 = new ArrayList<>();

        getpaths(root,n1,path1);
        getpaths(root, n2, path2);

        int i=0;
        for(;i<path1.size() && i<path2.size() ; i++){
            if(path1.get(i) != path2.get(i)){
                break;
            }
        }
        
        if (i-1 == -1) {
            return -1;
        }else{
            return path1.get(i-1);
        }
    }
    public static Node lcarev2(Node root,int n1,int n2){
        if (root == null) {
            return null;
        }
        if (root.data == n1 || root.data == n2) {
            return root;
        }
        Node leftNode = lcarev2(root.left , n1, n2);
        Node rightNode = lcarev2(root.right, n1,n2);

        if (rightNode == null) {
            return leftNode;
        }
        if (leftNode == null) {
            return rightNode;
        }
        return root;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(3);
        root.right= new Node(5);
        root.left.left = new Node(8);
        root.left.right = new Node(7);
        root.right.right= new Node(2);
        int n1 = 8 , n2 = 2;
        //System.out.println(lca(root, n1, n2).data);
        System.out.println(lcarev(root, n1, n2));
        System.out.println(lcarev2(root,n1,n2).data);
    }

}