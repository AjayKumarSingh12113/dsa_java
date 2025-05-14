package BinarySearchTree;

public class DeleteaNodeinBst {
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int v){
            this.val = v;
        }
    }
    public static TreeNode deleteNode(TreeNode root, int key) {
        // base case
        if (root == null) return null;
        //search the delete
        if(root.val > key){
            root.left = deleteNode(root.left,key);
        }else if(root.val < key){
            root.right = deleteNode(root.right,key);
        }else{// voila
            // case 1 leaf node delete
            if(root.left==null && root.right== null){
                return null;
            }
            // case -2 single child delete 
            if(root.left == null){
                return root.right;
            }else if(root.right == null){
                return root.left;
            }
            // case -3 both child delete 
            TreeNode is = findSuccesor(root.right);// find succesor jo right subtree me min node hoga on root.left
            root.val = is.val;// succesor ko root me dall liya  
            root.right = deleteNode(root.right,is.val);// fir succeror ko delete kr diya
        }
        return root;// sare change ke bad usi root ko delete kr diya 
    }
    public static TreeNode findSuccesor(TreeNode root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }
    public static void inorder(TreeNode root){
        if (root == null) {
            return ;
        }
        inorder(root.left);
        System.out.print(root.val+" ");
        inorder(root.right);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right= new TreeNode(9);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(7);
        root.right.right= new TreeNode(10);
        inorder(root);
        System.out.println();
        deleteNode(root, 5);
        inorder(root);
    }
}
