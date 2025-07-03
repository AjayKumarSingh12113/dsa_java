package BinarySearchTree;

public class ValidateBst {
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int v){
            this.val = v;
        }
    }
    public static boolean isValid(TreeNode root, TreeNode min,TreeNode max){
        if (root == null) {
            return true;
        }
        if (min != null && root.val <= min.val) {
            return false;
        }else if (max != null && root.val >= max.val) {
            return false;
        }
        return (isValid(root.left, min, root) && isValid(root.right, root, max));
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right= new TreeNode(9);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(6);//4
        root.right.left = new TreeNode(7);
        root.right.right= new TreeNode(10);
        System.out.println(isValid(root, null, null));
    }
}
