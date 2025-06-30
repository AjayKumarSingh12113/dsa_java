package BitManupulation.BinarySearchTree;

public class MirrorBst {
    static class TreeNode{
        int val;
        TreeNode left,right;
        public TreeNode(int val){
            this.val = val;
        }
    }
    public static TreeNode invertTree(TreeNode root) {
        if(root == null ){
            return null;
        }
        TreeNode leftmirror = invertTree(root.left);
        TreeNode rightmirror = invertTree(root.right);

        root.left = rightmirror;
        root.right = leftmirror;
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
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right= new TreeNode(9);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(7);
        root.right.right= new TreeNode(10);
        preorder(root);
        System.out.println();
        TreeNode ms = invertTree(root);
        preorder(ms);
    }
}
