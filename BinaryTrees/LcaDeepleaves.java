package BinaryTrees;

import java.util.HashMap;

public class LcaDeepleaves {
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
    private int maxD;
    private HashMap<Integer,Integer> map = new HashMap<>();
    public TreeNode lcaDeepestLeaves(TreeNode root) {
        finddepth(root,0);
        return lca(root);
    }
    public  void finddepth(TreeNode root,int d){
        if(root == null) return ;

        maxD = Math.max(maxD,d);
        map.put(root.val,d);
        finddepth(root.left , d+1);
        finddepth(root.right, d+1);
    }
    public  TreeNode lca(TreeNode root){
        if(root == null || map.get(root.val) ==maxD ){
            return root;
        }

        TreeNode leftlca = lca(root.left);
        TreeNode rightlca = lca(root.right);

        if(leftlca == null){
            return rightlca;
        }
        if(rightlca == null){
            return leftlca;
        }

        return root;

    }
    public static void main(String[] args) {
        
    }
}
