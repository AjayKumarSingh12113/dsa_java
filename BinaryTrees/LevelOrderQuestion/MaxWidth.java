package BinaryTrees.LevelOrderQuestion;

import java.util.LinkedList;
import java.util.Queue;



public class MaxWidth {
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
    static class Info{
        TreeNode node ;
        int idx ;

        public Info(TreeNode n, int i){
            this.node = n;
            this.idx = i;
        }
    }
    public static int widthOfBinaryTree(TreeNode root) {
        if(root == null) return 0;
        Queue<Info> q = new LinkedList<>();
        int count =0;
        q.add(new Info(root,0));
        while(!q.isEmpty()){
            int size = q.size();
            Info st = q.peek();
            Info last=null;
            
            while(size-- >0){
                Info curr = q.remove();
                last = curr;
                int curridx = curr.idx;
                if(curr.node.left != null){
                    q.add(new Info(curr.node.left,2*curridx+1));
                }

                if(curr.node.right != null){
                    q.add(new Info(curr.node.right,2*curridx+2));
                }
            }
            count = Math.max(count , last.idx-st.idx +1);
            
        }
        return count;
    }
}
