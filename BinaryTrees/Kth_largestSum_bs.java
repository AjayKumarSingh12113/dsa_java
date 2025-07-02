package BinaryTrees;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Kth_largestSum_bs {
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
    public static long kthLargestLevelSum(TreeNode root, int k) {
        PriorityQueue<Long> pq = new PriorityQueue<>(Comparator.reverseOrder());
         Queue<TreeNode> q = new LinkedList<>();
        if(root == null){
            return 0;
        }
        q.add(root);
        long ans =0;
        while(!q.isEmpty()){
            int size = q.size();
            long levelsum =0;
            while(size-- >0){
                TreeNode curr = q.remove();
                levelsum += curr.val;

                if(curr.left != null){
                    q.add(curr.left);
                }
                if(curr.right != null){
                    q.add(curr.right);
                }
            }
            pq.add(levelsum);

        }
        if (pq.size() < k) return -1;
        while(k-- >0){
            ans = pq.remove();
        }
        return ans;
    }
    public static void main(String[] args) {
         TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(10);
        root.left.left = new TreeNode(19);
        root.left.right = new TreeNode(88);
        root.right.right = new TreeNode(20);
        root.right.left = new TreeNode(10);
        System.out.println(kthLargestLevelSum(root, 0));
    }
}
