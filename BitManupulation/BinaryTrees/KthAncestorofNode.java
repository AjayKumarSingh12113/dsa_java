package BitManupulation.BinaryTrees;

public class KthAncestorofNode {
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
    public static int kthAncestor(TreeNode root,int n, int k){
        if (root == null) {
            return -1;
        }
        if (root.val == n) {
            return 0;
        }
        int leftdist = kthAncestor(root.left, n, k);
        int rightdist = kthAncestor(root.right, n, k);
        if (leftdist == -1 && rightdist == -1) {
            return -1;
        }
        int max = Math.max(leftdist, rightdist);
        if (max+1 == k) {
            System.out.println(root.val);
        }
        return max+1;
    }
    
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(9);
        root.right= new TreeNode(5);
        root.left.left = new TreeNode(8);
        root.left.right = new TreeNode(3);
        root.right.right= new TreeNode(2);
        int n1 = 8 , k = 2;
        kthAncestor(root, n1, k);
        
    }
}
