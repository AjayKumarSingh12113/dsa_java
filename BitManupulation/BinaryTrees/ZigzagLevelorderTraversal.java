package BitManupulation.BinaryTrees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ZigzagLevelorderTraversal {
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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null){
            return ans;
        }
        List<Integer> currAns = new ArrayList<>();
        Stack<TreeNode> main = new Stack<>();
        Stack<TreeNode> helper = new Stack<>();
        main.push(root);
        int level =0;
        while(main.size()>0){
            TreeNode curr = main.pop();
            currAns.add(curr.val);
            if(level == 0){
                if(curr.left != null){
                    helper.push(curr.left);
                }
                if(curr.right != null){
                    helper.push(curr.right);
                }
            }else{
                if(curr.right != null){
                    helper.push(curr.right);
                }
                if(curr.left != null){
                    helper.push(curr.left);
                }
            }
            if(main.size()==0){
                ans.add(currAns);
                currAns= new ArrayList<>();
                level = 1-level;

                main = helper;
                helper = new Stack<>();
            }
        }
        return ans;
        
    }
    public static void main(String[] args) {
        
    }
}
