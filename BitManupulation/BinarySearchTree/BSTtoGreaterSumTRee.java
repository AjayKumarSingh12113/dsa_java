package BitManupulation.BinarySearchTree;

public class BSTtoGreaterSumTRee {
    static class TreeNode{
        int val;
        TreeNode left,right;
        public TreeNode(int v){
            this.val=v;
        }
    }
    static int  sum =0;
    public static TreeNode bstToGst(TreeNode root) {
        helper(root);
        return root;
    }
    public static void helper(TreeNode root){
        if(root == null){
            return ;
        }
        helper(root.right);
        sum = sum + root.val;
        root.val = sum;
        helper(root.left);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right= new TreeNode(9);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(7);
        root.right.right= new TreeNode(10);
        bstToGst(root);
    }
}
