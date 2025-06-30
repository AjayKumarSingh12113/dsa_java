package BitManupulation.BinarySearchTree;

public class ArrToBalancedBst {
    static class TreeNode{
        int val;
        TreeNode left,right;
        public TreeNode(int v){
            this.val=v;
        }
    }
    public static TreeNode balancedBst(int[] nums, int start, int end){
        if(start>end){
            return null;
        }
        int mid = (start+end)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left=balancedBst(nums,start,mid-1);
        root.right = balancedBst(nums,mid+1,end);
        return root;
    }
    public static void preorder(TreeNode root){
        if (root == null) {
            return ;
        }
        System.out.print(root.val+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String[] args) {
        int arr[]={1,3,4,6,8,9,11,15};
        TreeNode root = balancedBst(arr, 0, arr.length-1);
        preorder(root);
    }
}
