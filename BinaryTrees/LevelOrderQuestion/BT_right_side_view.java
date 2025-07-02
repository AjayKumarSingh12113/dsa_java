package BinaryTrees.LevelOrderQuestion;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BT_right_side_view {
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
    public static List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result; 
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        
        while(!q.isEmpty()){
            int size = q.size();
            TreeNode rightmost = null;
            while(size-- != 0){
                
                TreeNode curr = q.remove();
                rightmost = curr;
                if(curr.left != null){
                    q.add(curr.left);
                }

                if(curr.right != null){
                    q.add(curr.right);
                }
            }
            result.add(rightmost.val);
        }
        return result;
    }
    public static void main(String[] args) {
        
    }
}
