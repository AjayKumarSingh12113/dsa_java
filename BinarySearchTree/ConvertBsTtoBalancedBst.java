package BinarySearchTree;

import java.util.ArrayList;

public class ConvertBsTtoBalancedBst {
    static class TreeNode{
        int val;
        TreeNode left,right;
        public TreeNode(int v){
            this.val=v;
        }
    }
    public static TreeNode balanceBST(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        inorder(root,list);

        return balanced(list,0,list.size()-1);

    }
    public static void inorder(TreeNode root ,ArrayList<Integer> list){
        if(root == null){
            return ;
        }
        inorder(root.left,list);
        list.add(root.val);
        inorder(root.right,list);
    }
    public static TreeNode balanced(ArrayList<Integer> list,int st,int end){
        if(st>end){
            return null;
        }
        int mid = (st+end)/2;
        TreeNode root = new TreeNode(list.get(mid));
        root.left = balanced(list,st,mid-1);
        root.right = balanced(list,mid+1,end);
        return root;
    }
    public static void preorder(TreeNode root){
        if (root == null) {
            return ;
        }
        System.out.print(root.val+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.left.left = new TreeNode(2);
        root.left.left.left = new TreeNode(1);
        root.left.right = new TreeNode(7);
        root.right = new TreeNode(15);
        root.right.right = new TreeNode(20);
        preorder(root);
        System.out.println();
        TreeNode x =balanceBST(root);
        preorder(x);
    }
}
