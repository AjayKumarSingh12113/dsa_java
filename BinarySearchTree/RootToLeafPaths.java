package BinarySearchTree;

import java.util.ArrayList;

public class RootToLeafPaths {
    static class TreeNode {
        int val;
        TreeNode left, right;
        public TreeNode(int v) {
            this.val = v;
        }
    }

    // Function to print all root-to-leaf paths
    public static void paths(TreeNode root, ArrayList<Integer> path) {
        if (root == null) {
            return;
        }

        // Add current node to the path
        path.add(root.val);

        // If leaf node, print path
        if (root.left == null && root.right == null) {
            printAll(path);
        } else {
            // Recursively go to left and right subtrees
            paths(root.left, path);
            paths(root.right, path);
        }

        // Backtrack: Remove last added node before returning to previous level
        path.remove(path.size() - 1);
    }

    // Helper function to print a path
    public static void printAll(ArrayList<Integer> path) {
        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i) + " ");
        }
        System.out.println(); // Move to next line after printing a path
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(9);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(10);

        // Call function to print all root-to-leaf paths
        paths(root, new ArrayList<>());
    }
}
