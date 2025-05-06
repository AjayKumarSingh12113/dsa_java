package BinaryTrees;

public class MaxPathSumx {
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int data) {
            this.val = data;
            this.left = null;
            this.right = null;
        }
        
    }

    static int maxSum;

    public static int maxPathSum(TreeNode root) {
        maxSum = Integer.MIN_VALUE;
        solve(root);

        return maxSum;

    }

    public static int solve(TreeNode root) {

        if (root == null) {
            return 0;
        }
        int leftsum = solve(root.left);
        int rightsum = solve(root.right);
        int Niche_hi_mill_gya = leftsum + rightsum + root.val;
        int koi_ek_acha = Math.max(rightsum, leftsum) + root.val;
        int only_root = root.val;
        maxSum = Math.max(maxSum, Math.max(Math.max(only_root, koi_ek_acha), Niche_hi_mill_gya));
        return Math.max(koi_ek_acha, only_root);
    }

    public static void main(String[] args) {
        //MaxPathSumx tree = new MaxPathSumx();

        // Create a sample tree
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(2);
        root.right = new TreeNode(10);
        root.left.left = new TreeNode(20);
        root.left.right = new TreeNode(1);
        root.right.right = new TreeNode(-25);
        root.right.right.left = new TreeNode(3);
        root.right.right.right = new TreeNode(4);
        System.out.println(maxPathSum(root));

        // Calculate max path sum
        //System.out.println("Maximum Path Sum: " + tree.maxPathSum(root));
    }
}
