package BinarySearchTree;



public class CreateBst {
    static class TreeNode {
        int val ;
        TreeNode left,right;
        public TreeNode(int v){
            this.val = v;
        }
    }
    public static TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root = null;
        for(int i=0; i<preorder.length; i++){
            root = createbst(root,preorder[i]);
        }
        return root;
    }
    public static TreeNode createbst(TreeNode root,int val){
        if(root == null){
            root = new TreeNode(val);
            return root;
        }

        if(val<root.val){
            root.left = createbst(root.left,val);
        }else{
            root.right = createbst(root.right,val);
        }
        return root;
    }
    public static void print(TreeNode root){
        if (root == null) {
            return ;
        }
        print(root.left);
        System.out.print(root.val+" ");
        print(root.right);
    }
    public static void main(String[] args) {
        int preorder[] = {5,2,3,4,7,8};
        TreeNode root = bstFromPreorder(preorder);

        print(root);
        System.out.println();
    }
}
