package BitManupulation.BinarySearchTree;

import java.util.ArrayList;

public class MergeTWoBST {
    static class TreeNode{
        int val;
        TreeNode left , right;
        public TreeNode(int k){
            this.val =k;
        }
    }
    public static void inorder(TreeNode root,ArrayList<Integer> arr){
        if (root == null) {
            return ;
        }
        inorder(root.left, arr);
        arr.add(root.val);
        inorder(root.right, arr);
    }
    public static TreeNode createBST(ArrayList<Integer> finals , int st, int end){
        if (st>end) {
            return null;
        }
        int mid = (st+end)/2;
        TreeNode root = new TreeNode(finals.get(mid));
        root.left = createBST(finals, st, mid-1);
        root.right = createBST(finals, mid+1, end);
        return root;
    }
    public static TreeNode mergeBst(TreeNode root1,TreeNode root2){
        ArrayList<Integer> arr1 = new ArrayList<>();
        inorder(root1,arr1);
        ArrayList<Integer> arr2 = new ArrayList<>();
        inorder(root2,arr2);
        // merge
        int i=0,j=0;
        ArrayList<Integer> finalList = new ArrayList<>();
        while (i<arr1.size() && j<arr2.size()) {
            if (arr1.get(i)<=arr2.get(j)) {
                finalList.add(arr1.get(i));
                i++;
            }else{
                finalList.add(arr2.get(j));
                j++;
            }
        }
        while (i<arr1.size()) {
            finalList.add(arr1.get(i));
            i++;
        }
        while (j<arr2.size()) {
            finalList.add(arr2.get(j));
            j++;
        }

        // array to createBst
        return createBST(finalList,0,finalList.size()-1);
    }
    public static void preOrder(TreeNode root){
        if (root == null) {
            return ;
        }
        System.out.print(root.val+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(2);
        root1.left = new TreeNode(1);
        root1.right = new TreeNode(4);

        TreeNode root2 = new TreeNode(9);
        root2.left = new TreeNode(3);
        root2.right = new TreeNode(12);

        TreeNode x = mergeBst(root1, root2);
        preOrder(x);
    }
}
