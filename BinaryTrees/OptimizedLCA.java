package BinaryTrees;

public class OptimizedLCA {
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
    public static TreeNode lca(TreeNode root, int n1 , int n2){
        if (root == null || root.val == n1 || root.val == n2 ) {
            return root;
        }
        TreeNode leftlca = lca(root.left, n1, n2);
        TreeNode rightlca = lca(root.right, n1, n2);

        if (rightlca == null) {// either rightlca ya leftlca are not null
            return leftlca;
        }
        if (leftlca == null) {
            return rightlca;
        }
        return root;// both are not null
    }
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q ) {
           return root;
       }
       TreeNode leftlca = lowestCommonAncestor(root.left, p, q);
       TreeNode rightlca = lowestCommonAncestor(root.right, p, q);

       if (rightlca == null) {// either rightlca ya leftlca are not null
           return leftlca;
       }
       if (leftlca == null) {
           return rightlca;
       }
       return root;// both are not null
   }
   public static int lcaDist(TreeNode root , int n){
    if (root == null) {
        return -1;
    }
    if (root.val == n) {
        return 0;
    }
    int leftdist = lcaDist(root.left, n);
    int rightdist = lcaDist(root.right, n);

    if (leftdist == -1 && rightdist == -1) {
        return -1;
    }else if (rightdist == -1) {
        return leftdist+1;
    }else{
        return rightdist+1;
    }
   }
   public static int minDis(TreeNode root , int n1,int n2){
        TreeNode lca = lca(root, n1, n2);
        int dist1 = lcaDist(lca,n1);
        int dist2 = lcaDist(lca,n2);
        return dist1+dist2;
   }
    
    
   
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(9);
        root.right= new TreeNode(5);
        root.left.left = new TreeNode(8);
        root.left.right = new TreeNode(3);
        root.right.right= new TreeNode(2);
        int n1 = 8 , n2 = 3;
        System.out.println(lca(root, n1, n2).val);
        System.out.println(minDis(root, n1, n2));
        //System.out.print(lowestCommonAncestor(root,new TreeNode(8),new TreeNode(6)));
        
    }


}
