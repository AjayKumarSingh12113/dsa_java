package BinaryTrees;

import java.util.ArrayList;
import java.util.List;

public class BTrightSideView {
    static class TreeNode{
        int val;
        TreeNode left,right;
        public TreeNode(int k){
            this.val= k;
        }
    }
    public static List<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer> ans = new ArrayList<>();
        helper(root,ans,0);
        return ans;
    }
    public static void helper(TreeNode root,ArrayList<Integer> ans,int level){
        if(root == null){
            return ;
        }
        if(ans.size()==level){
            ans.add(root.val);
        }
        helper(root.right,ans,level+1);
        helper(root.left,ans,level+1);
    }
    public static void main(String[] args) {
        
    }
}
