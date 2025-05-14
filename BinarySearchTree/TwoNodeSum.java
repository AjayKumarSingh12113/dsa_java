package BinarySearchTree;

import java.util.ArrayList;

public class TwoNodeSum {
    static class TreeNode{
        int val;
        TreeNode left , right;
        public TreeNode(int k){
            this.val =k;
        }
    }
    public static boolean findTarget(TreeNode root, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        inorder(root, list);
        int st =0, end = list.size()-1;
        while(st<end){
            int sum = list.get(st)+list.get(end);
            if(sum == k) return true;
            else if(sum<k) st++;
            else end--;
        }
        return false;
    }
    public static void inorder(TreeNode root, ArrayList<Integer> list){
        if(root == null){
            return ;
        }
        inorder(root.left,list);
        list.add(root.val);
        inorder(root.right,list);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right= new TreeNode(9);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(7);
        root.right.right= new TreeNode(10);
        System.out.println(findTarget(root, 9));
    }
}
