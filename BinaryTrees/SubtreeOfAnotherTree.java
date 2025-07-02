package BinaryTrees;

public class SubtreeOfAnotherTree {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }
    public static boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null) {
            return false;
        }
        if (root.val == subRoot.val) {
            if (isIdentical(root, subRoot)) {
                return true;
            }
        }
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);

    }

    public static boolean isIdentical(TreeNode node, TreeNode subroot) {
        if (node == null && subroot == null) {
            return true;
        } else if (node == null || subroot == null || node.val != subroot.val) {
            return false;
        }
        if (!isIdentical(node.left, subroot.left)) {
            return false;
        }
        if (!isIdentical(node.right, subroot.right)) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        TreeNode subroot = new TreeNode(1);
        subroot.left = new TreeNode(2);
        subroot.right = new TreeNode(3);
        subroot.left.left = new TreeNode(6);

        System.out.println(isSubtree(root,subroot));
        
    }
}
