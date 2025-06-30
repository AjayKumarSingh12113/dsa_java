package BitManupulation.BinaryTrees;

import java.util.ArrayList;
import java.util.List;


public class PostTraversal {
    static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        public TreeNode(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

    }
    public static List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> a = new ArrayList<>();
        postorder(root,a );
        return a;
    }

    public static void postorder(TreeNode root, List<Integer> a) {
        if (root == null) {
            return;
        }
        postorder(root.left, a);
        postorder(root.right, a);
        a.add(root.data);
    }
    public static void main(String[] args) {
        
    }
}
