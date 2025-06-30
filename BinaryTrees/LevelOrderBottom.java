package BinaryTrees;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderBottom {
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
    public static List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
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
                result.add(new ArrayList<>(list));
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
        Collections.reverse(result);
        return result;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(10);
        root.left.left = new TreeNode(19);
        root.left.right = new TreeNode(88);
        root.right.right = new TreeNode(20);
        root.right.left = new TreeNode(10);
        List<List<Integer>> result = levelOrderBottom(root);

        for (List<Integer> level : result) {
            for (int val : level) {
                System.out.print(val + " ");
            }
            System.out.println();  // next level
        }

    }
}
