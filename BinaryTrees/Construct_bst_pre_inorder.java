package BinaryTrees;

public class Construct_bst_pre_inorder {
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
    static int idx =0;
    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = preorder.length;
        return solve(preorder,inorder,0,n-1);
    }
    public static  TreeNode solve(int[] preorder, int[] inorder,int start,int end){
        if(start > end){
            return null;
        }
        int rootVal = preorder[idx];
        idx++;
        
        TreeNode root = new TreeNode(rootVal);
        int i = start;
        for(; i<inorder.length; i++){
            if(inorder[i]==rootVal){
                break;
            }
        }
        root.left = solve(preorder,inorder,start,i-1);
        root.right = solve(preorder,inorder,i+1,end);
        return root;
    }
    public static void main(String[] args) {
        int[] preorder = {3, 9, 20, 15, 7};
        int[] inorder = {9, 3, 15, 20, 7};
        TreeNode root = buildTree(preorder, inorder);
        System.out.println(root.val);

    }
}
