package BitManupulation.BinaryTrees;

public class MergeTwoTrees {
    static class TreeNode{
        int val;
        TreeNode left,right;
        public TreeNode(int k){
            this.val= k;
        }
    }
    public static TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if(root1 == null && root2== null){
            return null;
        }else if(root1 == null){
            return root2;
        }else if(root2 == null){
            return root1;
        }// both are not null
        TreeNode root = new TreeNode(root1.val+root2.val);
        root.left = mergeTrees(root1.left,root2.left);
        root.right = mergeTrees(root1.right,root2.right);
        return root;
    }
    public static void main(String[] args) {
        
    }
}
