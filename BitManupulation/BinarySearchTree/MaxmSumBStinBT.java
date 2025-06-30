package BitManupulation.BinarySearchTree;

public class MaxmSumBStinBT {
    static class TreeNode{
        int val;
        TreeNode left , right;
        public TreeNode(int k){
            this.val =k;
        }
    }
    static class Info{
        boolean isBst;
        int size,sum,min,max;
        public Info(boolean i, int sum,int s, int min ,int max){
            this.isBst = i;
            this.sum = sum;
            this.size=s;
            this.min = min;
            this.max=max;
        }
    }
    public static int maxsum =0;
    public static Info largestBst(TreeNode root){
        if (root == null) {
            return new Info(true,0, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
        }
        Info leftInfo = largestBst(root.left);
        Info rightInfo = largestBst(root.right);
        int size = leftInfo.size+rightInfo.size +1;
        int sum = leftInfo.sum + rightInfo.sum+ root.val;
        int min = Math.min(root.val,Math.min(leftInfo.min, rightInfo.min));
        int max = Math.max(root.val,Math.max(leftInfo.max,rightInfo.max));

        if (root.val <= leftInfo.max || root.val >= rightInfo.min) {
            return new Info(false,0, size, min, max);
        }

        if (leftInfo.isBst && rightInfo.isBst) {
            maxsum= Math.max(maxsum, sum);
            return new Info(true,sum, size, min, max);
        }
        return new Info(false,0, size, min, max);
    }
    public static int msum2 = 0;
    public static Info largestBst2(TreeNode root){
        if (root == null) {
            return new Info(true,0, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
        }
        Info leftInfo = largestBst2(root.left);
        Info rightInfo = largestBst2(root.right);
        int size = leftInfo.size+rightInfo.size +1;
        int sum = leftInfo.sum + rightInfo.sum+ root.val;
        int min = Math.min(root.val,Math.min(leftInfo.min, rightInfo.min));
        int max = Math.max(root.val,Math.max(leftInfo.max,rightInfo.max));

        // if (leftInfo.isBst && rightInfo.isBst && root.val>leftInfo.max && root.val < rightInfo.min) {
        //     maxsum2 = Math.max(maxsum2, sum);
        //     return new Info(true, sum, size, min, max);
        // }
        if (leftInfo.isBst && rightInfo.isBst && root.val > leftInfo.max && root.val < rightInfo.min) {
            msum2 = Math.max(msum2, sum); // Update maxSum if current BST has a larger sum
            return new Info(true, sum, size, min, max);
        }
        
        return new Info(false,0, size, min, max);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(50);
        root.left = new TreeNode(30);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(20);

        root.right= new TreeNode(60);
        root.right.left = new TreeNode(45);
        root.right.right = new TreeNode(70);
        root.right.right.left = new TreeNode(65);
        root.right.right.right = new TreeNode(80);

        largestBst(root);
        System.out.println(maxsum);
        largestBst2(root);
        System.out.println(msum2);
    }
}
