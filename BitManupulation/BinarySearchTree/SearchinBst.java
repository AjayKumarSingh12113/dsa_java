package BitManupulation.BinarySearchTree;



public class SearchinBst {
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int v){
            this.val = v;
        }
    }
     public static TreeNode searchBST(TreeNode root, int val) {
        TreeNode temp = root;
        while(temp != null){
            if(temp.val == val){
                break;
            }else if(temp.val>val){
                temp=temp.left;
            }else{
                temp = temp.right;
            }
        }
        return temp;
    }
    public static void main(String[] args) {
        
    }
}
