package BinarySearchTree;

public class PrintinRange {
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int v){
            this.val = v;
        }
    }
    public static void printinrange(TreeNode root, int k1 , int k2){
        if (root == null) {
            return;
        }
        if (root.val >= k1 && root.val <= k2) {
            printinrange(root.left, k1, k2);
            System.out.print(root.val+" ");
            printinrange(root.right, k1, k2);
        }else if (root.val<k1) {
            printinrange(root.left, k1, k2);
        }else{
            printinrange(root.right, k1, k2);
        }
    }
    public static int rangeSumBST(TreeNode root, int low, int high) {
        if(root == null){
            return 0;
        }
        if (root.val >= low && root.val <= high) {
            int s1 = rangeSumBST(root.left, low, high);
            int s2 = rangeSumBST(root.right, low, high);
            return root.val +s1 + s2;
        }
        else if(root.val>low){
            return rangeSumBST(root.left,low,high);
        }else{
            return rangeSumBST(root.right,low,high);
        }
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right= new TreeNode(9);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(7);
        root.right.right= new TreeNode(10);
        printinrange(root, 1, 10);
        System.out.println();
        System.out.println(rangeSumBST(root, 1, 10));
    }
}
