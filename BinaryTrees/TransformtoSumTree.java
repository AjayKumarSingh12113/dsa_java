package BinaryTrees;

public class TransformtoSumTree {
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int d){
            this.val = d;
            this.left = null;
            this.right = null;
        }
    }
    public static int sumtree(TreeNode root){
        if (root == null) {
            return 0;
        }
        int leftsum = sumtree(root.left);
        int rightsum = sumtree(root.right);
        return leftsum + rightsum + root.val; 
    }
    public static int sumTrees(TreeNode root){
        if (root == null) {
            return 0;
        }
        int leftchild = sumTrees(root.left);
        int rightchild = sumTrees(root.right);
        int data = root.val;
        int newleft = root.left == null ? 0:root.left.val;
        int newright = root.right == null ? 0: root.right.val;
        root.val = leftchild+newleft + newright+ rightchild;
        return data; 
    }
    private static void preorder(TreeNode root){
        if (root == null) {
            return ;
        }
        System.out.print(root.val+" ");
        preorder(root.left);
        preorder(root.right);
    } 
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(9);
        root.right= new TreeNode(5);
        root.left.left = new TreeNode(8);
        root.left.right = new TreeNode(3);
        root.right.right= new TreeNode(2);
        System.out.println(sumtree(root.left.left));
        sumTrees(root);
        preorder(root);
    }
}
