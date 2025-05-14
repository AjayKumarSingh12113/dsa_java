package BinarySearchTree;

public class InsertAnodeinBst {
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int v){
            this.val = v;
        }
    }
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null){
            TreeNode ans = new TreeNode(val);
            return ans;
        }
        if(root.val>val){
            root.left= insertIntoBST(root.left,val);
        }else{
            root.right = insertIntoBST(root.right,val);
        }
        return root;
    }
    public static void main(String[] args) {
        
    }
}
