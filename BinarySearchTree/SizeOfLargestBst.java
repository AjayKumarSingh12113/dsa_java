package BinarySearchTree;
public class SizeOfLargestBst {
    static class TreeNode{
        int val;
        TreeNode left , right;
        public TreeNode(int k){
            this.val =k;
        }
    }
    static class Info{
        boolean isBst;
        int size,min,max;
        public Info(boolean i, int s, int min ,int max){
            this.isBst = i;
            this.size=s;
            this.min = min;
            this.max=max;
        }
    }
    public static int maxBst =0;
    public static Info largestBst(TreeNode root){
        if (root == null) {
            return new Info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
        }
        Info leftInfo = largestBst(root.left);
        Info rightInfo = largestBst(root.right);
        // for self info ke liye size , min or max chaiye
        int size = leftInfo.size+rightInfo.size +1;
        int min = Math.min(root.val,Math.min(leftInfo.min, rightInfo.min));
        int max = Math.max(root.val,Math.max(leftInfo.max,rightInfo.max));

        if (root.val <= leftInfo.max || root.val >= rightInfo.min) {
            return new Info(false, size, min, max);
        }

        if (leftInfo.isBst && rightInfo.isBst) {
            maxBst = Math.max(maxBst, size);
            return new Info(true, size, min, max);
        }
        return new Info(false, size, min, max);
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
        System.out.println("largest BST size is "+ maxBst);
        
    }

}
