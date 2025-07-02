package BinaryTrees.LevelOrderQuestion;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Largestin_eachRow {
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
    public static List<Integer> largestValues(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root == null){
            return result;
        }
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            TreeNode curr = q.remove();
            if(curr == null){
                int max =Integer.MIN_VALUE;
                for(int data : list){
                    max = Math.max(max,data);
                }
                result.add(max);
                list.clear();
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                list.add(curr.val);
                if(curr.left != null){
                    q.add(curr.left);
                }
                if(curr.right != null){
                    q.add(curr.right);
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        
    }
}
