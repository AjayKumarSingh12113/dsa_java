package BinarySearchTree;

public class DeepestLeafSum {
    static class TreeNode{
        int val;
        TreeNode left,right;
        public TreeNode(int v){
            this.val=v;
        }
    }
    int sum =0;
    public int height(TreeNode root){
        if(root == null){
            return 0;
        }
        int lt = height(root.left);
        int rt= height(root.right);
        return (Math.max(lt,rt)+1);
    }
    public int deepestLeavesSum(TreeNode root) {
        int h = height(root);
        helper(root,h);
        return sum;
    }
    public  void helper(TreeNode root,int height){
        if(root == null){
            return ;
        }
        if(height==1){
            sum = sum + root.val;
        }
        helper(root.left,height-1);
        helper(root.right,height-1);
    }
    public static void main(String[] args) {
        
    }
}
