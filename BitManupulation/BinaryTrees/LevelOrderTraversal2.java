package BitManupulation.BinaryTrees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversal2 {
    static class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
     public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null){
            return ans;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size =q.size();// 1,2
            List<Integer> l = new LinkedList<>();
            for(int i=0; i<size; i++){
                TreeNode currNode = q.remove();
                l.add(currNode.val); //{3} ,{9,20}

                if (currNode.left != null) {
                    q.add(currNode.left);
                }
                if (currNode.right != null) {
                    q.add(currNode.right);
                }
            }
            ans.add(l);
        }
        return ans;
        
    }

    public static void main(String[] args) {
        // Example Tree:
        // 3
        // / \
        // 9 20
        // / \
        // 15 7

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20, new TreeNode(15), new TreeNode(7));
        LevelOrderTraversal2 sol = new LevelOrderTraversal2();
        List<List<Integer>> result = sol.levelOrder(root);
        System.out.println(result);
        
    }
}
